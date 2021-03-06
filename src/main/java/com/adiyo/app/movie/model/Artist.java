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
@JsonIgnoreProperties({"id","movies"})
public class Artist implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private BigInteger id;
    private String name;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "artists")
    private Set<Movie> movies;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "artist_image", joinColumns = {
            @JoinColumn(name = "artist_id", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "image_id", nullable = false, updatable = false) })
    private Set<Image> images;


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

    public Set<Image> getImages() {
        return images;
    }

    public void setImages(Set<Image> images) {
        this.images = images;
    }
}
