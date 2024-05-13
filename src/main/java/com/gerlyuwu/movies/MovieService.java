package com.gerlyuwu.movies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

/*
 * GERLY DANIEL ARTEAGA BERNAL 
 */

import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
private MovieRepository movieRepository;

public List<Movie> allMovies(){
    return movieRepository.findAll();
}
}
