package io.khasang.helpdesk.model;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import javax.activation.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

@Component
public class Task {
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

    public Task() {
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

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public List selectWholeTable() throws SQLException {
        return this.jdbcTemplate.query("Select id, user_id, description, comment, date_created, last_change, close_date, rates_id, state from Tasks;", new ItemMapper());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

final class ItemMapper implements RowMapper<Task> {
    public Task mapRow(ResultSet rs, int rowNum) throws SQLException {
        Task productorder = new Task();
        productorder.setId(rs.getInt("id"));
        productorder.setUser_id(rs.getInt("user_id"));
        productorder.setDescription(rs.getString("description"));
        productorder.setComment(rs.getString("comment"));
        productorder.setDate_created(rs.getDate("date_created"));
        productorder.setLast_change(rs.getDate("last_change"));
        productorder.setClose_date(rs.getDate("close_date"));
        productorder.setRates_id(rs.getInt("rates_id"));
        productorder.setState(rs.getString("state"));
        return productorder;
    }
}
