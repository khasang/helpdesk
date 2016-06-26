package io.khasang.helpdesk.model;


public class User {

    private long id;
    private String firstName;
    private String secondName;
    private long role_id;
    private String roles;
    private String login;
    private String password;

    public User() {
    }

    public User(long id, String firstName, String secondName, long role_id, String roles, String login,
                String password) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.role_id = role_id;
        this.roles = roles;
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

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", role_id=" + role_id +
                ", roles='" + roles + '\'' +
                ", login=" + login +
                ", password=" + password +
                '}';
    }
}
