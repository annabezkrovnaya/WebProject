package ua.org.oa.annabezkrovnaya.service.impl;

import ua.org.oa.annabezkrovnaya.dao.DaoFactory;
import ua.org.oa.annabezkrovnaya.dao.api.Dao;
import ua.org.oa.annabezkrovnaya.dao.impl.MovieDaoImpl;
import ua.org.oa.annabezkrovnaya.dto.MovieDTO;
import ua.org.oa.annabezkrovnaya.mapper.BeanMapper;
import ua.org.oa.annabezkrovnaya.model.Movie;
import ua.org.oa.annabezkrovnaya.service.api.Service;

import java.util.List;

public class MovieServiceImpl implements Service<Integer, MovieDTO> {

    private static MovieServiceImpl service;
    private Dao<Integer, Movie> movieDao;
    private BeanMapper beanMapper;

    private MovieServiceImpl() {
        movieDao = DaoFactory.getInstance().getMovieDao();
        beanMapper = BeanMapper.getInstance();
    }

    public static synchronized MovieServiceImpl getInstance() {
        if (service == null) {
            service = new MovieServiceImpl();
        }
        return service;
    }


    @Override
    public List<MovieDTO> getAll() {
        List<Movie> movies = movieDao.getAll();
        List<MovieDTO> movieDTOs = beanMapper.listMapToList(movies, MovieDTO.class);
        return movieDTOs;
    }

    @Override
    public void save(MovieDTO movieDto) {
        Movie movie = beanMapper.singleMapper(movieDto, Movie.class);
        movieDao.save(movie);
    }

    @Override
    public MovieDTO getById(Integer id) {
        Movie movie = movieDao.getById(id);
        MovieDTO movieDTO = beanMapper.singleMapper(movie, MovieDTO.class);
        return movieDTO;
    }


    @Override
    public void delete(Integer key) {

    }

    @Override
    public void update(MovieDTO entity) {

    }

}
