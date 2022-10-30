package com.driver;

public class Movie {
    private String name;
    private double imdbRating;

    private int durationInMinutes;



    public Movie(String name, int durationInMinutes, double imdbRating){
        this.name = name;
        this.imdbRating = imdbRating;
        this.durationInMinutes = durationInMinutes;
    }
    public Movie(){
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getImdbRating() {
        return imdbRating;
    }
    public void setImdbRating(double imdbRating){
        this.imdbRating = imdbRating;
    }
    public int getDurationInMinutes() {
        return durationInMinutes;
    }
    public void setDurationInMinutes(int durationInMinutes){
        this.durationInMinutes = durationInMinutes;
    }
}
