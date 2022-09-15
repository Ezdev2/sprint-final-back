package com.springfinalback.hei.service;

import com.springfinalback.hei.model.Post;
import com.springfinalback.hei.model.User;
import com.springfinalback.hei.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    public List<User> getUser(){
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User createUser(User user){
        User newUser = userRepository.saveAndFlush(user);
        return newUser;
    }
}
