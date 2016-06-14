package io.khasang.helpdesk.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
