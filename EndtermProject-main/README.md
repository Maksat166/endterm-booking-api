# Bonus Task: Simple In-Memory Cache

[cite_start]I added a caching layer to make the application faster[cite: 1, 3].

### What I did:
* **Singleton Pattern:** I created one instance of the cache. [cite_start]Only one cache exists in the application[cite: 9, 15].
* [cite_start]**In-Memory Cache:** The data is stored in a Map (RAM), not just in the database.
* **Method Caching:** I updated the `getAllBooks()` method. [cite_start]Now, it checks the cache first[cite: 7, 8].
* [cite_start]**Cache Invalidation:** When I add or save a new book, the cache clears automatically to keep data fresh.
* [cite_start]**SOLID Principles:** I put the cache logic in a separate class to follow good architecture rules[cite: 16, 17].

### How it works:
1. The first time you ask for books, the app gets them from the database and saves them in the cache.
2. The second time, the app gets books directly from the cache. This is much faster.
3. If you add a new book, the cache is deleted so you don't see old information.