package com.adiyo.app.movie.repository;

import com.adiyo.app.movie.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by kishorechava on 12/8/16.
 */
public interface MovieRepository extends JpaRepository<Movie, BigInteger>{

    List<Movie> findByArtists_NameContainingIgnoreCase(String name);

    List<Movie> findByComposers_NameContainingIgnoreCase(String name);

    List<Movie> findByArtists_NameContainingIgnoreCaseAndComposers_NameContainingIgnoreCase(String artistName, String composerName);

}
