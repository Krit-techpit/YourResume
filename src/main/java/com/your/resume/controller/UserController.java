package com.your.resume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.your.resume.entity.User;
import com.your.resume.service.UserService;

@RequestMapping("/users")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        User user1 = userService.createUser(user);
        return user1;
    }
}
