package com.buzilov.lab4db.service.concertinhall;

import com.buzilov.lab4db.model.ConcertInHall;

import java.util.List;

public interface ConcertInHallService {
    ConcertInHall insertConcertInHall(ConcertInHall concertInHall);
    ConcertInHall getConcertInHall(int id);
    ConcertInHall updateConcertInHall(ConcertInHall concertInHall);
    ConcertInHall deleteConcertInHall(int id);
    List<ConcertInHall> getAll();
}
