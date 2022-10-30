package com.driver;

import org.springframework.beans.DirectFieldAccessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public void addMovie(Movie movie) {
        movieRepository.addMovie(movie);
    }

    public void addDirector(Director director) {
        movieRepository.addDirector(director);
    }

    public Movie getMovieByName(String name) {
        List<Movie> moviesList = movieRepository.getMovieObjects();

        for(Movie movie: moviesList){
           if(movie.getName().equals(name)){
               return movie;
           }
        }
        return null;
    }

    public Director getDirectorByName(String name) {
        List<Director> directorList = movieRepository.getDirectorObjects();
        for(Director director: directorList){
            if(director.getName().equals(name)){
                return director;
            }
        }
    }
}
