package com.example.javagarageapp.models.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "statuses")
public class Statuses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column
    String type;
}
