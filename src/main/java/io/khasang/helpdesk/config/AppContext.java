package io.khasang.helpdesk.config;

import io.khasang.helpdesk.model.Admin;
import io.khasang.helpdesk.model.Index;
import io.khasang.helpdesk.model.MainPage;
import io.khasang.helpdesk.model.Task;
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
    public Task task(){
        return new Task();
    }
}