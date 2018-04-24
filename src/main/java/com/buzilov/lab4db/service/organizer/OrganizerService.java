package com.buzilov.lab4db.service.organizer;

import com.buzilov.lab4db.model.Organizer;

import java.util.List;

public interface OrganizerService {
    Organizer insertOrganizer(Organizer organizer);
    Organizer getOrganizer(int id);
    Organizer updateOrganizer(Organizer organizer);
    Organizer deleteOrganizer(int id);
    List<Organizer> getAll();
}
