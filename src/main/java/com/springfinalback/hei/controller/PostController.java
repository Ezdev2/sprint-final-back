package com.springfinalback.hei.controller;

import com.springfinalback.hei.model.Post;
import com.springfinalback.hei.repository.PostRepository;
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

    @PostMapping(path="/addNewPost")
    public Post saveNewPost(@RequestBody Post post){
        Post postContent = postService.savePost(post);
        return postContent;
    }
}
