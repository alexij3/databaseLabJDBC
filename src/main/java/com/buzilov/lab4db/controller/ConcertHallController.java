package com.buzilov.lab4db.controller;

import com.buzilov.lab4db.model.ConcertHall;
import com.buzilov.lab4db.service.concerthall.ConcertHallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ConcertHallController {
    @Autowired
    ConcertHallService concertHallService;

    @RequestMapping("/concerthall")
    public List<ConcertHall> showConcertHalls(){
        return concertHallService.getAll();
    }

}
