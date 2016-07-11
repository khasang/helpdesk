package io.khasang.helpdesk.model;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.activation.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class DeskViewer {
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

    public DeskViewer(){
    }

    public DeskViewer(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List viewAllTasks() throws SQLException{
        return this.jdbcTemplate.query("Select * from tasks", new ItemMapper());
    }
}

final class ItemMapper implements RowMapper<DeskViewer>{
    public DeskViewer mapRow(ResultSet rs, int rowNum) throws SQLException{
        DeskViewer deskViewer = new DeskViewer();
        deskViewer.setId(rs.getInt("id"));
        deskViewer.setUser_id(rs.getInt("user_id"));
        deskViewer.setDescription(rs.getString("description"));
        deskViewer.setComment(rs.getString("comment"));
        deskViewer.setDate_created(rs.getDate("date_created"));
        deskViewer.setLast_change(rs.getDate("last_change"));
        deskViewer.setClose_date(rs.getDate("close_date"));
        deskViewer.setRates_id(rs.getInt("rates_id"));
        deskViewer.setState(rs.getString("state"));
        return deskViewer;
    }
}
