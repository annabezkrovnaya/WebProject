package ua.org.oa.annabezkrovnaya.dao.impl;

import ua.org.oa.annabezkrovnaya.model.Hall;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

import static ua.org.oa.annabezkrovnaya.dao.impl.SQLs.INSERT_HALL;
import static ua.org.oa.annabezkrovnaya.dao.impl.SQLs.UPDATE_HALL;

public class HallDaoImpl extends CrudDAO<Hall> {

    public HallDaoImpl() {
        super(Hall.class);
    }

    @Override
    protected PreparedStatement createUpdateStatement(Connection connection, Hall entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_HALL);

        preparedStatement.setString(1, entity.getDesignation());
        preparedStatement.setInt(2, entity.getRow());
        preparedStatement.setInt(3, entity.getSeat());
        preparedStatement.setString(4, entity.getFormat());
        preparedStatement.setInt(5, entity.getId());

        return preparedStatement;
    }

    @Override
    protected PreparedStatement createInsertStatement(Connection connection, Hall entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_HALL, Statement.RETURN_GENERATED_KEYS);

        preparedStatement.setString(1, entity.getDesignation());
        preparedStatement.setInt(2,entity.getRow());
        preparedStatement.setInt(3,entity.getSeat());
        preparedStatement.setString(4, entity.getFormat());

        return preparedStatement;
    }

    @Override
    protected List<Hall> readAll(ResultSet resultSet) throws SQLException {
        List<Hall> result = new LinkedList<>();
        Hall hall = null;
        while (resultSet.next()){
            hall = new Hall();
            hall.setId(resultSet.getInt("id"));
            hall.setDesignation(resultSet.getString("designation"));
            hall.setRow(resultSet.getInt("row"));
            hall.setSeat(resultSet.getInt("seat"));
            hall.setFormat(resultSet.getString("format"));
            result.add(hall);
        }
        return result;
    }
}
