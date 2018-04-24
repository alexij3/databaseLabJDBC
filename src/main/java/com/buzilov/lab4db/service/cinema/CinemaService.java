package com.buzilov.lab4db.service.cinema;

import com.buzilov.lab4db.model.Cinema;

import java.util.List;

public interface CinemaService {
    Cinema insertCinema(Cinema cinema);
    Cinema getCinema(int id);
    Cinema updateCinema(Cinema cinema);
    Cinema deleteCinema(int id);
    List<Cinema> getAll();
}
