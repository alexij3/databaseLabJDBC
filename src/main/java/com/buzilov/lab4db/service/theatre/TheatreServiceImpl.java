package com.buzilov.lab4db.service.theatre;

import com.buzilov.lab4db.dao.theatre.TheatreDAOImpl;
import com.buzilov.lab4db.model.Theatre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheatreServiceImpl implements TheatreService {
    @Autowired
    TheatreDAOImpl theatreDAO;

    @Override
    public Theatre insertTheatre(Theatre theatre) {
        return theatreDAO.insertTheatre(theatre);
    }

    @Override
    public Theatre getTheatre(int id) {
        return theatreDAO.getTheatre(id);
    }

    @Override
    public Theatre updateTheatre(Theatre theatre) {
        return theatreDAO.updateTheatre(theatre);
    }

    @Override
    public Theatre deleteTheatre(int id) {
        return theatreDAO.deleteTheatre(id);
    }

    @Override
    public List<Theatre> getAll() {
        return theatreDAO.getAll();
    }
}
