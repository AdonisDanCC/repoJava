package com.proyecAmazonViewer.model;

public class Movie extends Film {

    private int id;
    private int timeViewer;

    public Movie(String title, String genre, String creator, int duration, short year) {
        super(title, genre, creator, duration);
       setYear(year);
    }

    public void showData(){
        //System.out.println("Title: " +title);
        //System.out.println("Genre: " + genre);
        //System.out.println("year: " +year);
    }

    public int getId() {
        return id;
    }
    public int getTimeViewer() {
        return timeViewer;
    }

    public void setTimeViewer(int timeViewer) {
        this.timeViewer = timeViewer;
    }
}
