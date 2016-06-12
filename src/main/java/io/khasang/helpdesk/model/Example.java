package io.khasang.helpdesk.model;

import org.springframework.stereotype.Component;

@Component
public class Example {
    private String message;

    public Example() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
