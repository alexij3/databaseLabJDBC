package com.buzilov.lab4db.controller;

import com.buzilov.lab4db.model.Artist;
import com.buzilov.lab4db.model.Genre;
import com.buzilov.lab4db.service.artist.ArtistServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api/artist")
public class ArtistController {
    @Autowired
    ArtistServiceImpl artistService;

    @RequestMapping("/showall")
    public List<Artist> showArtists() throws SQLException{
        return artistService.getAll();
    }

    @RequestMapping("/delete")
    public void deleteArtist(@RequestParam("id") int id) throws SQLException{
        artistService.deleteArtist(id);
    }

    @RequestMapping("/update")
    public Artist updateArtist(@RequestParam("id") Integer id, @RequestBody Artist artist)  throws  SQLException{
        artist.setId(id);
        return artistService.updateArtist(artist);
    }

    @RequestMapping("/create")
    public Artist create(@RequestParam("id") int id, @RequestBody Artist artist) throws SQLException{
        artist.setId(id);
        return artistService.insertArtist(artist);
    }
}
