package io.khasang.helpdesk.model;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import javax.activation.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

//@Component
public class Tasks {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    private int id;
    private String description;

    public Tasks() {
    }

    public Tasks(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
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
        return this.jdbcTemplate.query("Select id, description from Tasks;", new ItemMapper());
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
        return tasks;
    }
}
