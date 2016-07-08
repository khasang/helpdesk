package io.khasang.helpdesk.services;


import io.khasang.helpdesk.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO getById(long id);

    void insert(UserDTO user);

    List<UserDTO> getAll();

    void update(UserDTO user);

    void deleteById(long id);
}

