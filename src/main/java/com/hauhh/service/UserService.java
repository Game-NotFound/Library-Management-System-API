package com.hauhh.service;

import com.hauhh.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User saveUser(User user);

    User getUser(Long userID);

    User updateUser(Long userID, User user);

    void deleteUser(Long userID);
}
