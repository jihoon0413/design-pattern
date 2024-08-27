package org.example.design_pattern.iterator;

import java.util.Iterator;

public class BookShelf implements java.lang.Iterable<Book> { // Iterable 는 반복 할 수 있다는 것을 의미하며 어떤 타입을 반복할 수 있는지 알 수 있다

    private final Book[] books;
    private int index = 0;

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        books[index] = book;
        index++;
    }

    public int getLength() {
        return index;
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
