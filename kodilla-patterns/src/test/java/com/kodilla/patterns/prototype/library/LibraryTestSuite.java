package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library primaryLibrary = new Library("primary library");
        Book book1 = new Book("Virion. Tom 3. Adept", "Andrzej Ziemiański", LocalDate.of(2019, 5, 15));
        Book book2 = new Book("Łowca tygrysów", "Paullina Simons", LocalDate.of(2019, 5, 15));
        Book book3 = new Book("Poniewczasie", "Wit Szostak", LocalDate.of(2019, 5, 15));

        primaryLibrary.books.add(book1);
        primaryLibrary.books.add(book2);
        primaryLibrary.books.add(book3);

        Library shallowClonedLibrary = new Library("library 2 (shallow copy)");
        try {
            shallowClonedLibrary = primaryLibrary.shallowCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = new Library("library 3 (deep copy)");
        try {
            deepClonedLibrary = primaryLibrary.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        primaryLibrary.books.remove(book1);

        //Then
        System.out.println("the primary library:");
        for (Book books : primaryLibrary.books) {
            System.out.println(books);
        }

        System.out.println("\nshallow copy:");
        for (Book deepCopiedBooks : shallowClonedLibrary.books) {
            System.out.println(deepCopiedBooks);
        }

        System.out.println("\ndeep copy:");
        for (Book deepCopiedBooks : deepClonedLibrary.books) {
            System.out.println(deepCopiedBooks);
        }

        Assert.assertEquals(shallowClonedLibrary.books, primaryLibrary.books);
        Assert.assertNotEquals(deepClonedLibrary.books, primaryLibrary.books);
    }
}
