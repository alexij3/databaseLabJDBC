package com.buzilov.lab4db.dao.culturepalace;

import com.buzilov.lab4db.datastorage.DataStorageFake;
import com.buzilov.lab4db.datastorage.DataStorageJdbc;
import com.buzilov.lab4db.model.CulturePalace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CulturePalaceDAOImpl implements CulturePalaceDAO {
    @Autowired
    DataStorageFake dataStorage;

    @Autowired
    DataStorageJdbc dataStorageJdbc;

    @Override
    public CulturePalace insertCulturePalace(CulturePalace culturePalace) {
        dataStorage.getCulturePalaces().add(culturePalace);
        return culturePalace;
    }

    @Override
    public CulturePalace getCulturePalace(int id) {
        return dataStorage.getCulturePalaces().stream()
                .filter(el -> el.getId() == id)
                .findFirst().orElse(null);
    }

    @Override
    public CulturePalace updateCulturePalace(CulturePalace culturePalace) {
        for(CulturePalace palace: dataStorage.getCulturePalaces())
        {
            if(palace.getId() == culturePalace.getId())
            {
                palace.setName(culturePalace.getName());
                palace.setAddress(culturePalace.getAddress());
                palace.setCapacity(culturePalace.getCapacity());
                break;
            }
        }
        return culturePalace;
    }

    @Override
    public CulturePalace deleteCulturePalace(int id) {
        CulturePalace culturePalace = dataStorage.getCulturePalaces()
                .stream()
                .filter(el -> el.getId() == id)
                .findFirst()
                .get();
        dataStorage.getCulturePalaces().remove(culturePalace);
        return culturePalace;
    }

    @Override
    public List<CulturePalace> getAll() {
        return dataStorage.getCulturePalaces();
    }
}
