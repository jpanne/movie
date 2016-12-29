package com.adiyo.app.movie.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Set;

/**
 * Created by kishorechava on 12/7/16.
 */

@Entity
@Table(name = "artist")
@JsonIgnoreProperties({"movies"})
public class Artist implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private BigInteger id;
    private String name;

    //@JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "artists")
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
