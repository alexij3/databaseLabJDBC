package com.buzilov.lab4db.service.artistgenre;

import com.buzilov.lab4db.model.ArtistGenre;

import java.sql.SQLException;
import java.util.List;

public interface ArtistGenreService {
    ArtistGenre insert(ArtistGenre artistGenre) throws SQLException;
    List<ArtistGenre> getAll() throws SQLException;
}
