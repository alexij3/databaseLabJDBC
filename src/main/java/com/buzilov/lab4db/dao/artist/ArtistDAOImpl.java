package com.buzilov.lab4db.dao.artist;

import com.buzilov.lab4db.datastorage.DataStorageFake;
import com.buzilov.lab4db.datastorage.DataStorageJdbc;
import com.buzilov.lab4db.model.Artist;
import com.buzilov.lab4db.model.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class ArtistDAOImpl implements ArtistDAO{
    @Autowired
    DataStorageFake dataStorage;

    @Autowired
    DataStorageJdbc dataStorageJdbc;

    @Override
    public Artist insertArtist(Artist artist) throws SQLException {
        PreparedStatement insert;
        String insertArtist = "INSERT INTO artist (id, name) VALUES (?, ?)";
        insert = dataStorageJdbc.getCon().prepareStatement(insertArtist);
        insert.setInt(1, artist.getId());
        insert.setString(2, artist.getName());
        insert.executeUpdate();

        if (artist.getGenres() != null){
            PreparedStatement insertGenre;
            String insertArtistGenres = "INSERT INTO artist_and_genre (id_artist, genre) VALUES (?, ?)";
            insertGenre = dataStorageJdbc.getCon().prepareStatement(insertArtistGenres);

            Iterator<Genre> genreIterator = artist.getGenres().iterator();
            while(genreIterator.hasNext()){
                insertGenre.setInt(1, artist.getId());
                insertGenre.setString(2, genreIterator.next().toString());
                insertGenre.executeUpdate();
            }

        }

        return artist;
    }

    @Override
    public Artist getArtist(int id) throws SQLException{
        return dataStorage.getArtists().stream()
                .filter(el -> el.getId() == id)
                .findFirst().orElse(null);
    }

    @Override
    public Artist updateArtist(Artist artist) throws  SQLException{
        PreparedStatement update;
        String updateArtist = "UPDATE artist SET name = ? where id = ?";
        update = dataStorageJdbc.getCon().prepareStatement(updateArtist);
        update.setString(1, artist.getName());
        update.setInt(2, artist.getId());
        update.executeUpdate();

        return artist;
    }

    @Override
    public void deleteArtist(int id) throws SQLException{
        PreparedStatement delete;
        String deleteArtist = "DELETE FROM artist WHERE id = ?";
        delete = dataStorageJdbc.getCon().prepareStatement(deleteArtist);
        delete.setInt(1, id);
        delete.executeUpdate();
    }

    @Override
    public List<Artist> getAll() throws SQLException{
        List<Artist> list = new ArrayList<>();
        ResultSet rs = dataStorageJdbc.executeQuery("SELECT id, name, genre FROM artist LEFT JOIN artist_and_genre" +
                                                    "\nON id = id_artist");

        while (rs.next()){
            list.add(new Artist(rs.getInt("id"), rs.getString("name")));
            int id = rs.getInt("id");
            if (rs.getString("genre") != null)
                list.stream().filter(el -> el.getId() == id).findFirst().get().getGenres().add(Genre.valueOf(rs.getString("genre")));
        }

        return list;
    }
}
