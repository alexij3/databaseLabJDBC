package com.buzilov.lab4db.dao.cinema;

import com.buzilov.lab4db.datastorage.DataStorageFake;
import com.buzilov.lab4db.datastorage.DataStorageJdbc;
import com.buzilov.lab4db.model.Cinema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
    public Cinema insertCinema(Cinema cinema) {
        dataStorage.getCinemas().add(cinema);
        return cinema;
    }

    @Override
    public Cinema getCinema(int id) {
        return dataStorage.getCinemas().stream()
                .filter(el -> el.getId() == id)
                .findFirst().orElse(null);
    }

    @Override
    public Cinema updateCinema(Cinema cinema) {
        for(Cinema c: dataStorage.getCinemas())
        {
            if(c.getId() == cinema.getId())
            {
                c.setName(cinema.getName());
                c.setAddress(cinema.getAddress());
                c.setScreenSize(cinema.getScreenSize());
                break;
            }
        }
        return cinema;
    }

    @Override
    public Cinema deleteCinema(int id) {
        Cinema cinema = dataStorage.getCinemas()
                .stream()
                .filter(el -> el.getId() == id)
                .findFirst()
                .get();
        dataStorage.getCinemas().remove(cinema);
        return cinema;
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
