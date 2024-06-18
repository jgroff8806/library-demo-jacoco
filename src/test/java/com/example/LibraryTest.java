package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for the Library class.
 */
public class LibraryTest {

    @Test
    public void testAddBook() {
        Library library = new Library();
        Book book = new Book("1984", "George Orwell");
        library.addBook(book);
        // Verifies that the book was added
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void testRemoveBook() {
        Library library = new Library();
        Book book = new Book("1984", "George Orwell");
        library.addBook(book);
        library.removeBook("1984");
        // Verifies that the book was removed
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void testFindBook() {
        Library library = new Library();
        Book book = new Book("1984", "George Orwell");
        library.addBook(book);
        // Verifies that the book can be found
        assertNotNull(library.findBook("1984"));
    }

    @Test
    public void testGetBookCount() {
        Library library = new Library();
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("Brave New World", "Aldous Huxley"));
        // Verifies that the library contains two books
        assertEquals(2, library.getBookCount());
    }
}
