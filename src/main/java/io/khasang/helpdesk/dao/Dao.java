package io.khasang.helpdesk.dao;

import io.khasang.helpdesk.entity.Users;
import org.springframework.stereotype.Component;

import java.util.List;

import static org.hibernate.envers.enhanced.SequenceIdRevisionEntity_.id;

public interface Dao {

    List<Users> getUserList();

    Users getUserById(long id);

    void addUser(Users users);

    void updateUser(Users users);

    void deleteUser(int id);

    void regUser(Users users);

//    Users getUserLoginById(long id);
}
