package io.khasang.helpdesk.model;


import org.springframework.jdbc.core.JdbcTemplate;

public class CreateTable {

    public static void main(String [] args){

    }

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

    public String result(){
        try{
            jdbcTemplate.execute("CREATE TABLE COMPANY (ID INT PRIMARY KEY NOT NULL)");
            return "success";
        } catch (Exception e){
            e.printStackTrace();
            return "fail" + e;
        }

    }

    public String insert(){
        try{
            jdbcTemplate.execute("INSERT INTO COMPANY (ID) VALUES (1)");
            return "success";
        } catch (Exception e){
            e.printStackTrace();
            return "fail" + e;
        }
    }
}
