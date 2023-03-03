package com.example.hanghaeclone.entity;

import javax.persistence.*;
import java.security.PrivateKey;

@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Post post;

    @Column(nullable = false)
    private String imageUrl;
}
