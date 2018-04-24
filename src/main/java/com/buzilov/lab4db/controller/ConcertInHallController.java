package com.buzilov.lab4db.controller;

import com.buzilov.lab4db.model.ConcertInHall;
import com.buzilov.lab4db.service.concertinhall.ConcertInHallServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ConcertInHallController {
    @Autowired
    ConcertInHallServiceImpl concertInHallService;

    @RequestMapping("/concertinhall")
    public List<ConcertInHall> showCInemaMovies(){
        return concertInHallService.getAll();
    }
}
