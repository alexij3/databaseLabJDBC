package com.buzilov.lab4db.service.cinema;

import com.buzilov.lab4db.dao.cinema.CinemaDAOImpl;
import com.buzilov.lab4db.model.Cinema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaServiceImpl implements CinemaService {
    @Autowired
    CinemaDAOImpl cinemaDAO;

    @Override
    public Cinema insertCinema(Cinema cinema) {
        return cinemaDAO.insertCinema(cinema);
    }

    @Override
    public Cinema getCinema(int id) {
        return cinemaDAO.getCinema(id);
    }

    @Override
    public Cinema updateCinema(Cinema cinema) {
        return cinemaDAO.updateCinema(cinema);
    }

    @Override
    public Cinema deleteCinema(int id) {
        return cinemaDAO.deleteCinema(id);
    }

    @Override
    public List<Cinema> getAll() {
        return cinemaDAO.getAll();
    }
}
