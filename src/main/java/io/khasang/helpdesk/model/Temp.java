package io.khasang.helpdesk.model;

import org.springframework.stereotype.Component;

@Component
public class Temp {

    public String[] getStringArray(){
        return new String[] {"aa", "bb", "cc"};
    }

    public Integer[] getIntArray(){
        return new Integer[]{1, 2, 3, 4};
    }
}
