package io.khasang.helpdesk.model;

import org.springframework.jdbc.core.JdbcTemplate;

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
            /*jdbcTemplate.execute("CREATE TABLE TASKS (ID INT PRIMARY KEY NOT NULL)");*/
            jdbcTemplate.execute("DELETE FROM TASKS WHERE name = 'Andrey'");
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail " + e;
        }
    }
}