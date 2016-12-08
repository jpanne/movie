package com.adiyo.app.movie.service;

import com.adiyo.app.movie.model.Movie;
import com.adiyo.app.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kishorechava on 12/6/16.
 */

@Service("movieServiceImpl")
public class MovieServiceImpl implements MovieService {

    @Autowired
    public MovieRepository movieRepository;

    @Override
    public List<Movie> getMovies() {
        return movieRepository.findAll();
    }

}
