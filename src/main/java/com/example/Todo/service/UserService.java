package com.example.Todo.service;

import com.example.Todo.models.User;
import com.example.Todo.repositary.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user){
        return userRepository.save(user);

    }
    public User getUserById(Long id){
        return userRepository.findById(id).orElseThrow(() ->new RuntimeException("Todo not found"));
    }


}
