package com.buzilov.lab4db.controller;

import com.buzilov.lab4db.model.Cinema;
import com.buzilov.lab4db.service.cinema.CinemaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CinemaController {
    @Autowired
    CinemaServiceImpl cinemaService;

    @RequestMapping("/cinema")
    public List<Cinema> showCinemas(){
        return cinemaService.getAll();
    }
}
