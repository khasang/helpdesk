package io.khasang.helpdesk.dao;

import io.khasang.helpdesk.model.User;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class UserDAOImpl implements UserDAO {
    private JdbcTemplate jdbcTemplate;

    public UserDAOImpl(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void saveOrUpdate(User user){
        if (user.getId() > 0) {
            // update
            String sql = "UPDATE contact SET name=?, email=?, address=?, "
                    + "telephone=? WHERE contact_id=?";
            jdbcTemplate.update(sql, contact.getName(), contact.getEmail(),
                    contact.getAddress(), contact.getTelephone(), contact.getId());
        } else {
            // insert
            String sql = "INSERT INTO contact (name, email, address, telephone)"
                    + " VALUES (?, ?, ?, ?)";
            jdbcTemplate.update(sql, contact.getName(), contact.getEmail(),
                    contact.getAddress(), contact.getTelephone());
        }
    }

    @Override
    public void delete(int id){

    }

    @Override
    public void get(int id){

    }

    @Override
    public List<User> list(){

    }
}
