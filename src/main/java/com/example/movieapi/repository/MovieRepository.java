package com.example.movieapi.repository;

import com.example.movieapi.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
//import com.example.movieapi.service.MovieService;
import java.time.LocalDate;
import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByGenre(String genre);           // Finds movies by genre
    List<Movie> findByIsPopularTrue();               // Finds popular movies
    List<Movie> findByReleaseDateAfter(LocalDate releaseDate); 
    
}


