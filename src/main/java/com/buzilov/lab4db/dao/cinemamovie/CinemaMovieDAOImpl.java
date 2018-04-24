package com.buzilov.lab4db.dao.cinemamovie;

import com.buzilov.lab4db.datastorage.DataStorageFake;
import com.buzilov.lab4db.model.CinemaMovie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CinemaMovieDAOImpl implements CinemaMovieDAO {
    @Autowired
    DataStorageFake dataStorage;

    @Override
    public CinemaMovie insertCinemaMovie(CinemaMovie cinemaMovie) {
        dataStorage.getCinemaMovies().add(cinemaMovie);
        return cinemaMovie;
    }

    @Override
    public CinemaMovie getCinemaMovie(int id) {
        return dataStorage.getCinemaMovies().stream()
                .filter(el -> el.getId() == id)
                .findFirst().orElse(null);
    }

    @Override
    public CinemaMovie updateCinemaMovie(CinemaMovie cinemaMovie) {
        for(CinemaMovie cm: dataStorage.getCinemaMovies())
        {
            if(cm.getId() == cinemaMovie.getId())
            {
                cm.setName(cinemaMovie.getName());
                cm.setGenre(cinemaMovie.getGenre());
                cm.setDate(cinemaMovie.getDate());
                break;
            }
        }
        return cinemaMovie;
    }

    @Override
    public CinemaMovie deleteCinemaMovie(int id) {
        CinemaMovie cinemaMovie = dataStorage.getCinemaMovies()
                .stream()
                .filter(el -> el.getId() == id)
                .findFirst()
                .get();
        dataStorage.getArtists().remove(cinemaMovie);
        return cinemaMovie;
    }

    @Override
    public List<CinemaMovie> getAll() {
        return dataStorage.getCinemaMovies();
    }
}
