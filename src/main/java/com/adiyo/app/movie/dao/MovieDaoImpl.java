package com.adiyo.app.movie.dao;

import com.adiyo.app.movie.model.MovieDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by kishorechava on 12/6/16.
 */

//@Repository
public class MovieDaoImpl implements MovieDao {

    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public List<MovieDetail> getMovies() {
        return jdbcTemplate.query("select * from movie", (resultSet, i) -> {
            return toMovie(resultSet);
        });
    }

    public List<MovieDetail> getAllMovieDetails() {
        String sql = "SELECT movie.id, movie.name, movie.lang, movie.release_date, movie.synopsis, \n" +
                "movie.created, movie.createdby, movie.updated, movie.updatedby composer.name as composer_name, \n" +
                "artist.name as artist_name,\n" +
                "audio.name as audio_name, audio.path as audio_path,\n" +
                "audio_company.name as audio_company_name,\n" +
                "genre.name as genre,\n" +
                "image.name as image_name, image.path as image_path,\n" +
                "production_house.name as production_house_name\n" +
                "  FROM movie\n" +
                "  LEFT OUTER JOIN movie_composer ON movie.ID = movie_composer.movie_id\n" +
                "  LEFT OUTER JOIN composer ON movie_composer.composer_id = composer.id\n" +
                "  LEFT OUTER JOIN movie_artist ON movie.ID = movie_artist.movie_id\n" +
                "  LEFT OUTER JOIN artist ON movie_artist.artist_id = artist.id\n" +
                "  LEFT OUTER JOIN movie_audio ON movie.ID = movie_audio.movie_id\n" +
                "  LEFT OUTER JOIN audio ON movie_audio.audio_id = audio.id\n" +
                "  LEFT OUTER JOIN movie_genre ON movie.ID = movie_genre.movie_id\n" +
                "  LEFT OUTER JOIN genre ON movie_genre.genre_id = genre.id\n" +
                "  LEFT OUTER JOIN movie_image ON movie.ID = movie_image.movie_id\n" +
                "  LEFT OUTER JOIN image ON movie_image.image_id = image.id\n" +
                "  LEFT OUTER JOIN movie_acompany ON movie.ID = movie_acompany.movie_id\n" +
                "  LEFT OUTER JOIN audio_company ON movie_acompany.acompany_id = audio_company.id\n" +
                "  LEFT OUTER JOIN movie_phouse ON movie.ID = movie_phouse.movie_id\n" +
                "  LEFT OUTER JOIN production_house ON movie_phouse.phouse_id = production_house.id";

        return jdbcTemplate.query("select * from movie", (resultSet, i) -> {
            return toMovie(resultSet);
        });
    }

    private MovieDetail toMovie(ResultSet resultSet) throws SQLException {
        MovieDetail movieDetail = new MovieDetail();
        movieDetail.setId(BigInteger.valueOf(resultSet.getInt("id")));
        movieDetail.setName(resultSet.getString("name"));
        movieDetail.setLang(resultSet.getString("lang"));
        movieDetail.setReleaseDate(resultSet.getDate("release_date").toLocalDate());
        movieDetail.setSynopsis(resultSet.getString("synopsis"));
        movieDetail.setCreated(resultSet.getDate("created").toInstant());
        movieDetail.setCreatedBy(resultSet.getString("createdby"));
        movieDetail.setUpdated(resultSet.getDate("updated").toInstant());
        movieDetail.setUpdatedBy(resultSet.getString("updatedby"));
        movieDetail.setComposerName(resultSet.getString("composer_name"));
        movieDetail.setArtistName(resultSet.getString("artist_name"));
        movieDetail.setAudioName(resultSet.getString("audio_name"));
        movieDetail.setAudioPath(resultSet.getString("audio_path"));
        movieDetail.setAudioCompanyName(resultSet.getString("audio_company_name"));
        movieDetail.setGenre(resultSet.getString("genre"));
        movieDetail.setImageName(resultSet.getString("image_name"));
        movieDetail.setImagePath(resultSet.getString("image_path"));
        movieDetail.setProductionHouseName(resultSet.getString("production_house_name"));
        return movieDetail;
    }
}
