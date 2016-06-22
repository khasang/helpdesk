package io.khasang.helpdesk.db.impl;

import io.khasang.helpdesk.db.UserDAO;
import io.khasang.helpdesk.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class JdbcUserDAO implements UserDAO {

    private JdbcTemplate jdbcTemplate;

    private SimpleJdbcInsert insertUser;

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    public JdbcUserDAO(DataSource dataSource, JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
        insertUser = new SimpleJdbcInsert(dataSource).withTableName("users").usingGeneratedKeyColumns("id");
    }

    @Override
    public void addUser(User user) {
        Map<String, Object> parameters = new HashMap<String, Object>(3);
        parameters.put("login", user.getLogin());
        parameters.put("password", user.getPassword());
        parameters.put("role", user.getRole());
        insertUser.execute(parameters);
    }

    @Override
    public void updateUser(User user) {
        String query = "update users set login = :login, password = :password, role = :role where id = :id";
        SqlParameterSource namedParameters = new BeanPropertySqlParameterSource(user);
        namedParameterJdbcTemplate.update(query, namedParameters);
    }

    @Override
    public void deleteUser(User user) {
        String sql = "delete from users where id = ?";
        jdbcTemplate.update(sql, user.getId());
    }

    @Override
    public void deleteAllUsers() {
        String sql = "TRUNCATE TABLE users";
        jdbcTemplate.execute(sql);
    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public User getUserByLogin(String login) {
        return null;
    }

    @Override
    public List<User> getAllUserList() {
        String query = "select * from users";
        List<User> users = jdbcTemplate.query(query,
                new BeanPropertyRowMapper(User.class));
        return users;
    }
}
