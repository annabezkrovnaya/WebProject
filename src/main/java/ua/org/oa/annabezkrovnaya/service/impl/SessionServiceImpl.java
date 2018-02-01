package ua.org.oa.annabezkrovnaya.service.impl;

import ua.org.oa.annabezkrovnaya.dao.DaoFactory;
import ua.org.oa.annabezkrovnaya.dao.api.Dao;
import ua.org.oa.annabezkrovnaya.dto.SessionDTO;
import ua.org.oa.annabezkrovnaya.mapper.BeanMapper;
import ua.org.oa.annabezkrovnaya.model.Session;
import ua.org.oa.annabezkrovnaya.service.api.Service;

import java.util.List;

public class SessionServiceImpl implements Service<Integer, SessionDTO> {

    private static SessionServiceImpl service;
    private Dao<Integer, Session> sessionDao;
    private BeanMapper beanMapper;

    private SessionServiceImpl() {
        sessionDao = DaoFactory.getInstance().getSessionDao();
        beanMapper = BeanMapper.getInstance();
    }

    public static synchronized SessionServiceImpl getInstance() {
        if (service == null) {
            service = new SessionServiceImpl();
        }
        return service;
    }

    @Override
    public List<SessionDTO> getAll() {
        List<Session> sessions = sessionDao.getAll();
        List<SessionDTO> movieDTOs = beanMapper.listMapToList(sessions, SessionDTO.class);
        return movieDTOs;
    }

    @Override
    public void save(SessionDTO sessionDTO) {
        Session session = beanMapper.singleMapper(sessionDTO, Session.class);
        sessionDao.save(session);
    }

    @Override
    public SessionDTO getById(Integer id) {
        Session session = sessionDao.getById(id);
        SessionDTO sessionDTO = beanMapper.singleMapper(session, SessionDTO.class);
        return sessionDTO;
    }


    @Override
    public void delete(Integer key) {

    }

    @Override
    public void update(SessionDTO entity) {

    }
}
