package io.khasang.helpdesk.model;

import org.springframework.stereotype.Component;

@Component
public class ArrayBean {
    public String[] getArray() {
        return new String[]{"aaa", "bbb", "ccc"};
    }
}
