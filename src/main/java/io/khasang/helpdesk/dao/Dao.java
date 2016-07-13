package io.khasang.helpdesk.dao;

import io.khasang.helpdesk.model.User;
import org.springframework.stereotype.Component;

//@Component
public interface Dao {

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(User user);

    void createUser();

    void regUser(User user);

}
