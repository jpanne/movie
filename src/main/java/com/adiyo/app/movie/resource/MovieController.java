package com.adiyo.app.movie.resource;

import com.adiyo.app.movie.model.Movie;
import com.adiyo.app.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by kishorechava on 12/5/16.
 */

@RestController
public class MovieController {

    @Autowired
    MovieService movieService;

    @RequestMapping(value = "/movies", method = RequestMethod.GET)
    public List<Movie> getMovies() {
        return movieService.getMovies();
    }

}
