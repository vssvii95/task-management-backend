package com.assaibra.taskmanagement.service;

import com.assaibra.taskmanagement.repository.UserRepository;
import org.springframework.stereotype.Service;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
