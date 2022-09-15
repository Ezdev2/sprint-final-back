package com.springfinalback.hei.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "\"post\"")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Post implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPost;

    private  String description;

    private String Image;

    @CreationTimestamp
    private Instant postingDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idUser")
    private User user;
}
