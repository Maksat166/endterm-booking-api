package org.example.controller;

import org.example.model.*;
import org.example.patterns.*;
import org.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/library")
public class LibraryController {

    @Autowired
    private BookService bookService;

    // Factory Pattern тексеру (Бұрынғы код)
    @GetMapping("/factory")
    public String testFactory(@RequestParam String type) {
        Book book = BookFactory.createBook(type);
        return (book != null) ? "Factory жұмыс істеп тұр: " + book.getInfo() : "Қате!";
    }

    // БАЗАМЕН ЖҰМЫС: Барлық кітаптарды алу
    @GetMapping("/all")
    public List<BookEntity> getAllBooks() {
        return bookService.getAllBooks();
    }

    // БАЗАМЕН ЖҰМЫС: Жаңа кітап қосу
    @PostMapping("/add")
    public BookEntity addBook(@RequestBody BookEntity book) {
        return bookService.saveBook(book);
    }
}