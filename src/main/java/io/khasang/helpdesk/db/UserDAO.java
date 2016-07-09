package io.khasang.helpdesk.db;

import io.khasang.helpdesk.entities.User;
import io.khasang.helpdesk.enums.Role;

import java.util.List;

public interface UserDAO {
    void addUser(User user);

    void updateUser(User user);

    void deleteUser(User user);

    void deleteAllUsers();

    User getUserById(int id);

    User getUserByLogin(String login);
    
    List<User> getUserList();

    List<User> getUsersByRole(Role role);
}
