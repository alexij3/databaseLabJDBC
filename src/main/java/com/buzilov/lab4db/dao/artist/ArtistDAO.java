package com.buzilov.lab4db.dao.artist;

import com.buzilov.lab4db.model.Artist;

import java.sql.SQLException;
import java.util.List;

public interface ArtistDAO {
    Artist insertArtist(Artist artist);
    Artist getArtist(int id);
    Artist updateArtist(Artist artist);
    Artist deleteArtist(int id);
    List<Artist> getAll() throws SQLException;
}
