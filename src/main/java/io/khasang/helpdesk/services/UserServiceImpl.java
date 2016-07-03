package io.khasang.helpdesk.services;

import io.khasang.helpdesk.dao.UserDAO;
import io.khasang.helpdesk.dto.UserDTO;
import io.khasang.helpdesk.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public UserDTO getById(long id) {
        User user = userDAO.getById(id);
        UserDTO userDTO = new UserDTO(user.getId(), user.getFirstName(), user.getSecondName(), user.getRole_id(),
                user.getRoles(), user.getLogin(), user.getPassword());
        return userDTO;
    }

    @Override
    public void insert(UserDTO userDTO) {
        User user = new User(userDTO.getId(), userDTO.getFirstName(), userDTO.getSecondName(), userDTO.getRole_id(),
                userDTO.getRoles(), userDTO.getLogin(), userDTO.getPassword());
        userDAO.insert(user);
    }

    @Override
    public List<UserDTO> getAll() {
        List<User> users = userDAO.getAll();
        List<UserDTO> userDTO = new ArrayList<>();
        for (User a : users) {
            userDTO.add(new UserDTO(a.getId(), a.getFirstName(), a.getSecondName(), a.getRole_id(),
                    a.getRoles(), a.getLogin(), a.getPassword()));
        }
        return userDTO;
    }

    @Override
    public void update(UserDTO userDTO) {
        User user = new User(userDTO.getId(), userDTO.getFirstName(), userDTO.getSecondName(), userDTO.getRole_id(),
                userDTO.getRoles(), userDTO.getLogin(), userDTO.getPassword());
        userDAO.update(user);
    }

    @Override
    public void deleteById(long id) {
        userDAO.deleteById(id);
    }
}
