package com.buzilov.lab4db.controller;

import com.buzilov.lab4db.model.Theatre;
import com.buzilov.lab4db.service.theatre.TheatreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TheatreController {
    @Autowired
    TheatreServiceImpl theatreService;

    @RequestMapping("/theatre")
    public List<Theatre> showTheatres(){
        return theatreService.getAll();
    }
}
