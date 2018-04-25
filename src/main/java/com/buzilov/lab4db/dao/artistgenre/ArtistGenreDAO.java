package com.buzilov.lab4db.dao.artistgenre;

import com.buzilov.lab4db.model.ArtistGenre;

import java.sql.SQLException;
import java.util.List;

public interface ArtistGenreDAO {
    ArtistGenre insert(ArtistGenre artistGenre) throws SQLException;
    List<ArtistGenre> getAll() throws SQLException;
}
