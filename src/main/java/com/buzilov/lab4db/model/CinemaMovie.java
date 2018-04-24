package com.buzilov.lab4db.model;

import java.util.Date;

public class CinemaMovie {
    private int id;
    private String name;
    private String genre;
    private Cinema cinema;
    private Date date;

    public CinemaMovie(int id, String name, String genre, Cinema cinema, Date date) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.cinema = cinema;
        this.date = date;
    }

    @Override
    public String toString() {
        return "CinemaMovie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", cinema=" + cinema +
                ", date=" + date +
                '}';
    }


    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
