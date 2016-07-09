package io.khasang.helpdesk.services;

import io.khasang.helpdesk.dao.UserDAO;
import io.khasang.helpdesk.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public Users getById(long id) {
        return userDAO.getById(id);
    }

    @Override
    public void insert(Users users) {
        userDAO.insert(users);
    }

    @Override
    public List<Users> getAll() {
        return userDAO.getAll();
    }

    @Override
    public void update(Users users) {
        userDAO.update(users);
    }

    @Override
    public void deleteById(long id) {
        userDAO.deleteById(id);
    }
}
