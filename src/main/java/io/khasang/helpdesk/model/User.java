package io.khasang.helpdesk.model;

public class User {
    private int id;
    private String name;
    private int role_id;
    private String password;
    private String login;

    public User() {
    }

    public User(int id, String name, int role_id, String password, String login){
        this.id = id;
        this.name = name;
        this.role_id = role_id;
        this.password = password;
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
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
}
