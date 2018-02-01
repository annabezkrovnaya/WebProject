package ua.org.oa.annabezkrovnaya.dao;

import ua.org.oa.annabezkrovnaya.dao.api.Dao;
import ua.org.oa.annabezkrovnaya.dao.impl.*;
import ua.org.oa.annabezkrovnaya.helper.PropertyHolder;
import ua.org.oa.annabezkrovnaya.model.*;

public class DaoFactory {

    private static DaoFactory instance = null;

    private Dao<Integer, Movie> movieDao;
    private Dao<Integer, User> userDao;
    private Dao<Integer, Role> roleDao;
    private Dao<Integer, PaymentCard> paymentCardDao;
    private Dao<Integer, Ticket> ticketDao;
    private Dao<Integer, Session> sessionDao;
    private Dao<Integer, Cinema> cinemaDao;




    private DaoFactory(){
        loadDaos();
    }



    public static DaoFactory getInstance(){
        if(instance == null){
            instance = new DaoFactory();
        }
        return instance;
    }

    private void loadDaos() {
        if(PropertyHolder.getInstance().isInMemoryDB()){
            //inmemory daos
        }else{
            //jdbc daos
            movieDao = MovieDaoImpl.getInstance();
            userDao = new UserDaoImpl(User.class);
            roleDao = new RoleDaoImpl();
            paymentCardDao = new PaymentCardDaoImpl();
            ticketDao = new TicketDaoImpl();
            sessionDao = SessionDaoImpl.getInstance();
            cinemaDao = new CinemaDaoImpl();
        }
    }

    public Dao<Integer, Movie> getMovieDao() {
        return movieDao;
    }

    public void setMovieDao(Dao<Integer, Movie> movieDao) {
        this.movieDao = movieDao;
    }

    public static void setInstance(DaoFactory instance) {
        DaoFactory.instance = instance;
    }

    public Dao<Integer, User> getUserDao() {
        return userDao;
    }

    public void setUserDao(Dao<Integer, User> userDao) {
        this.userDao = userDao;
    }

    public Dao<Integer, Role> getRoleDao() {
        return roleDao;
    }

    public void setRoleDao(Dao<Integer, Role> roleDao) {
        this.roleDao = roleDao;
    }

    public Dao<Integer, PaymentCard> getPaymentCardDao() {
        return paymentCardDao;
    }

    public void setPaymentCardDao(Dao<Integer, PaymentCard> paymentCardDao) {
        this.paymentCardDao = paymentCardDao;
    }

    public Dao<Integer, Ticket> getTicketDao() {
        return ticketDao;
    }

    public void setTicketDao(Dao<Integer, Ticket> ticketDao) {
        this.ticketDao = ticketDao;
    }

    public Dao<Integer, Session> getSessionDao() {
        return sessionDao;
    }

    public void setSessionDao(Dao<Integer, Session> sessionDao) {
        this.sessionDao = sessionDao;
    }

    public Dao<Integer, Cinema> getCinemaDao() {
        return cinemaDao;
    }

    public void setCinemaDao(Dao<Integer, Cinema> cinemaDao) {
        this.cinemaDao = cinemaDao;
    }
}
