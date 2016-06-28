package io.khasang.helpdesk.service;

import io.khasang.helpdesk.db.UserDAO;
import io.khasang.helpdesk.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("UserService")
public class UserService {
    @Autowired
    UserDAO userDAO;

    @Autowired
    PasswordEncoder passwordEncoder;

    public List<User> getUsersAsList() {
        return userDAO.getUserList();
    }

    public void addUser(User user) {
        encryptPassword(user);
        userDAO.addUser(user);
    }

    public void updateUser(User user) {
        encryptPassword(user);
        userDAO.updateUser(user);
    }

    public void deleteUser(User user) {
        userDAO.deleteUser(user);
    }

    private void encryptPassword(User user) {
        if (user.getPassword() == null || user.getPassword().isEmpty()) {
            throw new IllegalArgumentException("Please, enter password!");
        }
        final String password = passwordEncoder.encode(user.getPassword());
        user.setPassword(password);
    }

    public void deleteAllUsers() {
        userDAO.deleteAllUsers();
    }

    public User getUserById(int id) {
        return userDAO.getUserById(id);
    }

    public User getUserByLogin(String login) {
        return userDAO.getUserByLogin(login);
    }
}
