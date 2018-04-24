package com.buzilov.lab4db.model;

import java.util.Date;

public class ConcertInHall {
    private int id;
    private ConcertHall concertHall;
    private String name;
    private Organizer organizer;
    private Date date;

    public ConcertInHall(int id, ConcertHall concertHall, String name, Organizer organizer, Date date) {
        this.id = id;
        this.concertHall = concertHall;
        this.name = name;
        this.organizer = organizer;
        this.date = date;
    }


    @Override
    public String toString() {
        return "ConcertInHall{" +
                "id=" + id +
                ", concertHall=" + concertHall +
                ", name='" + name + '\'' +
                ", organizer=" + organizer +
                ", date=" + date +
                '}';
    }

    public ConcertHall getConcertHall() {
        return concertHall;
    }

    public void setConcertHall(ConcertHall concertHall) {
        this.concertHall = concertHall;
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
