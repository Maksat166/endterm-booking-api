package org.example.service;

import cache.InMemoryCache; // Егер пакет аты басқа болса, түзетіп жібер
import org.example.model.BookEntity;
import org.example.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository repository;

    private final String CACHE_KEY = "all_books_list";

    public List<BookEntity> getAllBooks() {
        // 1. Singleton арқылы кэш данасын аламыз
        InMemoryCache cache = InMemoryCache.getInstance();

        // 2. Кэште дерек бар-жоғын тексереміз [cite: 8]
        List<BookEntity> cachedBooks = (List<BookEntity>) cache.get(CACHE_KEY);

        if (cachedBooks != null) {
            System.out.println("--- Деректер кэштен алынды (In-Memory) ---");
            return cachedBooks;
        }

        // 3. Кэште жоқ болса, дерекқордан аламыз [cite: 8]
        System.out.println("--- Кэште жоқ, дерекқорға (DB) сұраныс жіберілді ---");
        List<BookEntity> booksFromDb = repository.findAll();

        // 4. Келесі жолы тез алу үшін кэшке сақтаймыз [cite: 6, 14]
        cache.put(CACHE_KEY, booksFromDb);

        return booksFromDb;
    }

    public BookEntity saveBook(BookEntity book) {
        BookEntity savedBook = repository.save(book);

        // 5. Дерекқорға жаңа кітап қосылғанда, кэштегі ескі деректі тазартамыз
        InMemoryCache.getInstance().clear();
        System.out.println("--- Дерекқор өзгерді, кэш тазартылды ---");

        return savedBook;
    }
}