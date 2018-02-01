package ua.org.oa.annabezkrovnaya.dao.impl;

import ua.org.oa.annabezkrovnaya.model.Cinema;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

import static ua.org.oa.annabezkrovnaya.dao.impl.SQLs.INSERT_CINEMA;
import static ua.org.oa.annabezkrovnaya.dao.impl.SQLs.UPDATE_CINEMA;

public final class CinemaDaoImpl extends CrudDAO<Cinema> {

    public CinemaDaoImpl() {
        super(Cinema.class);
    }

    @Override
    protected PreparedStatement createUpdateStatement(Connection connection, Cinema entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_CINEMA);

        preparedStatement.setString(1, entity.getName());
        preparedStatement.setString(2, entity.getAddress());
        preparedStatement.setString(3, entity.getPlanUrl());
        preparedStatement.setInt(4, entity.getId());

        return preparedStatement;
    }

    @Override
    protected PreparedStatement createInsertStatement(Connection connection, Cinema entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CINEMA, Statement.RETURN_GENERATED_KEYS);

        preparedStatement.setString(1, entity.getName());
        preparedStatement.setString(2,entity.getAddress());
        preparedStatement.setString(3, entity.getPlanUrl());

        return preparedStatement;
    }

    @Override
    protected List<Cinema> readAll(ResultSet resultSet) throws SQLException {
        List<Cinema> result = new LinkedList<>();
        Cinema cinema = null;
        while (resultSet.next()){
            cinema = new Cinema();
            cinema.setId(resultSet.getInt("id"));
            cinema.setName(resultSet.getString("name"));
            cinema.setAddress(resultSet.getString("address"));
            cinema.setPlanUrl(resultSet.getString("planUrl"));
            result.add(cinema);
        }
        return result;
    }
}
