package com.buzilov.lab4db.dao.cinema;

import com.buzilov.lab4db.datastorage.DataStorageFake;
import com.buzilov.lab4db.datastorage.DataStorageJdbc;
import com.buzilov.lab4db.model.Cinema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class CinemaDAOImpl implements CinemaDAO {
    @Autowired
    DataStorageFake dataStorage;

    @Autowired
    DataStorageJdbc dataStorageJdbc;

    @Override
    public Cinema insertCinema(Cinema cinema) throws SQLException {
        PreparedStatement insert;
        String insertCinema = "INSERT INTO cinema (id, name, address, screen_size) VALUES (?, ?, ?, ?)";
        insert = dataStorageJdbc.getCon().prepareStatement(insertCinema);
        insert.setInt(1, cinema.getId());
        insert.setString(2, cinema.getName());
        insert.setString(3, cinema.getAddress());
        insert.setInt(4, cinema.getScreenSize());
        insert.executeUpdate();

        return cinema;
    }

    @Override
    public Cinema getCinema(int id) throws SQLException {
        PreparedStatement get;
        String getCinema = "SELECT * FROM cinema WHERE id = ?";
        get = dataStorageJdbc.getCon().prepareStatement(getCinema);
        get.setInt(1, id);
        ResultSet rs = get.executeQuery();
        Cinema cinema = null;
        if (rs.next()){
            cinema = new Cinema(rs.getInt("id"), rs.getString("name"), rs.getString("address"),
                    rs.getInt("screen_size"));
        }

        return cinema;
    }

    @Override
    public Cinema updateCinema(Cinema cinema) throws SQLException {
        PreparedStatement update;
        String updateCinema = "UPDATE cinema SET name = ?, address = ?, screen_size = ? WHERE id = ?";
        update = dataStorageJdbc.getCon().prepareStatement(updateCinema);
        update.setString(1, cinema.getName());
        update.setString(2, cinema.getAddress());
        update.setInt(3, cinema.getScreenSize());
        update.setInt(4, cinema.getId());
        update.executeUpdate();

        return cinema;
    }

    @Override
    public void deleteCinema(int id) throws SQLException{
        PreparedStatement delete;
        String deleteCinema = "DELETE FROM cinema WHERE id = ?";
        delete = dataStorageJdbc.getCon().prepareStatement(deleteCinema);
        delete.setInt(1, id);
        delete.executeUpdate();
    }

    @Override
    public List<Cinema> getAll() throws SQLException {
        List<Cinema> list = new ArrayList<>();
        ResultSet rs = dataStorageJdbc.executeQuery("SELECT * FROM cinema");

        while (rs.next()){
            list.add(new Cinema(rs.getInt("id"), rs.getString("name"),
                    rs.getString("address"), rs.getInt("screen_size")));
        }

        return list;
    }
}
