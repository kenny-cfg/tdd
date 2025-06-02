package com.kenny.wenny.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringReverserTest {
    @Test
    void when_passingInString_then_returnsStringReversed() {
        var reverser = new StringReverser();

        var result = reverser.reverse("abc");

        assertEquals("cba", result);
    }

    @Test
    void when_passingInMultipleWords_then_returnsStringReversed() {
        var reverser = new StringReverser();

        var result = reverser.reverse("hello world");

        assertEquals("dlrow olleh", result);
    }
}