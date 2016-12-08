package com.adiyo.app.movie.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Set;

/**
 * Created by kishorechava on 12/7/16.
 */

@Entity
@Table(name = "audio_company")
public class AudioCompany implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private BigInteger id;
    @Column(name="name")
    private String audioCompany;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "audioCompanies")
    private Set<Movie> movies;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getAudioCompany() {
        return audioCompany;
    }

    public void setAudioCompany(String audioCompany) {
        this.audioCompany = audioCompany;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }
}