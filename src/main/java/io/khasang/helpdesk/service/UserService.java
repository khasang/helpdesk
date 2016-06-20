package io.khasang.helpdesk.service;

import io.khasang.helpdesk.model.User;
import io.khasang.helpdesk.model.UserRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
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
        List<User> users = jdbcTemplate.query(query,
                new BeanPropertyRowMapper(User.class));
        return users;
    }

//    public List<User> getUsersAsList() {
//        String query = "select * from users";
//        List<User> users = new ArrayList<>();
//
//        final List<Map<String, Object>> rows = jdbcTemplate.queryForList(query);
//        for (Map<String, Object> row : rows) {
//            User user = new User();
//            user.setId(Integer.parseInt(String.valueOf(row.get("id"))));
//            user.setLogin((String) row.get("login"));
//            user.setPassword((String) row.get("password"));
//            user.setRole((String) row.get("role"));
//            users.add(user);
//        }
//        return users;
//    }
}
