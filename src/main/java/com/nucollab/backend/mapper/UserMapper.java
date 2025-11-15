package com.nucollab.backend.mapper;

import com.nucollab.backend.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface UserMapper {
    int addUser(User user);

    Optional<User> getUserByUserId(Integer userId);
    Optional<User> getUserByUserName(String username);
    Optional<User> getUserByEmail(String email);

    int updatePassword(User user);
}
