package com.example.javagarageapp.models.entities;

import jakarta.persistence.*;
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column
    String name;

    @Column
    int telNumber;
}
