package com.company.DAO;

import com.company.DTO.User;

import java.util.Set;

public interface UserDAO {
    User getUser();
    Set<User> getAllUsers();
    User getUserByFirstName();
    boolean insertUser();
    boolean updateUser();
    boolean deleteUser();
}
