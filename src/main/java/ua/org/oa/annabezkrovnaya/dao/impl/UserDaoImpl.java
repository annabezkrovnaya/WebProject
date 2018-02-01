package ua.org.oa.annabezkrovnaya.dao.impl;

import ua.org.oa.annabezkrovnaya.dao.DaoFactory;
import ua.org.oa.annabezkrovnaya.model.User;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

import static ua.org.oa.annabezkrovnaya.dao.impl.SQLs.INSERT_USER;
import static ua.org.oa.annabezkrovnaya.dao.impl.SQLs.UPDATE_USER;

public class UserDaoImpl extends CrudDAO<User> {

    private static UserDaoImpl crudDAO;
    public UserDaoImpl(Class type) {
        super(type);
    }

    public static synchronized UserDaoImpl getInstance() {
        if (crudDAO == null) {
            crudDAO = new UserDaoImpl(User.class);
        }
        return crudDAO;
    }

    @Override
    protected PreparedStatement createUpdateStatement(Connection connection, User entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USER);
        setStatement(entity, preparedStatement);
        return preparedStatement;
    }

    @Override
    protected PreparedStatement createInsertStatement(Connection connection, User entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER, Statement.RETURN_GENERATED_KEYS);
        setStatement(entity, preparedStatement);
        return preparedStatement;
    }

    private void setStatement(User entity, PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.setString(1, entity.getLogin());
        preparedStatement.setString(2, entity.getPassword());
        preparedStatement.setString(3, entity.geteMail());
        preparedStatement.setString(4, entity.getPhoneNumber());
        preparedStatement.setInt(5, entity.getCurrentRole().getId());
        preparedStatement.setInt(6, entity.getOwnCard().getId());
        preparedStatement.setArray(7, (Array) entity.getCurrentTicketList());
    }


    @Override
    protected List<User> readAll(ResultSet resultSet) throws SQLException {
        List<User> result = new LinkedList<>();
        User user = null;
        while (resultSet.next()) {
            user = new User();
            user.setId(resultSet.getInt("id"));
            user.setLogin(resultSet.getString("login"));
            user.setPassword(resultSet.getString("password"));
            user.seteMail(resultSet.getString("eMail"));
            user.setPhoneNumber(resultSet.getString("phoneNumber"));
            user.setCurrentRole(DaoFactory.getInstance().getRoleDao().getById(resultSet.getInt("role_id")));
            user.setOwnCard(DaoFactory.getInstance().getPaymentCardDao().getById(resultSet.getInt("paymentcard_id")));

        }
        return result;
    }
}
