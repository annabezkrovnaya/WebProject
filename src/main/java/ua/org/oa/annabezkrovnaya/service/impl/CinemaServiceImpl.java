package ua.org.oa.annabezkrovnaya.service.impl;

import ua.org.oa.annabezkrovnaya.dao.DaoFactory;
import ua.org.oa.annabezkrovnaya.dao.api.Dao;
import ua.org.oa.annabezkrovnaya.dto.CinemaDTO;
import ua.org.oa.annabezkrovnaya.mapper.BeanMapper;
import ua.org.oa.annabezkrovnaya.model.Cinema;
import ua.org.oa.annabezkrovnaya.service.api.Service;

import java.util.List;

public class CinemaServiceImpl implements Service<Integer, CinemaDTO> {

    private static CinemaServiceImpl service;
    private Dao<Integer, Cinema> cinemaDao;
    private BeanMapper beanMapper;

    private CinemaServiceImpl() {
        cinemaDao = DaoFactory.getInstance().getCinemaDao();
        beanMapper = BeanMapper.getInstance();
    }

    public static synchronized CinemaServiceImpl getInstance() {
        if (service == null) {
            service = new CinemaServiceImpl();
        }
        return service;
    }


    @Override
    public List<CinemaDTO> getAll() {
        List<Cinema> cinemas = cinemaDao.getAll();
        List<CinemaDTO> cinemaDTOS = beanMapper.listMapToList(cinemas, CinemaDTO.class);
        return cinemaDTOS;
    }

    @Override
    public void save(CinemaDTO cinemaDTO) {
        Cinema cinema = beanMapper.singleMapper(cinemaDTO, Cinema.class);
        cinemaDao.save(cinema);
    }

    @Override
    public CinemaDTO getById(Integer id) {
        Cinema cinema = cinemaDao.getById(id);
        CinemaDTO cinemaDTO = beanMapper.singleMapper(cinema, CinemaDTO.class);
        return cinemaDTO;
    }


    @Override
    public void delete(Integer key) {

    }

    @Override
    public void update(CinemaDTO entity) {

    }
}
