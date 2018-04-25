package com.buzilov.lab4db.controller;

import com.buzilov.lab4db.model.Cinema;
import com.buzilov.lab4db.service.cinema.CinemaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api/cinema")
public class CinemaController {
    @Autowired
    CinemaServiceImpl cinemaService;

    @RequestMapping("/showall")
    public List<Cinema> showCinemas() throws SQLException{
        return cinemaService.getAll();
    }
}
