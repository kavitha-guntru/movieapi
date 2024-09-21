
package com.example.movieapi.service;

import com.example.movieapi.entity.Movie;
import com.example.movieapi.repository.MovieRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getPopularMovies() {
        return movieRepository.findByIsPopularTrue();
    }

    public List<Movie> getMoviesByGenre(String genre) {
        return movieRepository.findByGenre(genre);
    }

    
    public List<Movie> getUpcomingMoviesAfter(LocalDate releaseDate) {
        return movieRepository.findByReleaseDateAfter(releaseDate);
    }
    

}
