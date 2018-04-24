package com.buzilov.lab4db.dao.concerthall;

import com.buzilov.lab4db.model.ConcertHall;

import java.util.List;

public interface ConcertHallDAO {
    ConcertHall insertConcertHall(ConcertHall concertHall);
    ConcertHall getConcertHall(int id);
    ConcertHall updateConcertHall(ConcertHall concertHall);
    ConcertHall deleteConcertHall(int id);
    List<ConcertHall> getAll();
}
