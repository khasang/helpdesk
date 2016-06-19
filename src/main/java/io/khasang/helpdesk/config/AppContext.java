package io.khasang.helpdesk.config;

import io.khasang.helpdesk.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource("classpath:util.properties")
public class AppContext {

        @Autowired
        Environment environment;

        @Bean
        public JdbcTemplate jdbcTemplate() {
            JdbcTemplate jdbcTemplate = new JdbcTemplate();
            jdbcTemplate.setDataSource(dataSource());
            return jdbcTemplate;
        }

        @Bean
        public DriverManagerDataSource dataSource() {
            DriverManagerDataSource dataSource = new DriverManagerDataSource();
            dataSource.setDriverClassName(environment.getProperty("jdbc.postgresql.driverClass"));
            dataSource.setUrl(environment.getProperty("jdbc.postgresql.url"));
            dataSource.setUsername(environment.getProperty("jdbc.postgresql.username"));
            dataSource.setPassword(environment.getProperty("jdbc.postgresql.password"));
            return dataSource;
        }

    @Bean
    public Admin admin() {
        return new Admin();
    }

    @Bean
    public MainPage mainPage() {
        return new MainPage();
    }

    @Bean
    public Index index(){
        return new Index();
    }

    @Bean
    public Task task(){return new Task();}

    @Bean
    public Map map(){return new Map();}

    @Bean
    public Temp temp(){
        return new Temp();
    }
}