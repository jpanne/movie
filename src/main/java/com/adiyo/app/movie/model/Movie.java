package com.adiyo.app.movie.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

/**
 * Created by kishorechava on 12/7/16.
 */

@Entity
@Table(name = "movie")
@JsonIgnoreProperties({"created","createdBy","updated","updatedBy"})
public class Movie implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private BigInteger id;
    private String  name;
    private String lang;
    private String synopsis;
    @Column(name = "release_date")
    private LocalDate releaseDate;
    private LocalDateTime created;
    private String createdBy;
    private LocalDateTime updated;
    private String updatedBy;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "movie_audio",
            joinColumns = {
            @JoinColumn(name = "movie_id", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "audio_id", nullable = false, updatable = false) })
    private Set<Audio> audios;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "movie_acompany", joinColumns = {
            @JoinColumn(name = "movie_id", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "acompany_id", nullable = false, updatable = false) })
    private Set<AudioCompany> audioCompanies;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "movie_genre", joinColumns = {
            @JoinColumn(name = "movie_id", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "genre_id", nullable = false, updatable = false) })
    private Set<Genre> genres;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "movie_image", joinColumns = {
            @JoinColumn(name = "movie_id", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "image_id", nullable = false, updatable = false) })
    private Set<Image> images;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "movie_phouse", joinColumns = {
            @JoinColumn(name = "movie_id", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "phouse_id", nullable = false, updatable = false) })
    private Set<ProductionHouse> productionHouses;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "movie_artist", joinColumns = {
            @JoinColumn(name = "movie_id", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "artist_id", nullable = false, updatable = false) })
    private Set<Artist> artists;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "movie_composer", joinColumns = {
            @JoinColumn(name = "movie_id", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "composer_id", nullable = false, updatable = false) })
    private Set<Composer> composers;

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

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Set<Audio> getAudios() {
        return audios;
    }

    public void setAudios(Set<Audio> audios) {
        this.audios = audios;
    }

    public Set<AudioCompany> getAudioCompanies() {
        return audioCompanies;
    }

    public void setAudioCompanies(Set<AudioCompany> audioCompanies) {
        this.audioCompanies = audioCompanies;
    }

    public Set<Genre> getGenres() {
        return genres;
    }

    public void setGenres(Set<Genre> genres) {
        this.genres = genres;
    }

    public Set<Image> getImages() {
        return images;
    }

    public void setImages(Set<Image> images) {
        this.images = images;
    }

    public Set<ProductionHouse> getProductionHouses() {
        return productionHouses;
    }

    public void setProductionHouses(Set<ProductionHouse> productionHouses) {
        this.productionHouses = productionHouses;
    }

    public Set<Artist> getArtists() {
        return artists;
    }

    public void setArtists(Set<Artist> artists) {
        this.artists = artists;
    }

    public Set<Composer> getComposers() {
        return composers;
    }

    public void setComposers(Set<Composer> composers) {
        this.composers = composers;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
}
