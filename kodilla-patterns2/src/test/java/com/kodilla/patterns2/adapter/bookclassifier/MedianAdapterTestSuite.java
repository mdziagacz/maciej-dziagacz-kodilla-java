package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("author", "title", 1990, "1"));
        books.add(new Book("author", "title", 1995, "2"));
        books.add(new Book("author", "title", 2000, "3"));
        books.add(new Book("author", "title", 2005, "4"));
        books.add(new Book("author", "title", 2010, "5"));
        books.add(new Book("author", "title", 2018, "6"));
        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int median = medianAdapter.publicationYearMedian(books);

        //Then
        assertEquals(2005, median, 0);
    }
}
