package com.buzilov.lab4db.controller;

import com.buzilov.lab4db.model.Organizer;
import com.buzilov.lab4db.service.organizer.OrganizerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrganizerController {
    @Autowired
    OrganizerServiceImpl organizerService;

    @RequestMapping("/organizer")
    public List<Organizer> showOrganizers(){
        return organizerService.getAll();
    }
}
