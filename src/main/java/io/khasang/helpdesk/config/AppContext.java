package io.khasang.helpdesk.config;

import io.khasang.helpdesk.model.Example;
import io.khasang.helpdesk.model.Hello;
import io.khasang.helpdesk.model.Message;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {

    @Bean
    public Message message() {
        return new Message();
    }

    @Bean
    public Example example() {
        return new Example();
    }

    @Bean
    public Hello hello() {
        return new Hello();
    }
}