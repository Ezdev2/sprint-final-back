package com.springfinalback.hei.service;

import com.springfinalback.hei.model.Post;
import com.springfinalback.hei.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@AllArgsConstructor
public class PostService {
    @Autowired
    private final PostRepository postRepository;

    public List<Post> getPosts(){
        return postRepository.findAll();
    }

    public Post savePost(Post post){
        Post postContent = postRepository.saveAndFlush(post);
        return postContent;
    }

}
