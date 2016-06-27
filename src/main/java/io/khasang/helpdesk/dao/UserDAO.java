package io.khasang.helpdesk.dao;

import io.khasang.helpdesk.model.User;

import java.util.List;

public interface UserDAO {
    public void saveOrUpdate(User user);

    public void delete(int id);

    public void get(int id);

    public List<User> list();
}
