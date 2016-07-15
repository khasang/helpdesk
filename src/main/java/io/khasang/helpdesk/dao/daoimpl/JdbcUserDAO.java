package io.khasang.helpdesk.dao.daoimpl;

import io.khasang.helpdesk.controller.AppContoller;
import io.khasang.helpdesk.dao.Dao;
import io.khasang.helpdesk.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class JdbcUserDAO implements Dao{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    User user;

    @Override
    public void addUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public void createUser() {

    }

    @Override
    public void regUser(User user) {
        Map<String, Object> regParam = new HashMap<>(3);
        regParam.put("login", user.getLogin());
        regParam.put("password", user.getPassword());
        regParam.put("role", user.getRole());
        regParam.put("email", user.getEmail());
        jdbcInsert.execute(regParam);
    }
}
