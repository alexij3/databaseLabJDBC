package com.buzilov.lab4db.service.theatre;

import com.buzilov.lab4db.model.Theatre;

import java.util.List;

public interface TheatreService {
    Theatre insertTheatre(Theatre theatre);
    Theatre getTheatre(int id);
    Theatre updateTheatre(Theatre theatre);
    Theatre deleteTheatre(int id);
    List<Theatre> getAll();
}
