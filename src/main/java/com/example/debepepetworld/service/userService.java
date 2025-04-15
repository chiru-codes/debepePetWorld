package com.example.debepepetworld.service;

import com.example.debepepetworld.domain.user;
import com.example.debepepetworld.infrastructure.userRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {
    private final userRepository userRepository;

    @Autowired
    public userService(userRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    // === Functions of service ===
}
