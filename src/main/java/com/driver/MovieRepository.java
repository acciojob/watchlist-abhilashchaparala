package com.driver;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
public class MovieRepository {

    HashMap<Director,Movie> directorMoviePair = new HashMap<>();
    List<Director> directorList = new ArrayList<>();
    List<Movie> movieList = new ArrayList<>();

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
}
