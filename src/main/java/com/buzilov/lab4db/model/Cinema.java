package com.buzilov.lab4db.model;

public class Cinema {
    private Integer id;
    private String name;
    private String address;
    private int screenSize;

    public Cinema(Integer id, String name, String address, int screenSize) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.screenSize = screenSize;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cinema cinema = (Cinema) o;

        if (screenSize != cinema.screenSize) return false;
        if (id != null ? !id.equals(cinema.id) : cinema.id != null) return false;
        if (name != null ? !name.equals(cinema.name) : cinema.name != null) return false;
        return address != null ? address.equals(cinema.address) : cinema.address == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + screenSize;
        return result;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", screenSize=" + screenSize +
                '}';
    }
}
