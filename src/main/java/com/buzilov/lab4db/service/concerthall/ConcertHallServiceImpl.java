package com.buzilov.lab4db.service.concerthall;

import com.buzilov.lab4db.dao.concerthall.ConcertHallDAOImpl;
import com.buzilov.lab4db.model.ConcertHall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConcertHallServiceImpl implements ConcertHallService{
    @Autowired
    ConcertHallDAOImpl concertHallDAO;

    @Override
    public ConcertHall insertConcertHall(ConcertHall concertHall) {
        return concertHallDAO.insertConcertHall(concertHall);
    }

    @Override
    public ConcertHall getConcertHall(int id) {
        return concertHallDAO.getConcertHall(id);
    }

    @Override
    public ConcertHall updateConcertHall(ConcertHall concertHall) {
        return concertHallDAO.updateConcertHall(concertHall);
    }

    @Override
    public ConcertHall deleteConcertHall(int id) {
        return concertHallDAO.deleteConcertHall(id);
    }

    @Override
    public List<ConcertHall> getAll() {
        return concertHallDAO.getAll();
    }
}
