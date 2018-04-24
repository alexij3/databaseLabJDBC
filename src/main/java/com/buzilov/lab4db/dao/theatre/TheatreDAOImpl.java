package com.buzilov.lab4db.dao.theatre;

import com.buzilov.lab4db.datastorage.DataStorageFake;
import com.buzilov.lab4db.datastorage.DataStorageJdbc;
import com.buzilov.lab4db.model.Theatre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TheatreDAOImpl implements TheatreDAO {
    @Autowired
    DataStorageFake dataStorage;

    @Autowired
    DataStorageJdbc dataStorageJdbc;

    @Override
    public Theatre insertTheatre(Theatre theatre) {
        dataStorage.getTheatres().add(theatre);
        return theatre;
    }

    @Override
    public Theatre getTheatre(int id) {
        return dataStorage.getTheatres().stream()
                .filter(el -> el.getId() == id)
                .findFirst().orElse(null);
    }

    @Override
    public Theatre updateTheatre(Theatre theatre) {
        for(Theatre t: dataStorage.getTheatres())
        {
            if(t.getId() == t.getId())
            {
                t.setName(t.getName());
                t.setAddress(t.getAddress());
                t.setCapacity(t.getCapacity());
                break;
            }
        }
        return theatre;
    }

    @Override
    public Theatre deleteTheatre(int id) {
        Theatre theatre = dataStorage.getTheatres()
                .stream()
                .filter(el -> el.getId() == id)
                .findFirst()
                .get();
        dataStorage.getTheatres().remove(theatre);
        return theatre;
    }

    @Override
    public List<Theatre> getAll() {
        return dataStorage.getTheatres();
    }
}
