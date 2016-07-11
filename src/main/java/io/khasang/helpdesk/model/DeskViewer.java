package io.khasang.helpdesk.model;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.activation.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DeskViewer {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    private int id;

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
        return this.jdbcTemplate.query("Select id from tasks", new ItemMapper());
    }
}

final class ItemMapper implements RowMapper<DeskViewer>{
    public DeskViewer mapRow(ResultSet rs, int rowNum) throws SQLException{
        DeskViewer deskViewer = new DeskViewer();
        deskViewer.setId(rs.getInt("id"));
        return deskViewer;
    }
}
