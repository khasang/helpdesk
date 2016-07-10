package io.khasang.helpdesk.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
//    private ArrayList<String> username ;
    private String login;
    private String password;
    private String role;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    private String email;

    public User() {
    }

//    public ArrayList<String> addUser(String name){
//        username = new ArrayList<>();
//        username.add(name);
//        return username;
//    }

//    public String getUsername(){
//        for (String s : username) {
//            this.name = s;
//        }
//        return name;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
