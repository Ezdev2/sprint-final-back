package com.springfinalback.hei.controller;

import com.springfinalback.hei.model.Friend;
import com.springfinalback.hei.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class FriendController {
    @Autowired
    private FriendService friendService;

    @GetMapping("/friend")
    public List<Friend> getFriend(){
        return friendService.getFriend();
    }

    @GetMapping("/friend/{idUser}")
    public Friend getFriendById(@PathVariable Long idUser) throws Exception {
        return friendService.getFriendById(idUser);
    }

    @PutMapping(path="/friend/{idUser}")
    public Friend saveNewPost(@PathVariable Long idUser,@RequestBody Friend friend){
        Friend friendList = friendService.addFriend(friend);
        return friendList;
    }
}
