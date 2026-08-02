package com.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Utility class providing string manipulation and validation methods.
 *
 * @see StringUtilitiesTest
 */
public class StringUtilities {

    /**
     * Determines whether the given string is a palindrome.
     *
     * <p>A palindrome is a sequence of characters that reads the same backward as forward.
     * This implementation ignores case, spaces, and non-alphanumeric characters.
     *
     * @param s the string to evaluate for palindrome properties; may be {@code null}
     * @return {@code true} if {@code s} is a valid non-empty palindrome; {@code false} otherwise
     * @see StringBuilder#reverse()
     */
    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        // Normalize: remove non-alphanumeric characters and convert to lowercase
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return !cleaned.isEmpty() && cleaned.equals(reversed);
    }

    /**
     * Splits a comma-separated string into a list of trimmed string tokens
     *
     * <p>Example usage:
     * <pre>{@code
     * StringUtilities utils = new StringUtilities();
     * List<String> items = utils.splitCommaSeparatedLine("apple, banana , cherry ");
     * // items contains ["apple", "banana", "cherry"]
     * }</pre>
     *
     * @param s the comma-separated input string; may be {@code null}
     * @return a {@link List} of trimmed string tokens, or an empty list of {@code s} is null/blank
     * @see String#split(String)
     * @see String#trim()
     */
    public List<String> splitCommaSeparatedLine(String s) {
        if (s == null || s.trim().isEmpty()) {
            return Collections.emptyList();
        }
        // Split by comma and trim whitespace around items
        return Arrays.stream(s.split(","))
                .map(String::trim)
                .toList();
    }
}