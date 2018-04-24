package com.buzilov.lab4db.dao.cinemamovie;

import com.buzilov.lab4db.model.CinemaMovie;

import java.util.List;

public interface CinemaMovieDAO {
    CinemaMovie insertCinemaMovie(CinemaMovie cinemaMovie);
    CinemaMovie getCinemaMovie(int id);
    CinemaMovie updateCinemaMovie(CinemaMovie cinemaMovie);
    CinemaMovie deleteCinemaMovie(int id);
    List<CinemaMovie> getAll();
}
