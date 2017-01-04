package com.adiyo.app.movie.service;

import com.adiyo.app.movie.model.Movie;
import com.adiyo.app.movie.model.SearchCriteria;
import com.adiyo.app.movie.repository.MovieRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
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

    @Override
    public List<Movie> getMovies(SearchCriteria criteria) {
        if(StringUtils.isNotBlank(criteria.getArtistName()) &&
                StringUtils.isNotBlank(criteria.getComposerName())) {
            return movieRepository
                    .findByArtists_NameContainingIgnoreCaseAndComposers_NameContainingIgnoreCase
                            (criteria.getArtistName(), criteria.getComposerName());
        } else if(StringUtils.isNotBlank(criteria.getArtistName())) {
            return movieRepository.findByArtists_NameContainingIgnoreCase(criteria.getArtistName());
        } else if(StringUtils.isNotBlank(criteria.getComposerName())) {
            return movieRepository.findByComposers_NameContainingIgnoreCase(criteria.getComposerName());
        } else {
            return movieRepository.findAll();
        }
    }

    @Override
    public List<Movie> getMoviesByArtist(String artistName) {
        return movieRepository.findByArtists_NameContainingIgnoreCase(artistName);
    }

    @Override
    public List<Movie> getMoviesByComposer(String composerName) {
        return movieRepository.findByComposers_NameContainingIgnoreCase(composerName);
    }

    @Override
    public Movie getMovie(String name) {
        return movieRepository.findByName(name);
    }

    @Override
    public void saveMovie(Movie movie) {
        movieRepository.save(movie);
    }

    @Override
    public void updateMovie(Movie movie) {
        movieRepository.save(movie);
    }

    @Override
    public void deleteMovie(BigInteger id) {
        movieRepository.delete(id);
    }
}
