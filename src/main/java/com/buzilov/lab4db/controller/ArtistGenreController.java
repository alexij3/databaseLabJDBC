package com.buzilov.lab4db.controller;

import com.buzilov.lab4db.model.Artist;
import com.buzilov.lab4db.model.ArtistGenre;
import com.buzilov.lab4db.model.Genre;
import com.buzilov.lab4db.service.artistgenre.ArtistGenreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api/artistgenre")
public class ArtistGenreController {
    @Autowired
    ArtistGenreServiceImpl artistGenreService;

    @RequestMapping("/showgenres")
    public List<ArtistGenre> showGenres() throws SQLException {
        return artistGenreService.getAll();
    }

    @RequestMapping("/insertgenre")
    public ArtistGenre insertGenre(@RequestBody Artist artist, @RequestBody Genre genre) throws SQLException{
        ArtistGenre artistGenre = new ArtistGenre(artist, genre);
        System.out.println(artistGenre);
        return artistGenreService.insert(artistGenre);
    }
}
