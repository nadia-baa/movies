package com.example.movies;

import com.example.movies.models.Movie;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class MovieList {

    private List<Movie> movies;

    public MovieList() {
        movies = new ArrayList<>();
    }
}
