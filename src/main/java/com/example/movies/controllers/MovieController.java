package com.example.movies.controllers;

import com.example.movies.models.Movie;
import com.example.movies.services.MovieService;
import com.example.movies.services.RecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping()
public class MovieController {

    @Autowired
    private MovieService movieService;

    @Autowired
    private RecommendationService recommendationService;

    @GetMapping("/movies")
    public List<Movie> getAllMovies(){
        return movieService.getAllMovies();
    }



    @GetMapping("/recommendations/{genre}")
    public List<Movie> getListOfMoviesByRecommendation(@PathVariable String genre){
        return recommendationService.getListOfMoviesByRecommendation(recommendationService.consumeMovies(), genre);
    }
}
