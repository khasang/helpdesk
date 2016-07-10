package io.khasang.helpdesk.entity;


import javax.persistence.*;

@Entity
public class Users {
    @Id
    @GeneratedValue
    private long id;
    @Column
    private String firstName;
    @Column
    private String secondName;
    @Column
    private long role_id;
    @Column
    private String role;
    @Column
    private String login;
    @Column
    private String password;

    public Users() {
    }

    public Users(long id, String firstName, String secondName, long role_id, String role, String login,
                 String password) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.role_id = role_id;
        this.role = role;
        this.login = login;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public long getRole_id() {
        return role_id;
    }

    public void setRole_id(long role_id) {
        this.role_id = role_id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String roles) {
        this.role = roles;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
