package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

/**
 * Unit test suite for verifying {@link StringUtilities} behavior and edge cases.
 *
 * @see StringUtilities
 */
public class StringUtilitiesTest {

    private StringUtilities utils;

    /**
     * Instantiates a fresh {@link StringUtilities} object prior to executing each test method.
     */
    @BeforeEach
    void setup() {
        utils = new StringUtilities();
    }

    /**
     * Tests standard single-word palindromes and non-palindromes with uniform casing.
     */
    @Test
    void testPalindrome() {
        assertTrue(utils.isPalindrome("assa"));
        assertFalse(utils.isPalindrome("ass"));
    }

    @Test
    void testPalindromeEdgeCases() {
        assertFalse(utils.isPalindrome(null));
        assertTrue(utils.isPalindrome("A man, a plan, a canal: Panama"));
    }

    /**
     * Verifies that {@link StringUtilities#splitCommaSeparatedLine(String)} correctly
     * splits entries, strips whitespace around tokens, and handles empty inputs gracefully.
     */
    @Test
    void testSplitCommaSeparatedLine() {
        List<String> result = utils.splitCommaSeparatedLine("apple, banana, cherry");
        assertEquals(List.of("apple", "banana", "cherry"), result);

        List<String> emptyResult = utils.splitCommaSeparatedLine("");
        assertTrue(emptyResult.isEmpty());
    }
}