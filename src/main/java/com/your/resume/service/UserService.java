package com.your.resume.service;

import org.springframework.stereotype.Service;

import com.your.resume.entity.User;
import com.your.resume.repository.UserRepository;

@Service
public class UserService {
    UserRepository userRepository;
    
    public User createUser(User user) {
        User user1 = new User();
        user1.setName(user.getName());
        user1.setEmail(user.getEmail());
        user1.setPhoneNumber(user.getPhoneNumber());
        user1.setPassword(user.getPassword());
        userRepository.save(user1);
        return user;
    }
    
}
