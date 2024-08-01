package com.devsnology.taller.javarestbasic.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUser() {
        List<User> users = userRepository.findAll();
        return users;
    }

}
