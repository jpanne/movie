package com.adiyo.app.movie.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Set;

/**
 * Created by kishorechava on 1/3/17.
 */
@Entity
@Table(name = "director")
@JsonIgnoreProperties({"id","movies"})
public class Director implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private BigInteger id;
    private String name;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "directors")
    private Set<Movie> movies;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }
}
