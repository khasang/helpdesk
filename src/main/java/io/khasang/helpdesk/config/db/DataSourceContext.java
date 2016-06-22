package io.khasang.helpdesk.config.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jndi.JndiTemplate;

import javax.naming.NamingException;
import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:db.properties")
public class DataSourceContext {
    @Autowired
    Environment environment;

    @Bean
    public DataSource dataSource() {
        DataSource dataSource;
        JndiTemplate jndi = new JndiTemplate();
        try {
            dataSource = (DataSource) jndi.lookup(environment.getProperty("jdbc.postgresql.JNDI"));
        } catch (NamingException e) {
            throw new RuntimeException(e);
        }
        return dataSource;
    }
}
