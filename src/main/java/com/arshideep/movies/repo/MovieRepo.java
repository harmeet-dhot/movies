package com.arshideep.movies.repo;

import com.arshideep.movies.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MovieRepo extends JpaRepository<Movie, Integer> {

    @Query(value = "SELECT * FROM table_movie WHERE duration <= :duration", nativeQuery = true)
    public List<Movie> getMovieByTimeDuration(@Param("duration") Double duration);


    @Query(value = "SELECT * FROM table_movie WHERE movie_language = :lang", nativeQuery = true)
    public List<Movie> getMovieByLanguage(@Param("lang") String lang);
}
