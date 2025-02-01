package com.example.ex2sem6.controller;

import com.example.ex2sem6.model.Reader;
import com.example.ex2sem6.repository.ReaderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reader")
@RequiredArgsConstructor
public class ReaderController {

    private final ReaderRepository readerRepository;

    @GetMapping
    public List<Reader> getAll() {
        return readerRepository.findAll();
    }

    @PostMapping
    public Reader createReader(@RequestBody Reader reader) {
        return readerRepository.save(reader);
    }
}
