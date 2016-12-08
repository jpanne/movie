package com.adiyo.app.movie.repository;

import com.adiyo.app.movie.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

/**
 * Created by kishorechava on 12/8/16.
 */
public interface MovieRepository extends JpaRepository<Movie, BigInteger>{
}
