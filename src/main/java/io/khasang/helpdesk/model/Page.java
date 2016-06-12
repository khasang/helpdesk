package io.khasang.helpdesk.model;

import org.springframework.stereotype.Component;

@Component
public class Page {
    private String title;
    private String body;

    public Page() {
    }

    public Page(String title) {
        this.title = title;
    }

    public Page(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
