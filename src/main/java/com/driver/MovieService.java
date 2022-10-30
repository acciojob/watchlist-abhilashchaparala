package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

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

        for (Movie movie : moviesList) {
            if (movie.getName().equals(name)) {
                return movie;
            }
        }
        return null;
    }

    public Director getDirectorByName(String name) {
        List<Director> directorList = movieRepository.getDirectorObjects();
        for (Director director : directorList) {
            if (director.getName().equals(name)) {
                return director;
            }
        }
        return null;
    }

    public List<String> getAllMovies() {
        List<String> allMovieNames = new ArrayList<>();
        List<Movie> moviesList = movieRepository.getMovieObjects();
        for (Movie movie : moviesList) {
            allMovieNames.add(movie.getName());
        }
        return allMovieNames;
    }

    public void deleteDirectorByName(String name) {
        List<Director> directorList = movieRepository.getDirectorObjects();
        movieRepository.setDirectorList(directorList.stream().filter(x -> !x.getName().equals(name)).collect(Collectors.toList()));
    }

    public void deleteAllDirectors(){
        movieRepository.setDirectorList(Collections.emptyList());
    }

    public void addMovieDirectorPair(String movieName, String directorName) {
        HashMap<Director, List<Movie>> pairList = movieRepository.getDirectorMoviePair();
        Director director=getDirectorByName(directorName);
        Movie movie=getMovieByName(movieName);
        if(!pairList.containsKey(director)){
            pairList.put(director,new ArrayList<>());
        }
        pairList.get(director).add(movie);

    }

    public List<String> getMoviesByDirectorName(String directorName) {
        HashMap<Director,List<Movie>> pairList = movieRepository.getDirectorMoviePair();
        Director director = getDirectorByName(directorName);
        return pairList.get(director).stream().map(Movie::getName).collect(Collectors.toList());
    }
}
