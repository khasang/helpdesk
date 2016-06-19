package io.khasang.helpdesk.config;

import io.khasang.helpdesk.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {

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
}