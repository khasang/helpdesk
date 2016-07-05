package io.khasang.helpdesk.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Mike on 05.07.2016.
 */
@Repository
public class dbUserAction {

    private JdbcTemplate jdbcTemplate;
    @Autowired
    Users user;


    public dbUserAction(){

    }



    public dbUserAction(JdbcTemplate jdbcTemplate){

        this.jdbcTemplate = jdbcTemplate;
    }

    public dbUserAction(long id, String name) {

    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public List<Users> getAllUserList() {
        String query = "select * from tasks";
        // List<Users> users = jdbcTemplate.query(query,
        //       new BeanPropertyRowMapper(Users.class));

        List<Users> users = this.jdbcTemplate.query(query, (resultSet, i) -> {
            Users user = new Users();
            user.setId(resultSet.getInt("id"));
            user.setName(resultSet.getInt("name"));
            return user;
        });

        return users;


    }

}
