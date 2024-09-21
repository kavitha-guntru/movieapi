/*package com.example.movieapi.controller;

import com.example.movieapi.entity.Movie;
import com.example.movieapi.service.MovieService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.time.LocalDate;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/popular")
    public List<Movie> getPopularMovies() {
        return movieService.getPopularMovies();
    }

    @GetMapping("/genre/{genre}")
    public List<Movie> getMoviesByGenre(@PathVariable String genre) {
        return movieService.getMoviesByGenre(genre);
    }

    @GetMapping("/movies")
public ResponseEntity<List<Movie>> getUpcomingMovies(@RequestParam String releaseDate) {
    try {
        // Log the received date to debug
        System.out.println("Received releaseDate: " + releaseDate);
        
        // Parse the releaseDate parameter
        LocalDate date = LocalDate.parse(releaseDate);
        
        // Fetch movies from service
        List<Movie> movies = movieService.getUpcomingMoviesAfter(date);
        
        return ResponseEntity.ok(movies);
        
    } catch (Exception e) {
        System.err.println("Error retrieving movies: " + e.getMessage());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }
}

}*/



package com.example.movieapi.controller;

import com.example.movieapi.entity.Movie;
import com.example.movieapi.service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.time.LocalDate;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/popular")
    public List<Movie> getPopularMovies() {
        return movieService.getPopularMovies();
    }

    @GetMapping("/genre/{genre}")
    public List<Movie> getMoviesByGenre(@PathVariable String genre) {
        return movieService.getMoviesByGenre(genre);
    }

    @GetMapping("/movies")
    public ResponseEntity<List<Movie>> getUpcomingMovies(@RequestParam String releaseDate) {
        try {
            // Log the received date to debug
            System.out.println("Received releaseDate: " + releaseDate);
            
            // Parse the releaseDate parameter
            LocalDate date = LocalDate.parse(releaseDate);
            
            // Fetch movies from service
            List<Movie> movies = movieService.getUpcomingMoviesAfter(date);
            
            return ResponseEntity.ok(movies);
            
        } catch (Exception e) {
            System.err.println("Error retrieving movies: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    
}



