package io.khasang.helpdesk.dao;


import io.khasang.helpdesk.entity.Users;

import java.util.List;

public interface UserDAO {

    Users getById(long id);

    void insert(Users users);

    List<Users> getAll();

    void update(Users users);

    void deleteById(long id);
}
