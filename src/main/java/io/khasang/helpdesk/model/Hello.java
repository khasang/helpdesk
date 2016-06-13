package io.khasang.helpdesk.model;

import org.springframework.stereotype.Component;

/**
 * Created by Alexander-PC on 13.06.2016.
 */
@Component
public class Hello {
    private int num;

    public Hello(int num) {
        this.num = num;
    }

    public Hello() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
