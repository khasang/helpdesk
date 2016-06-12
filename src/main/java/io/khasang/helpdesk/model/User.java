package io.khasang.helpdesk.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private ArrayList<String> username ;

    public User() {
    }

    public ArrayList<String> addUser(String name){
        username = new ArrayList<>();
        username.add(name);
        return username;
    }

    public String getUsername(){
        for (String s : username) {
            this.name = s;
        }
        return name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
