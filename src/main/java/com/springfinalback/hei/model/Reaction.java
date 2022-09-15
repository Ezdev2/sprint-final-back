package com.springfinalback.hei.model;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Reaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdReaction;

    @ManyToOne
    private  Post post;

    @OneToOne
    private User user;
}
