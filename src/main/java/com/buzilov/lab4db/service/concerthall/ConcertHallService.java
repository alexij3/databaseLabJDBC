package com.buzilov.lab4db.service.concerthall;

import com.buzilov.lab4db.model.ConcertHall;

import java.util.List;

public interface ConcertHallService {
    ConcertHall insertConcertHall(ConcertHall concertHall);
    ConcertHall getConcertHall(int id);
    ConcertHall updateConcertHall(ConcertHall concertHall);
    ConcertHall deleteConcertHall(int id);
    List<ConcertHall> getAll();
}
