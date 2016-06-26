package io.khasang.helpdesk.model;

import org.springframework.stereotype.Component;

@Component
public class Temp {

    public Temp() {
    }

    public int example(String color) {
        switch (color) {
            case "red":
                return 2;
            case "green":
                return 3;
            default:
                return 0;
        }
    }
}
