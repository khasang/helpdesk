package io.khasang.helpdesk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jndi.JndiTemplate;

import javax.naming.NamingException;
import javax.sql.DataSource;

@Configuration
public class DataSourceContext {
    @Bean
    public DataSource dataSource() {
        DataSource dataSource;
        JndiTemplate jndi = new JndiTemplate();
        try {
            dataSource = (DataSource) jndi.lookup("java:comp/env/jdbc/helpdesk");
        } catch (NamingException e) {
            throw new RuntimeException(e);
        }
        return dataSource;
    }
}
