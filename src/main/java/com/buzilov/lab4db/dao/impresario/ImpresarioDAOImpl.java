package com.buzilov.lab4db.dao.impresario;

import com.buzilov.lab4db.datastorage.DataStorageFake;
import com.buzilov.lab4db.model.Impresario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ImpresarioDAOImpl implements ImpresarioDAO{
    @Autowired
    DataStorageFake dataStorage;

    @Override
    public Impresario insertImpresario(Impresario impresario) {
        dataStorage.getImpresarios().add(impresario);
        return impresario;
    }

    @Override
    public Impresario getImpresario(int id) {
        return dataStorage.getImpresarios().stream()
                .filter(el -> el.getId() == id)
                .findFirst().orElse(null);
    }

    @Override
    public Impresario updateImpresario(Impresario impresario) {
        for(Impresario a: dataStorage.getImpresarios())
        {
            if(a.getId() == impresario.getId())
            {
                a.setName(impresario.getName());
                a.setGenres(impresario.getGenres());
                break;
            }
        }
        return impresario;
    }

    @Override
    public Impresario deleteImpresario(int id) {
        Impresario impresario = dataStorage.getImpresarios()
                .stream()
                .filter(el -> el.getId() == id)
                .findFirst()
                .get();
        dataStorage.getImpresarios().remove(impresario);
        return impresario;
    }

    @Override
    public List<Impresario> getAll() {
        return dataStorage.getImpresarios();
    }
}
