package com.buzilov.lab4db.dao.theatre;

import com.buzilov.lab4db.model.Theatre;

import java.util.List;

public interface TheatreDAO {
    Theatre insertTheatre(Theatre theatre);
    Theatre getTheatre(int id);
    Theatre updateTheatre(Theatre theatre);
    Theatre deleteTheatre(int id);
    List<Theatre> getAll();
}
