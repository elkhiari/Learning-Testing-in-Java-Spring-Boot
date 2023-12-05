package com.eclipse;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calc;

    @BeforeEach
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void testAdd() {
        int r = calc.add(3,5);
        Assertions.assertEquals(8,r,"Addition failed");
    }

    @Test
    public void testSubtract() {
        int r = calc.subtract(8, 3);
        Assertions.assertEquals(5, r, "Subtraction failed");
    }

    @Test
    public void testMultiply() {
        int r = calc.multiply(4, 3);
        Assertions.assertEquals(12, r, "Multiplication failed");
    }

    @Test
    public void testDivide() {
        int r = calc.divide(8, 2);
        Assertions.assertEquals(4, r, "Division failed");
    }

    @Test
    public void testDivideByZero() {
        Assertions.assertThrows(IllegalArgumentException.class,
                ()-> calc.divide(33, 0),
                "Divide By Zero should be throw IllegaleArgumentException");
    }
}
