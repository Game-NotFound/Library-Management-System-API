package com.hauhh.service.impl;

import com.hauhh.entity.User;
import com.hauhh.repository.UserRepository;
import com.hauhh.service.UserService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUser(Long userID) {
        return null;
    }

    @Override
    public User updateUser(Long userID, User user) {
        return null;
    }

    @Override
    public void deleteUser(Long userID) {

    }
}
