package com.buzilov.lab4db.dao.concerthall;

import com.buzilov.lab4db.datastorage.DataStorageFake;
import com.buzilov.lab4db.datastorage.DataStorageJdbc;
import com.buzilov.lab4db.model.ConcertHall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConcertHallDAOImpl implements ConcertHallDAO {
    @Autowired
    DataStorageFake dataStorage;

    @Autowired
    DataStorageJdbc dataStorageJdbc;

    @Override
    public ConcertHall insertConcertHall(ConcertHall concertHall) {
        dataStorage.getConcertHalls().add(concertHall);
        return concertHall;
    }

    @Override
    public ConcertHall getConcertHall(int id) {
        return dataStorage.getConcertHalls().stream()
                .filter(el -> el.getId() == id)
                .findFirst().orElse(null);
    }

    @Override
    public ConcertHall updateConcertHall(ConcertHall concertHall) {
        for(ConcertHall hall: dataStorage.getConcertHalls())
        {
            if(hall.getId() == concertHall.getId())
            {
                hall.setName(concertHall.getName());
                hall.setAddress(concertHall.getAddress());
                hall.setCapacity(concertHall.getCapacity());
                break;
            }
        }
        return concertHall;
    }

    @Override
    public ConcertHall deleteConcertHall(int id) {
        ConcertHall concertHall = dataStorage.getConcertHalls()
                .stream()
                .filter(el -> el.getId() == id)
                .findFirst()
                .get();
        dataStorage.getConcertHalls().remove(concertHall);
        return concertHall;
    }

    @Override
    public List<ConcertHall> getAll() {
        return dataStorage.getConcertHalls();
    }
}
