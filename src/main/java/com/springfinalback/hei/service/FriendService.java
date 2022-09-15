package com.springfinalback.hei.service;

import com.springfinalback.hei.model.Friend;
import com.springfinalback.hei.repository.FriendRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FriendService {
    @Autowired
    private final FriendRepository friendRepository;

    public List<Friend> getFriend(){
        return friendRepository.findAll();
    }

    public Friend getFriendById(Long idUser) {
        Friend friend = friendRepository.findById(idUser)
                .orElseThrow(()->new RuntimeException("Transaction with id "+ idUser +" does not exists"));
        return friend;
    }

    public Friend addFriend(Friend friend){
        Friend friendList = friendRepository.save(friend);
        return friendList;
    }
}
