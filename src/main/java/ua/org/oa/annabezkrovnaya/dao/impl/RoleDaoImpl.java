package ua.org.oa.annabezkrovnaya.dao.impl;

import ua.org.oa.annabezkrovnaya.model.Role;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

import static ua.org.oa.annabezkrovnaya.dao.impl.SQLs.INSERT_ROLE;
import static ua.org.oa.annabezkrovnaya.dao.impl.SQLs.UPDATE_ROLE;

public class RoleDaoImpl extends CrudDAO<Role>{

    public RoleDaoImpl() {
        super(Role.class);
    }

    @Override
    protected PreparedStatement createUpdateStatement(Connection connection, Role entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_ROLE);

        preparedStatement.setString(1, entity.getRoleName());
        preparedStatement.setInt(2, entity.getId());

        return preparedStatement;
    }

    @Override
    protected PreparedStatement createInsertStatement(Connection connection, Role entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_ROLE, Statement.RETURN_GENERATED_KEYS);

        preparedStatement.setString(1, entity.getRoleName());

        return preparedStatement;
    }

    @Override
    protected List<Role> readAll(ResultSet resultSet) throws SQLException {

        List<Role> result = new LinkedList<>();
        Role role = null;
        while (resultSet.next()){
            role = new Role();
            role.setId(resultSet.getInt("id"));
            role.setRoleName(resultSet.getString("roleName"));
            result.add(role);
        }
        return result;
    }
}
