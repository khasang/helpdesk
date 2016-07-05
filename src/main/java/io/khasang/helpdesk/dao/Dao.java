package io.khasang.helpdesk.dao;

import io.khasang.helpdesk.model.User;

public interface Dao {

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(User user);

    void createUser();

}
