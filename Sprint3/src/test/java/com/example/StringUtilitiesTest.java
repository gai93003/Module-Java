package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;


public class StringUtilitiesTest {

    private StringUtilities utils;

    @BeforeEach
    void setup() {
        utils = new StringUtilities();
    }

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

    @Test
    void testSplitCommaSeparatedLine() {
        List<String> result = utils.splitCommaSeparatedLine("apple, banana, cherry");
        assertEquals(List.of("apple", "banana", "cherry"), result);

        List<String> emptyResult = utils.splitCommaSeparatedLine("");
        assertTrue(emptyResult.isEmpty());
    }
}