package com.buzilov.lab4db.dao.artistgenre;

import com.buzilov.lab4db.datastorage.DataStorageJdbc;
import com.buzilov.lab4db.model.Artist;
import com.buzilov.lab4db.model.ArtistGenre;
import com.buzilov.lab4db.model.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class ArtistGenreDAOImpl implements ArtistGenreDAO {
    @Autowired
    DataStorageJdbc dataStorageJdbc;

    @Override
    public ArtistGenre insert(ArtistGenre artistGenre) throws SQLException {
        PreparedStatement insert;
        String insertArtistGenre = "INSERT INTO artist_and_genre (id_artist, genre) VALUES (?, ?)";
        insert = dataStorageJdbc.getCon().prepareStatement(insertArtistGenre);
        insert.setInt(1, artistGenre.getArtist().getId());
        insert.setString(2, artistGenre.getGenre().toString());
        insert.executeUpdate();

        return artistGenre;
    }

    @Override
    public List<ArtistGenre> getAll() throws SQLException {
        List<ArtistGenre> list = new ArrayList<>();
        ResultSet rs = dataStorageJdbc.executeQuery("SELECT artist.id, name, genre FROM artist_and_genre RIGHT OUTER JOIN artist\n" +
                "ON artist_and_genre.id_artist = artist.id");

        while (rs.next()){
            list.add(new ArtistGenre(new Artist(rs.getInt("artist.id"), rs.getString("name"))));
            if (rs.getString("genre") != null) list.get(list.size()-1).setGenre(Genre.valueOf(rs.getString("genre")));
        }

        return list;
    }
}
