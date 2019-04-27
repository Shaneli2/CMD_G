package com.shane.mapper;

import com.shane.pojo.Users;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersMapper {
    void insertUser(Users users);
    List<Users> selectUserAll();
    Users selectUsersById(Integer id);
    void updateUser(Users users);
    void deleteUserById(Integer id);

}