package com.example.movies.services;

import com.example.movies.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecommendationService {

    @Autowired
    RestTemplate restTemplate;
    public List<Movie> getListOfMoviesByRecommendation(List<Movie> movies, String genre){

        List<Movie> movies1 = new ArrayList<>();

        for(Movie movie: movies){
            if(movie.getGenre().equals(genre)){
                movies1.add(movie);
            }
        }

        return movies1;
    }

    public List<Movie> consumeMovies() {




         return restTemplate.exchange("http://localhost:8080/movies",
                 HttpMethod.GET, null, new ParameterizedTypeReference<List<Movie>>() {
                 }).getBody();

    }
}
