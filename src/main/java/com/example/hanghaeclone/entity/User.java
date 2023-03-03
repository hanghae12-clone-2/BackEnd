package com.example.hanghaeclone.entity;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String nickName;

    @ColumnDefault("36.5")
    @Column(nullable = false)
    private float temperature;
}
