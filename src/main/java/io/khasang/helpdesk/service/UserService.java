package io.khasang.helpdesk.service;

import io.khasang.helpdesk.dao.Dao;
import io.khasang.helpdesk.dao.daoimpl.JdbcUserDAO;
import io.khasang.helpdesk.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class UserService {

//    @Autowired
//    Dao dao;

    JdbcUserDAO jdbcUserDAO;

    public void regUser(User user){
        jdbcUserDAO.regUser(user);
    }
}
