package com.buzilov.lab4db.service.cinemamovie;

import com.buzilov.lab4db.dao.cinemamovie.CinemaMovieDAOImpl;
import com.buzilov.lab4db.model.CinemaMovie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaMovieServiceImpl implements CinemaMovieService{
    @Autowired
    CinemaMovieDAOImpl cinemaMovieDAO;

    @Override
    public CinemaMovie insertCinemaMovie(CinemaMovie cinemaMovie) {
        return cinemaMovieDAO.insertCinemaMovie(cinemaMovie);
    }

    @Override
    public CinemaMovie getCinemaMovie(int id) {
        return cinemaMovieDAO.getCinemaMovie(id);
    }

    @Override
    public CinemaMovie updateCinemaMovie(CinemaMovie cinemaMovie) {
        return cinemaMovieDAO.updateCinemaMovie(cinemaMovie);
    }

    @Override
    public CinemaMovie deleteCinemaMovie(int id) {
        return cinemaMovieDAO.deleteCinemaMovie(id);
    }

    @Override
    public List<CinemaMovie> getAll() {
        return cinemaMovieDAO.getAll();
    }
}
