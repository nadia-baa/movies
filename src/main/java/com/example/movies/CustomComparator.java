package com.example.movies;

import com.example.movies.models.Movie;
import lombok.NoArgsConstructor;

import java.util.Comparator;


public class CustomComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getReleaseYear()-(o2.getReleaseYear());
    }


}
