package com.example;

/**
 * Provides basic mathematical operations including arithmetic calculations,
 * like addition, multiplication and so on.
 *
 * <p>Example usage:
 * <pre>{@code
 * Calculator calc = new Calculator();
 * int sum = calc.add(5, 3);
 * double root = calc.squareRoot(16);
 * }</pre>
 *
 * @author Gabriel
 * @version 1.0
 * @see CalculatorTest
 */
public class Calculator {

    /**
     * Adds two integers
     * @param a
     * @param b
     * @return sum of a and b
     */
    public int add (int a, int b) {
        return a + b;
    }

    public int subtract (int a,  int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides the first integer by the second integer using integer division.
     *
     * <p><b>Note:</b> Because this method performs integer division, fractional
     * results are truncated towards zero</p>
     * @param a
     * @param b
     * @return the integer quotient by {@code a} divided by {@code b}
     * @throws IllegalArgumentException if {@code b} is zero
     * @see #multiply(int, int)
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }

        return a / b;
    }

    /**
     * Gets the square root of a number.
     * @param a
     * @return b as the result of finding the square root of the number.
     */
    public double squareRoot(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number.");
        }
        return Math.sqrt(a);
    }

    public int square(int a) {
        return a * a;
    }
}