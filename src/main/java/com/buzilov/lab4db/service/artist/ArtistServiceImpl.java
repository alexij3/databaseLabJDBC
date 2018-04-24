package com.buzilov.lab4db.service.artist;

import com.buzilov.lab4db.dao.artist.ArtistDAOImpl;
import com.buzilov.lab4db.model.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class ArtistServiceImpl implements ArtistService {
    @Autowired
    ArtistDAOImpl artistDAO;

    @Override
    public Artist insertArtist(Artist artist) {
        return artistDAO.insertArtist(artist);
    }

    @Override
    public Artist getArtist(int id) {
        return artistDAO.getArtist(id);
    }

    @Override
    public Artist updateArtist(Artist artist) {
        return artistDAO.updateArtist(artist);
    }

    @Override
    public Artist deleteArtist(int id) {
        return artistDAO.deleteArtist(id);
    }

    @Override
    public List<Artist> getAll() throws SQLException {
        return artistDAO.getAll();
    }
}
