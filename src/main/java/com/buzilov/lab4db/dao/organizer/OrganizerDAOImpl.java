package com.buzilov.lab4db.dao.organizer;

import com.buzilov.lab4db.datastorage.DataStorageFake;
import com.buzilov.lab4db.datastorage.DataStorageJdbc;
import com.buzilov.lab4db.model.Organizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrganizerDAOImpl implements OrganizerDAO {
    @Autowired
    DataStorageFake dataStorage;

    @Autowired
    DataStorageJdbc dataStorageJdbc;

    @Override
    public Organizer insertOrganizer(Organizer organizer) {
        dataStorage.getOrganizers().add(organizer);
        return organizer;
    }

    @Override
    public Organizer getOrganizer(int id) {
        return dataStorage.getOrganizers().stream()
                .filter(el -> el.getId() == id)
                .findFirst().orElse(null);
    }

    @Override
    public Organizer updateOrganizer(Organizer organizer) {
        for(Organizer a: dataStorage.getOrganizers())
        {
            if(a.getId() == organizer.getId())
            {
                a.setName(organizer.getName());
                break;
            }
        }
        return organizer;
    }

    @Override
    public Organizer deleteOrganizer(int id) {
        Organizer organizer = dataStorage.getOrganizers()
                .stream()
                .filter(el -> el.getId() == id)
                .findFirst()
                .get();
        dataStorage.getOrganizers().remove(organizer);
        return organizer;
    }

    @Override
    public List<Organizer> getAll() {
        return dataStorage.getOrganizers();
    }
}
