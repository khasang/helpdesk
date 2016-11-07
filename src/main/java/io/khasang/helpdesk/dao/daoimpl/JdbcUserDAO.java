package io.khasang.helpdesk.dao.daoimpl;

import io.khasang.helpdesk.dao.Dao;
import io.khasang.helpdesk.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JdbcUserDAO implements Dao {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public JdbcUserDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

//    @Autowired
//    Users users;

    @Autowired
    Users users;

    @Override
    public List<Users> getUserList() {
        return null;
    }

    @Override
    public Users getUserById(long id) {
        return null;
    }

    @Override
    public void addUser(Users users) {

    }

    @Override
    public void updateUser(Users users) {

    }

    @Override
    public void deleteUser(int id) {

    }


    @Override
    public void regUser(Users users){
        String sql = "INSERT INTO users (id, login, password, role, email) VALUES (?, ?, ?, ?, ?);";
        jdbcTemplate.update(sql, new Object[]{users.getId(), users.getLogin(), users.getPassword(), users.getRole(), users.getEmail()});
    }
//        Map<String, Object> regParam = new HashMap<>();
//        regParam.put("login", users.getLogin());
//        regParam.put("password", users.getPassword());
//        regParam.put("role", users.getRole());
//        regParam.put("email", users.getEmail());
//        jdbcTemplate.update(sql, regParam );

//        List<Object> user_set = new ArrayList<Object>();
//        user_set.add(users.getLogin());
//        user_set.add(users.getPassword());
//        user_set.add(users.getRole());
//        user_set.add(users.getEmail());
//        jdbcTemplate.update(sql, user_set);

}
