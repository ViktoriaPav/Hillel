package com.pavlova.homeworks.lecture06;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {

    private static Fraction fraction1;
    private static Fraction fraction2;
    private static Fraction fraction3;
    private static Fraction fraction4;
    private static Fraction fraction5;

    @BeforeAll
    static void initI() {
        fraction1 = new FractionImp(1, 2);
        fraction2 = new FractionImp(1, 2);
        fraction3 = new FractionImp(1, 3);
        fraction4 = new FractionImp(2, 4);
        fraction5 = new FractionImp(5, 3);
    }

    @Test
    void testEqualsWithSameDenominationAndSameFractions() {
        assertTrue(fraction1.equals(fraction2));
        assertTrue(fraction1.hashCode() == fraction2.hashCode());
    }

    @Test
    void testEqualsWithNotSameDenomination() {
        assertFalse(fraction1.equals(fraction3));
        assertFalse(fraction1.hashCode() == fraction3.hashCode());
    }

    @Test
    void testEqualsWithNotSameDenominationButSameFractions() {
        assertTrue(fraction1.equals(fraction4));
        assertTrue(fraction1.hashCode() == fraction4.hashCode());
    }

    @Test
    void testPlusWithSameDenominator() {
        Fraction result = fraction1.plus(fraction2);
        assertEquals(1, result.getNumerator());
        assertEquals(1, result.getDenominator());
    }

    @Test
    void testPlusWithNotSameDenominator() {
        Fraction result = fraction1.plus(fraction3);
        assertEquals(5, result.getNumerator());
        assertEquals(6, result.getDenominator());
    }

    @Test
    void testPlusWithSameDenominatorWhereNumeratorMoreThenDenominator() {
        Fraction result = fraction3.plus(fraction5);
        assertEquals(2, result.getNumerator());
        assertEquals(1, result.getDenominator());
    }

    @Test
    void testMinusWithSameDenominator() {
        Fraction result = fraction1.minus(fraction2);
        assertEquals(0, result.getNumerator());
        assertEquals(1, result.getDenominator());
    }

    @Test
    void testMinusWithNotSameDenominator() {
        Fraction result = fraction5.minus(fraction1);
        assertEquals(7, result.getNumerator());
        assertEquals(6, result.getDenominator());
    }

    @Test
    void testMultiplyWithSameDenominator() {
        Fraction result = fraction1.multiply(fraction2);
        assertEquals(1, result.getNumerator());
        assertEquals(4, result.getDenominator());
    }

    @Test
    void testMultiplyWithNotSameDenominator() {
        Fraction result = fraction1.multiply(fraction4);
        assertEquals(1, result.getNumerator());
        assertEquals(4, result.getDenominator());
    }

    @Test
    void testDivideWithSameDenominatorAndNumerator() {
        Fraction result = fraction1.divide(fraction2);
        assertEquals(1, result.getNumerator());
        assertEquals(1, result.getDenominator());
    }

    @Test
    void testDivideWithNotSameDenominatorAndNumerator() {
        Fraction result = fraction1.divide(fraction3);
        assertEquals(3, result.getNumerator());
        assertEquals(2, result.getDenominator());
    }

    @Test
    void testBadFractionCreation() {
        assertThrows(IllegalArgumentException.class, () -> new FractionImp(1, 0));
    }
}