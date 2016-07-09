package io.khasang.helpdesk.services;


import io.khasang.helpdesk.entity.Users;

import java.util.List;

public interface UserService {
    Users getById(long id);

    void insert(Users users);

    List<Users> getAll();

    void update(Users users);

    void deleteById(long id);
}

