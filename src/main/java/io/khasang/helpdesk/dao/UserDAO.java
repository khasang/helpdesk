package io.khasang.helpdesk.dao;


import io.khasang.helpdesk.model.User;

import java.util.List;

public interface UserDAO {

    User getById(long id);

    void insert(User users);

    List<User> getAll();

    void update(User users);

    void deleteById(long id);
}
