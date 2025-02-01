package com.example.ex2sem6.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;

    @ManyToOne
    @JoinColumn(name = "reader_id")
    private Reader reader;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
