package com.example.ex2sem6.repository;

import com.example.ex2sem6.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
