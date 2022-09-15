package com.springfinalback.hei.controller;

import com.springfinalback.hei.model.Post;
import com.springfinalback.hei.model.User;
import com.springfinalback.hei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> getUser(){
        return userService.getUser();
    }

    @GetMapping(value = "/user/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PostMapping(path="/signUp")
    public User signUp(@RequestBody User user){
        User addUser = userService.createUser(user);
        return addUser;
    }
}
