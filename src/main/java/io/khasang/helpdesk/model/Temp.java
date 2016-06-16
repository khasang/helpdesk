package io.khasang.helpdesk.model;

import org.springframework.stereotype.Component;

@Component
public class Temp {
    public int example(String color) {
        if ("red".equals(color)) {
            return 2;
        } else if ("green".equals(color)) {
            return 3;
        } else {
            return 0;
        }
    }

    public int[] arrayExample(int[] arr){
        return arr;
    }
}
