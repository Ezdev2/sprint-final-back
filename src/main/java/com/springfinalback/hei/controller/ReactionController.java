package com.springfinalback.hei.controller;

import com.springfinalback.hei.model.Reaction;
import com.springfinalback.hei.service.ReactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ReactionController {
    @Autowired
    private ReactionService reactionService;

    @GetMapping("/reaction/{idPost}")
    public Reaction getReactionByIdPost(@PathVariable Long idPost) throws Exception {
        return reactionService.getReactionByIdPost(idPost);
    }

    @PutMapping(path="/reaction/{idPost}")
    public Reaction saveReaction(@PathVariable Long idPost,@RequestBody Reaction reaction){
        Reaction reactionList = reactionService.addReaction(reaction);
        return reactionList;
    }
}
