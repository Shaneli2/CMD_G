package com.shane.service;

import com.shane.pojo.Users;
import org.apache.catalina.User;

import java.util.List;

public interface UsersService {
    void addUser(Users users);
    List<Users> findUserAll();
    Users findUsersById(Integer id);
    void updateUser(Users users);
    void deleteUserById(Integer id);
}
