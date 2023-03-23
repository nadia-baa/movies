package com.example.movies.services;

import com.example.movies.models.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {



    public List<Movie> getAllMovies(){
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie(1L,"The Shawshank Redemption", "Drama", 1994, "Frank Darabont"));
        movies.add(new Movie(2L,"The Godfather", "Drama", 1972, "Francis Ford Coppola"));
        movies.add(new Movie(3L,"The Dark Knight", "Action", 2008, "Christopher Nolan"));
        movies.add(new Movie(4L,"The Matrix", "Action", 1999, "The Wachowskis"));

        return movies;
    }


}
