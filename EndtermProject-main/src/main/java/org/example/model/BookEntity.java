package org.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "books") // PostgreSQL-де "books" деген кесте құрылады
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;

    // Бос конструктор (JPA үшін міндетті)
    public BookEntity() {}

    // Builder паттерні (Тапсырманың талабы бойынша)
    private BookEntity(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public static class Builder {
        private String title;
        private String author;

        public Builder setTitle(String title) { this.title = title; return this; }
        public Builder setAuthor(String author) { this.author = author; return this; }
        public BookEntity build() { return new BookEntity(this); }
    }
}