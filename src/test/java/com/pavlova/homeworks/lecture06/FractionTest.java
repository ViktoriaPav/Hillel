package com.pavlova.homeworks.lecture06;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {

    private static Fraction fraction1;
    private static Fraction fraction2;
    private static Fraction fraction3;
    private static Fraction fraction4;

    @BeforeAll
    static void initI() {
        fraction1 = new FractionImp(1, 2);
        fraction2 = new FractionImp(1, 2);
        fraction3 = new FractionImp(1, 3);
        fraction4 = new FractionImp(2, 4);
    }

    @Test
    void testEquals() {
        assertTrue(fraction1.equals(fraction2));
    }

    @Test
    void testEqualsWithNotSameDenomination() {
        assertTrue(fraction1.equals(fraction4));
    }

    @Test
    void plusWithSameDenominator() {
        Fraction result = fraction1.plus(fraction2);
        assertEquals(1, result.getNumerator());
        assertEquals(1, result.getDenominator());
    }

    @Test
    void plusWithNotSameDenominator() {
        Fraction result = fraction1.plus(fraction3);
        assertEquals(5, result.getNumerator());
        assertEquals(6, result.getDenominator());
    }

    @Test
    void minus() {
        Fraction result = fraction1.minus(fraction2);
        assertEquals(0, result.getNumerator());
        assertEquals(4, result.getDenominator());
    }

    @Test
    void multiply() {
        Fraction result = fraction1.multiply(fraction2);
        assertEquals(1, result.getNumerator());
        assertEquals(4, result.getDenominator());
    }

    @Test
    void divideWithSameDenominatorAndNumerator() {
        Fraction result = fraction1.divide(fraction2);
        assertEquals(2, result.getNumerator());
        assertEquals(2, result.getDenominator());
    }

    @Test
    void divideWithNotSameDenominatorAndNumerator() {
        Fraction result = fraction1.divide(fraction3);
        assertEquals(3, result.getNumerator());
        assertEquals(2, result.getDenominator());
    }
}