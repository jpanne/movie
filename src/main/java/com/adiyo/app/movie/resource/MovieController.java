package com.adiyo.app.movie.resource;

import com.adiyo.app.movie.model.Movie;
import com.adiyo.app.movie.model.SearchCriteria;
import com.adiyo.app.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.math.BigInteger;
import java.util.List;

/**
 * Created by kishorechava on 12/5/16.
 */

@RestController
public class MovieController {

    @Autowired
    MovieService movieService;

    @RequestMapping(value = "/movies", method = RequestMethod.GET)
    public List<Movie> getMovies(@RequestParam(value="artist", required = false) String artist,
                                 @RequestParam(value="composer", required = false) String composer) {
        SearchCriteria criteria = new SearchCriteria(artist, composer);
        return movieService.getMovies(criteria);
    }

    @RequestMapping(value = "/movie", method = RequestMethod.GET)
    public Movie getMovie(@RequestParam(value="name") String name) {
        return movieService.getMovie(name);
    }

    @RequestMapping(value = "/movie", method = RequestMethod.POST)
    public void getMovie(@RequestBody Movie movie) {
        movieService.saveMovie(movie);
    }

    @RequestMapping(value = "/movie", method = RequestMethod.PUT)
    public void updateMovie(@RequestBody Movie movie) {
        movieService.updateMovie(movie);
    }

    @RequestMapping(value = "/movie/{id}", method = RequestMethod.DELETE)
    public void updateMovie(@PathParam(value="id") BigInteger id) {
        movieService.deleteMovie(id);
    }

}
