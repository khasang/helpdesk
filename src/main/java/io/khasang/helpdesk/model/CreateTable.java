package io.khasang.helpdesk.model;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by Mike on 22.06.2016.
 */
public class CreateTable {
    private JdbcTemplate  jdbcTemplate;

    public CreateTable(){

    }



    public CreateTable(JdbcTemplate jdbcTemplate){

        this.jdbcTemplate = jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public String result(){

        try{
           // jdbcTemplate.execute("CREATE TABLE TASKS (ID INT PRIMARY KEY NOT NULL)");
            jdbcTemplate.execute("SELECT * FROM TASKS");
            return "success";

        } catch (Exception e){
            return "fail" + e;
        }

    }
}
