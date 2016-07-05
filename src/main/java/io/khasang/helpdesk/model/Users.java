package io.khasang.helpdesk.model;

import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

import javax.jws.soap.SOAPBinding;

/**
 * Created by Mike on 26.06.2016.
 */
@Component
public class Users {

    private int id;
    private int name;

    public Users(int id, int name) {
        this.id = id;
        this.name = name;
    }

    public Users(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }
}
