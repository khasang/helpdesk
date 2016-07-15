package io.khasang.helpdesk.model;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.activation.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

//@Component
public class Tasks {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    private int id;
    private int user_id;
    private String description;
    private String comment;
    private Date date_created;
    private Date last_change;
    private Date close_date;
    private int rates_id;
    private String state;

    public Tasks() {
    }

    public Tasks(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDate_created() {
        return date_created;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }

    public Date getLast_change() {
        return last_change;
    }

    public void setLast_change(Date last_change) {
        this.last_change = last_change;
    }

    public Date getClose_date() {
        return close_date;
    }

    public void setClose_date(Date close_date) {
        this.close_date = close_date;
    }

    public int getRates_id() {
        return rates_id;
    }

    public void setRates_id(int rates_id) {
        this.rates_id = rates_id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List selectWholeTable() throws SQLException {
        return this.jdbcTemplate.query("Select * from tasks;", new ItemMapper());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

final class ItemMapper implements RowMapper<Tasks> {
    public Tasks mapRow(ResultSet rs, int rowNum) throws SQLException {
        Tasks tasks = new Tasks();
        tasks.setId(rs.getInt("id"));
        tasks.setDescription(rs.getString("description"));
        tasks.setUser_id(rs.getInt("user_id"));
        tasks.setComment(rs.getString("comment"));
        tasks.setDate_created(rs.getDate("date_created"));
        tasks.setLast_change(rs.getDate("last_change"));
        tasks.setClose_date(rs.getDate("close_date"));
        tasks.setRates_id(rs.getInt("rates_id"));
        tasks.setState(rs.getString("state"));
        return tasks;
    }
}
