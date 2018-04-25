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
        return null;
    }

    @Override
    public ConcertHall getConcertHall(int id) {
        return null;
    }

    @Override
    public ConcertHall updateConcertHall(ConcertHall concertHall) {
        return null;
    }

    @Override
    public void deleteConcertHall(int id) {

    }

    @Override
    public List<ConcertHall> getAll() {
        return null;
    }
}
