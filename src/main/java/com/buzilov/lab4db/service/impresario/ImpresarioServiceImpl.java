package com.buzilov.lab4db.service.impresario;

import com.buzilov.lab4db.dao.impresario.ImpresarioDAOImpl;
import com.buzilov.lab4db.model.Impresario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpresarioServiceImpl implements ImpresarioService {
    @Autowired
    ImpresarioDAOImpl impresarioDAO;

    @Override
    public Impresario insertImpresario(Impresario impresario) {
        return impresarioDAO.insertImpresario(impresario);
    }

    @Override
    public Impresario getImpresario(int id) {
        return impresarioDAO.getImpresario(id);
    }

    @Override
    public Impresario updateImpresario(Impresario impresario) {
        return impresarioDAO.updateImpresario(impresario);
    }

    @Override
    public Impresario deleteImpresario(int id) {
        return impresarioDAO.deleteImpresario(id);
    }

    @Override
    public List<Impresario> getAll() {
        return impresarioDAO.getAll();
    }
}
