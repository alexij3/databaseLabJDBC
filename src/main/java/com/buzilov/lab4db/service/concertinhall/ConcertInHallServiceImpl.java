package com.buzilov.lab4db.service.concertinhall;

import com.buzilov.lab4db.dao.concertinhall.ConcertInHallDAO;
import com.buzilov.lab4db.model.ConcertInHall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConcertInHallServiceImpl implements ConcertInHallService {
    @Autowired
    ConcertInHallDAO concertInHallDAO;

    @Override
    public ConcertInHall insertConcertInHall(ConcertInHall concertInHall) {
        return concertInHallDAO.insertConcertInHall(concertInHall);
    }

    @Override
    public ConcertInHall getConcertInHall(int id) {
        return concertInHallDAO.getConcertInHall(id);
    }

    @Override
    public ConcertInHall updateConcertInHall(ConcertInHall concertInHall) {
        return concertInHallDAO.updateConcertInHall(concertInHall);
    }

    @Override
    public ConcertInHall deleteConcertInHall(int id) {
        return concertInHallDAO.deleteConcertInHall(id);
    }

    @Override
    public List<ConcertInHall> getAll() {
        return concertInHallDAO.getAll();
    }
}
