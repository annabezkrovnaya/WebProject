package ua.org.oa.annabezkrovnaya.dao.impl;

import ua.org.oa.annabezkrovnaya.model.Ticket;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

import static ua.org.oa.annabezkrovnaya.dao.impl.SQLs.INSERT_TICKET;
import static ua.org.oa.annabezkrovnaya.dao.impl.SQLs.UPDATE_TICKET;

public class TicketDaoImpl extends CrudDAO<Ticket> {

    public TicketDaoImpl() {
        super(Ticket.class);
    }

    @Override
    protected PreparedStatement createUpdateStatement(Connection connection, Ticket entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_TICKET);
        preparedStatement.setDate(1, Date.valueOf(entity.getCurrentDate()));
        preparedStatement.setTime(2, Time.valueOf(entity.getCurrentTime()));
        preparedStatement.setString(3, entity.getCurrentMovieTitle());
        preparedStatement.setInt(4, entity.getCurrentRow());
        preparedStatement.setInt(5, entity.getCurrentSeat());
        preparedStatement.setDouble(6, entity.getCurrentPrice());
        preparedStatement.setDouble(7, entity.getCurrentDiscount());
        preparedStatement.setString(8, entity.getTempQRUrl());
        preparedStatement.setInt(9, entity.getId());

        return preparedStatement;
    }

    @Override
    protected PreparedStatement createInsertStatement(Connection connection, Ticket entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_TICKET, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setDate(1, Date.valueOf(entity.getCurrentDate()));
        preparedStatement.setTime(2, Time.valueOf(entity.getCurrentTime()));
        preparedStatement.setString(3, entity.getCurrentMovieTitle());
        preparedStatement.setInt(4, entity.getCurrentRow());
        preparedStatement.setInt(5, entity.getCurrentSeat());
        preparedStatement.setDouble(6, entity.getCurrentPrice());
        preparedStatement.setDouble(7, entity.getCurrentDiscount());
        preparedStatement.setString(8, entity.getTempQRUrl());

        return preparedStatement;
    }

    @Override
    protected List<Ticket> readAll(ResultSet resultSet) throws SQLException {
        List<Ticket> result = new LinkedList<>();
        Ticket ticket = null;
        while (resultSet.next()){
            ticket = new Ticket();
            ticket.setId(resultSet.getInt("id"));
            ticket.setCurrentDate(resultSet.getDate("currentDate").toLocalDate());
            ticket.setCurrentTime(resultSet.getTime("currentTime").toLocalTime());
            ticket.setCurrentMovieTitle(resultSet.getString("currentMovieTitle"));
            ticket.setCurrentRow(resultSet.getInt("currentRow"));
            ticket.setCurrentSeat(resultSet.getInt("currentSeat"));
            ticket.setCurrentPrice(resultSet.getDouble("currentPrice"));
            ticket.setCurrentDiscount(resultSet.getDouble("currentDiscount"));
            ticket.setTempQRUrl(resultSet.getString("tempQRUrl"));
            result.add(ticket);
        }
        return result;
    }
}

