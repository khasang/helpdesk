package io.khasang.helpdesk.config;

import io.khasang.helpdesk.model.Message;
import io.khasang.helpdesk.model.Temp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {

    @Bean
    public Message message(){
        return new Message();
    }

    @Bean
    public Temp temp(){
        return new Temp();
    }
}