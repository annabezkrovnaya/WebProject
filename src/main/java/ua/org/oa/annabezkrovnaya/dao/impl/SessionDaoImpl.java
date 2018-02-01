package ua.org.oa.annabezkrovnaya.dao.impl;

import ua.org.oa.annabezkrovnaya.model.Session;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

import static ua.org.oa.annabezkrovnaya.dao.impl.SQLs.INSERT_SESSION;
import static ua.org.oa.annabezkrovnaya.dao.impl.SQLs.UPDATE_SESSION;

public final class SessionDaoImpl extends CrudDAO<Session> {

    private static SessionDaoImpl crudDAO;

    private SessionDaoImpl (Class type) {super(type);}

    public static synchronized SessionDaoImpl getInstance() {
        if (crudDAO == null) {
            crudDAO = new SessionDaoImpl(Session.class);
        }
        return crudDAO;
    }

    @Override
    protected PreparedStatement createUpdateStatement(Connection connection, Session entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_SESSION);
        preparedStatement.setTime(1, Time.valueOf(entity.getStartTime()));
        preparedStatement.setDouble(2, entity.getPrice());
        preparedStatement.setDouble(3, entity.getDiscount());
        preparedStatement.setInt(4, entity.getId());

        return preparedStatement;
    }

    @Override
    protected PreparedStatement createInsertStatement(Connection connection, Session entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SESSION, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setTime(1, Time.valueOf(entity.getStartTime()));
        preparedStatement.setDouble(2, entity.getPrice());
        preparedStatement.setDouble(3, entity.getDiscount());

        return preparedStatement;
    }

    @Override
    protected List<Session> readAll(ResultSet resultSet) throws SQLException {
        List<Session> result = new LinkedList<>();
        Session session = null;
        while (resultSet.next()){
            session = new Session();
            session.setId(resultSet.getInt("id"));
            session.setStartTime(resultSet.getTime("time").toLocalTime());
            session.setPrice(resultSet.getDouble("price"));
            session.setDiscount(resultSet.getDouble("discount"));
            result.add(session);
        }
        return result;
    }
}
