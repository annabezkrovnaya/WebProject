package ua.org.oa.annabezkrovnaya.dao.impl;


import ua.org.oa.annabezkrovnaya.model.Movie;

import java.sql.*;

import java.util.LinkedList;
import java.util.List;

import static ua.org.oa.annabezkrovnaya.dao.impl.SQLs.INSERT_MOVIE;
import static ua.org.oa.annabezkrovnaya.dao.impl.SQLs.UPDATE_MOVIE;

public final class MovieDaoImpl extends CrudDAO<Movie> {

    private static MovieDaoImpl crudDAO;

    private MovieDaoImpl(Class type) {
        super(type);
    }


    public static synchronized MovieDaoImpl getInstance() {
        if (crudDAO == null) {
            crudDAO = new MovieDaoImpl(Movie.class);
        }
        return crudDAO;
    }

    @Override
    protected PreparedStatement createUpdateStatement(Connection connection, Movie entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_MOVIE);
        preparedStatement.setString(1, entity.getTitle());
        preparedStatement.setString(2, entity.getGenre());
        preparedStatement.setString(3, entity.getCountry());
        preparedStatement.setString(4, entity.getAgeLimit());
        preparedStatement.setString(5, entity.getFormat());
        preparedStatement.setDouble(6, entity.getDuration());
        preparedStatement.setDate(7, Date.valueOf(entity.getStartDate()));
        preparedStatement.setDate(8, Date.valueOf(entity.getFinishDate()));
        preparedStatement.setString(9, entity.getPosterUrl());
        preparedStatement.setString(10, entity.getTrailerUrl());
        preparedStatement.setString(11, entity.getDescription());
        preparedStatement.setInt(12, entity.getId());
        return preparedStatement;
    }

    @Override
    public PreparedStatement createInsertStatement(Connection connection, Movie entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_MOVIE, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1, entity.getTitle());
        preparedStatement.setString(2, entity.getGenre());
        preparedStatement.setString(3, entity.getCountry());
        preparedStatement.setString(4, entity.getAgeLimit());
        preparedStatement.setString(5, entity.getFormat());
        preparedStatement.setDouble(6, entity.getDuration());
        preparedStatement.setDate(7, Date.valueOf(entity.getStartDate()));
        preparedStatement.setDate(8, Date.valueOf(entity.getFinishDate()));
        preparedStatement.setString(9, entity.getPosterUrl());
        preparedStatement.setString(10, entity.getTrailerUrl());
        preparedStatement.setString(11, entity.getDescription());
        return preparedStatement;
    }

    @Override
    public List<Movie> readAll(ResultSet resultSet) throws SQLException {
        List<Movie> result = new LinkedList<>();
        Movie movie = null;
        while (resultSet.next()) {
            movie = new Movie();
            movie.setId(resultSet.getInt("id"));
            movie.setTitle(resultSet.getString("title"));
            movie.setGenre(resultSet.getString("genre"));
            movie.setCountry(resultSet.getString("country"));
            movie.setAgeLimit(resultSet.getString("format"));
            movie.setDuration(resultSet.getDouble("duration"));
            movie.setStartDate(resultSet.getDate("startDate").toLocalDate());
            movie.setFinishDate(resultSet.getDate("finishDate").toLocalDate());
            movie.setPosterUrl(resultSet.getString("posterUrl"));
            movie.setTrailerUrl(resultSet.getString("trailerUrl"));
            movie.setDescription(resultSet.getString("description"));

            result.add(movie);
        }
        return result;
    }

}
