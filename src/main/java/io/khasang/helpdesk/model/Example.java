package io.khasang.helpdesk.model;

import org.springframework.stereotype.Component;

/**
 * Created by Alexander-PC on 13.06.2016.
 */
@Component
public class Example {

    Example(){
    }

    Example(int num){
        this.number = num;
    }

    private String message;

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
