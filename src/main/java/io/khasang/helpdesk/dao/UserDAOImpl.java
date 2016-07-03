package io.khasang.helpdesk.dao;


import io.khasang.helpdesk.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDAOImpl implements UserDAO {

    public static final String SELECT_BY_ID = "SELECT * FROM users WHERE id = ?";
    public static final String INSERT_USER = "INSERT INTO users (firstName, secondName, role_id, roles, login, password)" +
            " VALUES " + "(?, ?, ?, ?, ?, ?)";
    public static final String SELECT_FROM_USERS = "SELECT * FROM users";
    public static final String UPDATE_USER = "UPDATE users SET firstName=?, secondName=?, role_id=?, roles=?, " +
            "login=?, password=? WHERE id=?";
    public static final String DELETE_FROM_USERS = "DELETE FROM users WHERE id=?";

    private JdbcTemplate jdbcTemplate;

    public UserDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public UserDAOImpl() {

    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public User getById(long id) {
        User user = jdbcTemplate.queryForObject(SELECT_BY_ID, new Object[]{id}, new UserRowMapper());
        return user;
    }

    @Override
    public void insert(User users) {
        jdbcTemplate.update(INSERT_USER, new Object[]{users.getFirstName(),
                users.getSecondName(), users.getRole_id(), users.getRoles(), users.getLogin(),
                users.getPassword()});

    }

    @Override
    public List<User> getAll() {
        List<User> users = jdbcTemplate.query(SELECT_FROM_USERS, new UserRowMapper());
        return users;
    }

    @Override
    public void update(User users) {
        jdbcTemplate.update(UPDATE_USER, new Object[]{users.getId(), users.getId(), users.getFirstName(),
                users.getSecondName(), users.getRole_id(), users.getRoles(), users.getLogin(),
                users.getPassword()});
    }

    @Override
    public void deleteById(long id) {
        jdbcTemplate.update(DELETE_FROM_USERS, id);
    }

    public class UserRowMapper implements RowMapper<User> {

        @Override
        public User mapRow(ResultSet resultSet, int i) throws SQLException {
            User user = new User();
            user.setId(resultSet.getLong("id"));
            user.setFirstName(resultSet.getString("firstName"));
            user.setSecondName(resultSet.getString("secondName"));
            user.setRole_id(resultSet.getLong("role_Id"));
            user.setRoles(resultSet.getString("roles"));
            user.setLogin(resultSet.getString("login"));
            user.setPassword(resultSet.getString("password"));
            return user;
        }
    }

}
