package com.buzilov.lab4db.dao.concertinhall;

import com.buzilov.lab4db.model.ConcertInHall;

import java.util.List;

public interface ConcertInHallDAO {
    ConcertInHall insertConcertInHall(ConcertInHall concertInHall);
    ConcertInHall getConcertInHall(int id);
    ConcertInHall updateConcertInHall(ConcertInHall concertInHall);
    ConcertInHall deleteConcertInHall(int id);
    List<ConcertInHall> getAll();
}
