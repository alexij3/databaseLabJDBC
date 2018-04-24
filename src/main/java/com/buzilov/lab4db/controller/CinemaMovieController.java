package com.buzilov.lab4db.controller;

import com.buzilov.lab4db.model.CinemaMovie;
import com.buzilov.lab4db.service.cinemamovie.CinemaMovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CinemaMovieController {
    @Autowired
    CinemaMovieServiceImpl cinemaMovie;

    @RequestMapping("/cinemamovie")
    public List<CinemaMovie> showCInemaMovies(){
        return cinemaMovie.getAll();
    }

}
