package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a library that manages a collection of books.
 */
public class Library {
    private List<Book> books = new ArrayList<>();

    /**
     * Adds a book to the library.
     * @param book The book to add
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Removes a book from the library by title.
     * @param title The title of the book to remove
     * @return true if the book was removed, false otherwise
     */
    public boolean removeBook(String title) {
        return books.removeIf(book -> book.getTitle().equals(title));
    }

    /**
     * Finds a book in the library by title.
     * @param title The title of the book to find
     * @return The book if found, null otherwise
     */
    public Book findBook(String title) {
        return books.stream()
                .filter(book -> book.getTitle().equals(title))
                .findFirst()
                .orElse(null);
    }

    /**
     * Returns the number of books in the library.
     * @return The number of books
     */
    public int getBookCount() {
        return books.size();
    }
}
