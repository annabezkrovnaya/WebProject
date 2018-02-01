package ua.org.oa.annabezkrovnaya.dao.impl;

public class SQLs {

    public static final String SELECT_ALL = "Select * from %s";
    public static final String FIND_BY_ID = "Select * from %s where id = ?";
    public static final String FIND_BY = "Select * from %s where %s = ?";
    public static final String DELETE_BY_ID = "DELETE FROM %s WHERE id = ?";

    public static  final String INSERT_MOVIE = "Insert into movie (title, genre, country, ageLimit, format, duration,  startDate, finishDate, posterUrl, trailerUrl, description) values (?,?,?,?,?,?,?,?,?,?,?)";
    public static  final String UPDATE_MOVIE = "UPDATE movie SET title = ?, genre = ?, country = ?, ageLimit = ?, format = ?, duration = ?, startDate = ?, finishDate = ?, posterUrl = ?, trailerUrl = ?, description = ?, WHERE id = ?";

    public static  final String UPDATE_USER = "UPDATE user SET login = ?, password = ?, eMail = ?, phoneNumber = ?, Role_id = ?, Paymentcard_id = ?, WHERE id = ?";
    public static  final String INSERT_USER = "Insert into user (login, password, eMail, phoneNumber, Role_id, Paymentcard_id) values (?,?,?,?,?,?)";

    public static final String INSERT_PAYMENT_CARD = "Insert into paymentcard (type, cardNumber, validDate, ownerName, securityCode) values (?,?,?,?,?)";
    public static final String UPDATE_PAYMENT_CARD = "UPDATE paymentcard SET type = ?, cardNumber = ?, validDate = ?, ownerName = ?, securityCode = ?, WHERE id = ?";

    public static final String INSERT_ROLE = "Insert into role (roleName) values (?)";
    public static final String UPDATE_ROLE = "UPDATE role SET roleName = ?, WHERE id = ?";

    public static final String INSERT_TICKET = "Insert into ticket (currentDate, currentTime, currentMovieTitle, currentRow, currentSeat, currentPrice, currentDiscount, tempQRUrl) values (?,?,?,?,?,?,?,?)";
    public static final String UPDATE_TICKET = "UPDATE ticket SET currentDate = ?, currentTime = ?, currentMovieTitle = ?, currentRow = ?, currentSeat = ?, currentPrice = ?, currentDiscount = ?, tempQRUrl = ?, WHERE id = ?";

    public static final String GET_TEN_LAST_MOVIES = "SELECT * FROM movie ORDER BY id DESC LIMIT 10";

    public static final String INSERT_SESSION = "Insert into session (time, price, discount) values (?,?,?)";
    public static final String UPDATE_SESSION = "UPDATE session SET time = ?, price = ?, discount = ?, WHERE id = ?";

    public static final String INSERT_CINEMA = "Insert into cinema (name, address, planUrl) values (?,?,?)";
    public static final String UPDATE_CINEMA = "UPDATE cinema SET name = ?, address = ?, planUrl = ?, WHERE id = ?";

    public static final String INSERT_HALL = "Insert into hall (designation, row, seat, format) values (?,?,?,?)";
    public static final String UPDATE_HALL = "UPDATE hall SET designation = ?, row = ?, seat = ?, format = ?, WHERE id = ?";






}
