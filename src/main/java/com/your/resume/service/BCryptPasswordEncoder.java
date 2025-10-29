package com.your.resume.service;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class BCryptPasswordEncoder {

    public String encode(String password) {
        String encodedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
        return encodedPassword;
    }

}
