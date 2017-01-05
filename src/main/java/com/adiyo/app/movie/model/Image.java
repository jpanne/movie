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
@Table(name = "image")
@JsonIgnoreProperties({"id","movies", "artists"})
public class Image implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private BigInteger id;
    private String name;
    private String type;
    private String path;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "images")
    private Set<Movie> movies;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "images")
    private Set<Artist> artists;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }

    public Set<Artist> getArtists() {
        return artists;
    }

    public void setArtists(Set<Artist> artists) {
        this.artists = artists;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
