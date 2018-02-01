package ua.org.oa.annabezkrovnaya.dao.impl;

import ua.org.oa.annabezkrovnaya.model.PaymentCard;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

import static ua.org.oa.annabezkrovnaya.dao.impl.SQLs.INSERT_PAYMENT_CARD;
import static ua.org.oa.annabezkrovnaya.dao.impl.SQLs.UPDATE_PAYMENT_CARD;

public class PaymentCardDaoImpl extends CrudDAO<PaymentCard> {

    public PaymentCardDaoImpl() {
        super(PaymentCard.class);
    }

    @Override
    protected PreparedStatement createUpdateStatement(Connection connection, PaymentCard entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PAYMENT_CARD);

        preparedStatement.setString(1, entity.getType());
        preparedStatement.setString(2, entity.getCardNumber());
        preparedStatement.setDate(3, Date.valueOf(entity.getValidDate()));
        preparedStatement.setString(4, entity.getOwnerName());
        preparedStatement.setString(5, entity.getSecurityCode());
        preparedStatement.setInt(6, entity.getId());

        return preparedStatement;
    }

    @Override
    protected PreparedStatement createInsertStatement(Connection connection, PaymentCard entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PAYMENT_CARD, Statement.RETURN_GENERATED_KEYS);

        preparedStatement.setString(1, entity.getType());
        preparedStatement.setString(2, entity.getCardNumber());
        preparedStatement.setDate(3, Date.valueOf(entity.getValidDate()));
        preparedStatement.setString(4, entity.getOwnerName());
        preparedStatement.setString(5, entity.getSecurityCode());

        return preparedStatement;
    }

    @Override
    protected List<PaymentCard> readAll(ResultSet resultSet) throws SQLException {

        List<PaymentCard> result = new LinkedList<>();
        PaymentCard paymentCard = null;
        while (resultSet.next()){
            paymentCard = new PaymentCard();
            paymentCard.setId(resultSet.getInt("id"));
            paymentCard.setType(resultSet.getString("type"));
            paymentCard.setCardNumber(resultSet.getString("cardNumber"));
            paymentCard.setValidDate(resultSet.getDate("validDate").toLocalDate());
            paymentCard.setOwnerName(resultSet.getString("ownerName"));
            paymentCard.setSecurityCode(resultSet.getString("securityCode"));
            result.add(paymentCard);
        }
        return result;
    }
}
