package io.khasang.helpdesk.config;


import io.khasang.helpdesk.controller.RestUserController;
import io.khasang.helpdesk.dao.Dao;
import io.khasang.helpdesk.dao.daoimpl.HibernateUserDao;
import io.khasang.helpdesk.entity.Users;
import io.khasang.helpdesk.model.*;
import io.khasang.helpdesk.model.CreateTable;
//import io.khasang.helpdesk.model.Message;
import io.khasang.helpdesk.model.Temp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;

import javax.persistence.EntityManager;


@Configuration
@PropertySource("classpath:util.properties")
public class AppContext {

    @Bean
    public Admin admin() {
        return new Admin();
    }

    @Autowired
    Environment environment;

//    @Autowired
//    HibernateConfig hibernateConfig;

    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }

    @Bean
    public UserDetailsService userDetailsService() {
        JdbcDaoImpl jdbcImpl = new JdbcDaoImpl();
        jdbcImpl.setDataSource(dataSource());
        jdbcImpl.setUsersByUsernameQuery("select login as principal, password as credentials, true from users where login = ?");
        jdbcImpl.setAuthoritiesByUsernameQuery("select login as principal, role from users where login = ?");
        return jdbcImpl;
    }

    @Bean
    public CreateTable createTable(){
        return new CreateTable(jdbcTemplate());
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
    public MainPage mainPage() {
        return new MainPage();
    }

    @Bean
    public Index index(){
        return new Index();
    }


    @Bean
    public Map map(){return new Map();}

    @Bean
    public Temp temp() {
        return new Temp();
    }

    @Bean
    public Tasks tasks(){return new Tasks(jdbcTemplate());}

//    @Bean
//    public User user(){return new Users(jdbcTemplate());}

    @Bean
    public Users users(){
        return new Users();
    }

    @Bean
    public User user(){
        return new User();
    }

    @Bean
    public HibernateUserDao hibernateUserDao(){
        return new HibernateUserDao();
    }

    @Bean
    public Dao dao(){
        return new HibernateUserDao();
    }

    @Bean
    public RestUserController restUserController(){
        return new RestUserController();
    }

}