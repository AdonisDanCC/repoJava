package com.proyecAmazonViewer.model;

public class Film {
    private String title;
    private String genre;
    private String creator;
    private int duration;
    private short year;
    private boolean viewer;

    public Film(String title, String genre, String creator, int duration) {
        this.title = title;
        this.genre = genre;
        this.creator = creator;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public boolean isViewer() {
        return viewer;
    }

    public void setViewer(boolean viewer) {
        this.viewer = viewer;
    }
}
