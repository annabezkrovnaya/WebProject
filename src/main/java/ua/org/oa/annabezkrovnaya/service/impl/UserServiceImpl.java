package ua.org.oa.annabezkrovnaya.service.impl;

import ua.org.oa.annabezkrovnaya.dao.DaoFactory;
import ua.org.oa.annabezkrovnaya.dao.api.Dao;
import ua.org.oa.annabezkrovnaya.dto.UserDTO;
import ua.org.oa.annabezkrovnaya.mapper.BeanMapper;
import ua.org.oa.annabezkrovnaya.model.User;
import ua.org.oa.annabezkrovnaya.service.api.Service;

import java.util.List;

public class UserServiceImpl implements Service<Integer, UserDTO> {
    private static UserServiceImpl service;
    private Dao<Integer, User> userDao;
    private BeanMapper beanMapper;

    private UserServiceImpl() {
        userDao = DaoFactory.getInstance().getUserDao();
        beanMapper = BeanMapper.getInstance();
    }

    public static synchronized UserServiceImpl getInstance() {
        if (service == null) {
            service = new UserServiceImpl();
        }
        return service;
    }


    @Override
    public List<UserDTO> getAll() {
        List<User> users = userDao.getAll();
        List<UserDTO> userDTOS = beanMapper.listMapToList(users, UserDTO.class);
        return userDTOS;
    }

    @Override
    public void save(UserDTO userDTO) {
        User user = beanMapper.singleMapper(userDTO, User.class);
        userDao.save(user);
    }

    @Override
    public UserDTO getById(Integer id) {
        User user = userDao.getById(id);
        UserDTO userDTO = beanMapper.singleMapper(user, UserDTO.class);
        return userDTO;
    }

    public UserDTO getByLogin(String value){
        User user = userDao.getBy("login", value);
        UserDTO userDTO = beanMapper.singleMapper(user, UserDTO.class);
        return userDTO;
    }

    @Override
    public void delete(Integer key) {

    }

    @Override
    public void update(UserDTO entity) {

    }
}
