package com.adiyo.app.movie.dao;

import com.adiyo.app.movie.model.MovieDetail;

import java.util.List;

/**
 * Created by kishorechava on 12/6/16.
 */

public interface MovieDao {

    List<MovieDetail> getMovies();
}
