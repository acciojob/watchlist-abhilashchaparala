package com.driver;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
public class MovieRepository {

    private HashMap<Director, List<Movie>> directorMoviePair = new HashMap<>();
    private List<Director> directorList = new ArrayList<>();
    private List<Movie> movieList = new ArrayList<>();

    public void addMovie(Movie movie) {
        movieList.add(movie);
    }

    public void addDirector(Director director) {
        directorList.add(director);
    }


    public List<Movie> getMovieObjects() {
        return movieList;
    }

    public List<Director> getDirectorObjects() {
        return directorList;
    }


    public void setDirectorMoviePair(HashMap<Director, List<Movie>> directorMoviePair) {
        this.directorMoviePair = directorMoviePair;
    }

    public void setDirectorList(List<Director> directorList) {
        this.directorList = directorList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public HashMap<Director, List<Movie>> getDirectorMoviePair() {
//        directorMoviePair.put(new Director("abhi",21,20), movieList);
        return directorMoviePair;
    }
}
