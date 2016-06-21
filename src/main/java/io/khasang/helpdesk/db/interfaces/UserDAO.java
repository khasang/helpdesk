package io.khasang.helpdesk.db.interfaces;

import io.khasang.helpdesk.model.User;

import java.util.List;

public interface UserDAO {
    void addUser(User user);

    void updateUser(User user);

    void deleteUser(User user);

    User getUserById(int id);

    User getUserByLogin(String login);

    List<User> getAllUserList();
}
