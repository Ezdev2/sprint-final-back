package com.springfinalback.hei.controller;

import com.springfinalback.hei.model.Post;
import com.springfinalback.hei.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public List<Post> getPosts(){
        return postService.getPosts();
    }

    @PutMapping(path="/posts/{idUser}")
    public Post addNewPost(@PathVariable Long idUser, @RequestBody Post post){
        Post postList = postService.addPostByIdUser(idUser);
        return postList;
    }
}
