package io.khasang.helpdesk.model;

import org.springframework.stereotype.Component;

@Component
public class Admin {
    private String message;
    private String title;
    private String user;
    private String testUser;

    public Admin() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setTestUser(String testUser) {
        this.testUser = testUser;
    }

    public String getTestUser() {
        return testUser;
    }
}
