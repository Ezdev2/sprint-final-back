package com.springfinalback.hei.service;

import com.springfinalback.hei.model.Friend;
import com.springfinalback.hei.model.Reaction;
import com.springfinalback.hei.repository.ReactionRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReactionService {
    @Autowired
    private final ReactionRepository reactionRepository;

//    public List<Reaction> getReactionByIdPost(){
//        return reactionRepository.findAll();
//    }

    public Reaction getReactionByIdPost(Long idPost) {
        Reaction reaction = reactionRepository.findById(idPost)
                .orElseThrow(()->new RuntimeException("Transaction with id "+ idPost +" does not exists"));
        return reaction;
    }

    public Reaction addReaction(Reaction reaction){
        Reaction reactionList = reactionRepository.save(reaction);
        return reactionList;
    }
}
