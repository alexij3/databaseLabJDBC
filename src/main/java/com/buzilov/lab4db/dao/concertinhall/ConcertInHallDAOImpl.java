package com.buzilov.lab4db.dao.concertinhall;

import com.buzilov.lab4db.datastorage.DataStorageFake;
import com.buzilov.lab4db.model.ConcertInHall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConcertInHallDAOImpl implements ConcertInHallDAO {
    @Autowired
    DataStorageFake dataStorage;

    @Override
    public ConcertInHall insertConcertInHall(ConcertInHall concertInHall) {
        dataStorage.getConcertsInHall().add(concertInHall);
        return concertInHall;
    }

    @Override
    public ConcertInHall getConcertInHall(int id) {
        return dataStorage.getConcertsInHall().stream()
                .filter(el -> el.getId() == id)
                .findFirst().orElse(null);
    }

    @Override
    public ConcertInHall updateConcertInHall(ConcertInHall concertInHall) {
        for(ConcertInHall cm: dataStorage.getConcertsInHall())
        {
            if(cm.getId() == concertInHall.getId())
            {
                cm.setName(concertInHall.getName());
                cm.setConcertHall(concertInHall.getConcertHall());
                cm.setOrganizer(concertInHall.getOrganizer());
                cm.setDate(concertInHall.getDate());
                break;
            }
        }
        return concertInHall;
    }

    @Override
    public ConcertInHall deleteConcertInHall(int id) {
        ConcertInHall concertInHall = dataStorage.getConcertsInHall()
                .stream()
                .filter(el -> el.getId() == id)
                .findFirst()
                .get();
        dataStorage.getArtists().remove(concertInHall);
        return concertInHall;
    }

    @Override
    public List<ConcertInHall> getAll() {
        return dataStorage.getConcertsInHall();
    }
}
