package io.khasang.helpdesk.controller;

import io.khasang.helpdesk.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.util.List;

@Controller
public class AdminController {
    @Autowired
    DataSource dataSource;
    @Autowired
    JdbcTemplate jdbcTemplate;


    @RequestMapping("/admin")
    public String admin(){
        return "admin";
    }

    @RequestMapping("/createUser")
    public String createUser(){
        return "createUser";
    }

    @RequestMapping("/displayUser")
    public String displayUser() {
//        jdbcTemplate = new JdbcTemplate(dataSource);
        List<User> list = jdbcTemplate.queryForList("SELECT * FROM users");
        return "displayUser";}

    @RequestMapping("/deleteUser")
    public String deleteUser() {
        return "deleteUser";
    }

    @RequestMapping("/editUser")
    public String editUser() {
        return "editUser";
    }

    @RequestMapping("/createBackup")
    public String createBackup() {
        return "createBackup";
    }

    @RequestMapping("/deleteBackup")
    public String deleteBackup() {
        return "deleteBackup";
    }

    @RequestMapping("/applyBackup")
    public String applyBackup() {
        return "applyBackup";
    }
}
