package com.adiyo.app.movie.model;

import java.io.Serializable;

/**
 * Created by kishorechava on 12/18/16.
 */
public class SearchCriteria implements Serializable {

    private static final long serialVersionUID = 1L;

    private String artistName;

    private String composerName;

    public SearchCriteria(String artistName, String composerName) {
        this.artistName = artistName;
        this.composerName = composerName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getComposerName() {
        return composerName;
    }

    public void setComposerName(String composerName) {
        this.composerName = composerName;
    }
}
