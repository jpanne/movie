package com.adiyo.app.movie.service;

import com.adiyo.app.movie.model.Movie;
import com.adiyo.app.movie.model.SearchCriteria;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by kishorechava on 12/6/16.
 */

public interface MovieService {

    List<Movie> getMovies();

    List<Movie> getMovies(SearchCriteria searchCriteria);

    List<Movie> getMoviesByArtist(String artistName);

    List<Movie> getMoviesByComposer(String composerName);

    Movie getMovie(String name);

    void saveMovie(Movie movie);

    void updateMovie(Movie movie);

    void deleteMovie(BigInteger id);

}
