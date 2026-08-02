package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit test suite for verifying the behavior of {@link Calculator}.
 *
 * @see Calculator
 */
public class CalculatorTest {
    private Calculator calculator;

    /**
     * Initializes a fresh instance of {@link Calculator} before each test runs.
     */
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    /**
     * Tests {@link Calculator#add(int int)} with positive and negative integers.
     */
    @Test
    void testAdd() {
        assertEquals(4, calculator.add(2, 2));
        assertEquals(-1, calculator.add(2, -3));
    }

    @Test
    void testSubtract() {
        assertEquals(3, calculator.subtract(7, 4));
    }

    @Test
    void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    void testDivide() {
        assertEquals(3, calculator.divide(15, 5));
        assertEquals(-2, calculator.divide(6, -3));
    }

    /**
     * Verifies that {@link Calculator#divide(int, int)} throws an
     * {@link IllegalAccessException} when attempting to divide by zero.
     */
    @Test
    void testDivideByZero() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculator.divide(10, 0)
        );
        assertEquals("Division by zero", exception.getMessage());
    }

    @Test
    void testSquare() {
        assertEquals(9, calculator.square(3));
        assertEquals(9, calculator.square(-3));
    }

    @Test
    void testSquareRoot() {
        assertEquals(5.0, calculator.squareRoot(25), 0.0001);
    }

    /**
     * Verifies that {@link Calculator#squareRoot(int) throws an} throws
     * {@link IllegalArgumentException} when a passed a negative integer.
     */
    @Test
    void testSquareRootNegativeThrows() {
        assertThrows(
                IllegalArgumentException.class,
                () -> calculator.squareRoot(-4)
        );
    }
}