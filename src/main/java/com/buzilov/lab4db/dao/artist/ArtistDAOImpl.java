package com.buzilov.lab4db.dao.artist;

import com.buzilov.lab4db.datastorage.DataStorageFake;
import com.buzilov.lab4db.datastorage.DataStorageJdbc;
import com.buzilov.lab4db.model.Artist;
import com.buzilov.lab4db.model.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.*;

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

        return artist;
    }

    @Override
    public Artist getArtist(int id) throws SQLException{
        PreparedStatement get;
        String getArtist = "SELECT * FROM artist WHERE id = ?";
        get = dataStorageJdbc.getCon().prepareStatement(getArtist);
        get.setInt(1, id);
        ResultSet rs = get.executeQuery();
        Artist artist = null;
        if (rs.next()){
            artist = new Artist(rs.getInt("id"), rs.getString("name"));
        }

        return artist;
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
        ResultSet rs = dataStorageJdbc.executeQuery("SELECT * FROM artist");

        while (rs.next()){
            list.add(new Artist(rs.getInt("id"), rs.getString("name")));
        }


        return list;
    }
}
