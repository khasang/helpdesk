package io.khasang.helpdesk.service;

import io.khasang.helpdesk.dao.Dao;
import io.khasang.helpdesk.dao.daoimpl.HibernateUserDao;
import io.khasang.helpdesk.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

@Component("UsersService")
//@Service("UserService")
@Transactional
public class UserService {

    @Autowired
    Dao dao;

//    @Autowired
//    HibernateUserDao hibernateUserDao;

//    JdbcUserDAO jdbcUserDAO;


    public List<Users> getUserList() {
        return dao.getUserList();
    }

    public Users getUserById(long id) {
        return dao.getUserById(id);
    }

    public void regUser(Users users) throws SQLException{
        dao.regUser(users);
    }

    public void addUser(Users users) throws SQLException{
        dao.addUser(users);
    }
}
