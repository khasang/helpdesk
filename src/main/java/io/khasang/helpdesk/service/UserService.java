package io.khasang.helpdesk.service;

import io.khasang.helpdesk.model.User;
import io.khasang.helpdesk.model.UserRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SingleColumnRowMapper;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public class UserService {
    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    UserRowMapper userRowMapper;

    public List<User> getUsersAsList() {
        String query = "select * from users";
        List<User> users = (List)jdbcTemplate.queryForList(query, userRowMapper);
        return users;
    }
}
