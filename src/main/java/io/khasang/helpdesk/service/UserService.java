package io.khasang.helpdesk.service;

import io.khasang.helpdesk.db.interfaces.UserDAO;
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
        return userDAO.getAllUserList();
    }

    public void addUser(User user) {
        final String password = passwordEncoder.encode(user.getPassword());
        user.setPassword(password);
        userDAO.addUser(user);
    }

    public void updateUser(User user) {
        final String password = passwordEncoder.encode(user.getPassword());
        user.setPassword(password);
        userDAO.updateUser(user);
    }

    public void deleteUser(User user) {
        userDAO.deleteUser(user);
    }
}
