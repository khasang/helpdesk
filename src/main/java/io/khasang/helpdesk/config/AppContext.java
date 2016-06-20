package io.khasang.helpdesk.config;

import io.khasang.helpdesk.model.Message;
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
    Page index() {
        final Page page = new Page("Index page");
        page.setBody("Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n" +
                "    Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a\n" +
                "    galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,\n" +
                "    but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the\n" +
                "    1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop\n" +
                "    publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        return page;
    }

    @Bean
    Page admin() {
        return new Page("Admin page");
    }



    @Bean
    public Temp temp(){
        return new Temp();
    }

}