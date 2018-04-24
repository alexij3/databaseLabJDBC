package com.buzilov.lab4db.controller;

import com.buzilov.lab4db.model.Artist;
import com.buzilov.lab4db.model.Genre;
import com.buzilov.lab4db.service.artist.ArtistServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ArtistController {
    @Autowired
    ArtistServiceImpl artistService;

    @RequestMapping("/artist")
    public List<Artist> showArtists() throws SQLException{
        return artistService.getAll();
    }

}
