package io.khasang.helpdesk.config;


import io.khasang.helpdesk.model.Message;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {

    @Bean
    public Message message() {
        return new Message();
    }
}