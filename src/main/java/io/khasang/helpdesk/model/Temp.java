package io.khasang.helpdesk.model;

import org.springframework.stereotype.Component;

@Component
public class Temp {

    public int example(String color) {
        if (color.equals("red")) {
            return 2;
        } else if (color.equals("green")) {
            return 3;
        } else {
            return 0;
        }
    }
}
