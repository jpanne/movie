package com.adiyo.app.movie.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.math.BigInteger;
import java.time.Instant;
import java.time.LocalDate;

/**
 * Created by kishorechava on 12/5/16.
 */

public class MovieDetail {

    private BigInteger id;
    private String  name;
    private String lang;
    private String synopsis;
    private LocalDate releaseDate;
    private Instant created;
    private String createdBy;
    private Instant updated;
    private String updatedBy;
    private BigInteger audioId;
    private String audioName;
    private String audioPath;
    private BigInteger audioCompanyId;
    private String audioCompanyName;
    private BigInteger genreId;
    private String genre;
    private BigInteger imageId;
    private String imageName;
    private String imagePath;
    private BigInteger productionHouseId;
    private String productionHouseName;
    private BigInteger composerId;
    private String composerName;
    private BigInteger artistId;
    private String artistName;


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

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Instant getCreated() {
        return created;
    }

    public void setCreated(Instant created) {
        this.created = created;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Instant getUpdated() {
        return updated;
    }

    public void setUpdated(Instant updated) {
        this.updated = updated;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getAudioName() {
        return audioName;
    }

    public void setAudioName(String audioName) {
        this.audioName = audioName;
    }

    public String getAudioPath() {
        return audioPath;
    }

    public void setAudioPath(String audioPath) {
        this.audioPath = audioPath;
    }

    public String getAudioCompanyName() {
        return audioCompanyName;
    }

    public void setAudioCompanyName(String audioCompanyName) {
        this.audioCompanyName = audioCompanyName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getProductionHouseName() {
        return productionHouseName;
    }

    public void setProductionHouseName(String productionHouseName) {
        this.productionHouseName = productionHouseName;
    }

    public String getComposerName() {
        return composerName;
    }

    public void setComposerName(String composerName) {
        this.composerName = composerName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public BigInteger getAudioId() {
        return audioId;
    }

    public void setAudioId(BigInteger audioId) {
        this.audioId = audioId;
    }

    public BigInteger getAudioCompanyId() {
        return audioCompanyId;
    }

    public void setAudioCompanyId(BigInteger audioCompanyId) {
        this.audioCompanyId = audioCompanyId;
    }

    public BigInteger getGenreId() {
        return genreId;
    }

    public void setGenreId(BigInteger genreId) {
        this.genreId = genreId;
    }

    public BigInteger getImageId() {
        return imageId;
    }

    public void setImageId(BigInteger imageId) {
        this.imageId = imageId;
    }

    public BigInteger getProductionHouseId() {
        return productionHouseId;
    }

    public void setProductionHouseId(BigInteger productionHouseId) {
        this.productionHouseId = productionHouseId;
    }

    public BigInteger getComposerId() {
        return composerId;
    }

    public void setComposerId(BigInteger composerId) {
        this.composerId = composerId;
    }

    public BigInteger getArtistId() {
        return artistId;
    }

    public void setArtistId(BigInteger artistId) {
        this.artistId = artistId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .append("lang", lang)
                .append("synopsis", synopsis)
                .append("releaseDate", releaseDate)
                .append("created", created)
                .append("createdBy", createdBy)
                .append("updated", updated)
                .append("updatedBy", updatedBy)
                .append("audioId", audioId)
                .append("audioName", audioName)
                .append("audioPath", audioPath)
                .append("audioCompanyId", audioCompanyId)
                .append("audioCompanyName", audioCompanyName)
                .append("genreId", genreId)
                .append("genre", genre)
                .append("imageId", imageId)
                .append("imageName", imageName)
                .append("imagePath", imagePath)
                .append("productionHouseId", productionHouseId)
                .append("productionHouseName", productionHouseName)
                .append("composerId", composerId)
                .append("composerName", composerName)
                .append("artistId", artistId)
                .append("artistName", artistName)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof MovieDetail)) return false;

        MovieDetail movieDetail = (MovieDetail) o;

        return new EqualsBuilder()
                .append(getId(), movieDetail.getId())
                .append(getName().toLowerCase(), movieDetail.getName().toLowerCase())
                .append(getLang().toLowerCase(), movieDetail.getLang().toLowerCase())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(getId())
                .append(getName().toLowerCase())
                .append(getLang().toLowerCase())
                .toHashCode();
    }
}
