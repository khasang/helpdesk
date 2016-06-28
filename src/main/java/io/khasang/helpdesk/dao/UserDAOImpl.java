package io.khasang.helpdesk.dao;

import io.khasang.helpdesk.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDAOImpl implements UserDAO {
    private JdbcTemplate jdbcTemplate;

    public UserDAOImpl(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void saveOrUpdate(User user){
        if (user.getId() > 0) {
            String sql = "UPDATE users SET name=?, role_id=?, password=?, login=? WHERE id=?";
            jdbcTemplate.update(sql, user.getName(), user.getRole_id(), user.getPassword(),
                    user.getLogin(), user.getId());
        } else {
            String sql = "INSERT INTO users (name, role_id, password, login"
                        + "VALUES(?,?,?,?)";
            jdbcTemplate.update(sql, user.getName(), user.getRole_id(), user.getPassword(), user.getLogin());
        }
    }

    @Override
    public void delete(int id){
        System.out.println("@");
    }

    @Override
    public void get(int id){
        System.out.println("@");
    }

    @Override
    public List<User> list(){
        String sql = "SELECT * FROM users";
        List<User> list = jdbcTemplate.query(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setRole_id(rs.getInt("role_id"));
                user.setPassword(rs.getString("password"));
                user.setLogin(rs.getString("login"));
                return user;
            }
        });
        return list;
    }
}
