package io.khasang.helpdesk.db.impl;

import io.khasang.helpdesk.db.UserDAO;
import io.khasang.helpdesk.entities.User;
import io.khasang.helpdesk.enums.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Repository
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
        String sql = "select * from users where id = ?";
        User user = jdbcTemplate.queryForObject(
                sql,
                new Object[]{id},
                new UserRowMapper());
        return user;
    }

    @Override
    public User getUserByLogin(String login) {
        String sql = "select * from users where login = ?";
        User user = jdbcTemplate.queryForObject(
                sql,
                new Object[]{login},
                new UserRowMapper());
        return user;
    }

    @Override
    public List<User> getUserList() {
        String query = "select * from users";
        List<User> users = jdbcTemplate.query(query,
                new BeanPropertyRowMapper(User.class));
        return users;
    }

    private static final class UserRowMapper implements RowMapper<User> {
        @Override
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setLogin(rs.getString("login"));
            user.setPassword(rs.getString("password"));
            user.setRole(Role.valueOf(rs.getString("role")));
            return user;
        }
    }
}
