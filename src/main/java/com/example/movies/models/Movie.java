package com.example.movies.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("genre")
    private String genre;
    @JsonProperty("releaseYear")
    private int releaseYear;
    @JsonProperty("director")
    private String director;
}
