package com.buzilov.lab4db.service.organizer;

import com.buzilov.lab4db.dao.organizer.OrganizerDAOImpl;
import com.buzilov.lab4db.model.Organizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizerServiceImpl implements OrganizerService {
    @Autowired
    OrganizerDAOImpl organizerDAO;

    @Override
    public Organizer insertOrganizer(Organizer organizer) {
        return organizerDAO.insertOrganizer(organizer);
    }

    @Override
    public Organizer getOrganizer(int id) {
        return organizerDAO.getOrganizer(id);
    }

    @Override
    public Organizer updateOrganizer(Organizer organizer) {
        return organizerDAO.updateOrganizer(organizer);
    }

    @Override
    public Organizer deleteOrganizer(int id) {
        return organizerDAO.deleteOrganizer(id);
    }

    @Override
    public List<Organizer> getAll() {
        return organizerDAO.getAll();
    }
}
