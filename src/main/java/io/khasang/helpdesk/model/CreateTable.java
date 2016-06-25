package io.khasang.helpdesk.model;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class CreateTable {
    private JdbcTemplate jdbcTemplate;

    public CreateTable() {
    }

    public CreateTable(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public String result() {
        try {
            jdbcTemplate.execute("CREATE TABLE TASKS (ID INT PRIMARY KEY NOT NULL, NAME VARCHAR , DESCRIPTION VARCHAR , DATE DATE , USER_ID INTEGER )");
            jdbcTemplate.execute("insert into tasks (id, name, description, date, user_id ) values (1, 'first', 'first commit', '2016-06-25', 21)");
            jdbcTemplate.execute("select * from tasks");
            jdbcTemplate.execute("update tasks set name = 'second' where id = 1;");
            jdbcTemplate.execute("insert into tasks (id, name, description, date, user_id ) values (2, 'second', 'second commit', '2016-06-25', 22)");
            jdbcTemplate.execute("Delete from tasks where id = 2");
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail " + e;
        }
    }
}
