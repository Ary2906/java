package org.internship.assignments;

import org.junit.jupiter.api.Test;
import java.util.LinkedHashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class BookTrackerTest {

    BookTracker tracker = new BookTracker();

    @Test
    void testBasicChapters() {
        Map<String, Integer> book = new LinkedHashMap<>();
        book.put("Chapter 1", 1);
        book.put("Chapter 2", 10);
        book.put("Chapter 3", 50);
        book.put("Chapter 01", 5);

        assertEquals("Chapter 2", tracker.nearestChapter(book, 45));
    }

    @Test
    void testLongerBook() {
        Map<String, Integer> book = new LinkedHashMap<>();
        book.put("New Beginnings", 1);
        book.put("Strange Developments", 62);
        book.put("The End?", 194);
        book.put("The True Ending", 460);

        assertEquals("The End?", tracker.nearestChapter(book, 200));
    }

    @Test
    void testEquidistantPickHigher() {
        // Page 3 is exactly between 1 and 5. Must pick "Chapter 1b" (page 5).
        Map<String, Integer> book = new LinkedHashMap<>();
        book.put("Chapter 1a", 1);
        book.put("Chapter 1b", 5);

        assertEquals("Chapter 1b", tracker.nearestChapter(book, 3));
    }
}