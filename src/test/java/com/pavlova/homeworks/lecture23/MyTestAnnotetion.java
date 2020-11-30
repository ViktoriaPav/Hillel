package com.pavlova.homeworks.lecture23;

import com.pavlova.homeworks.lecture06.Fraction;
import com.pavlova.homeworks.lecture06.FractionImp;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyTestAnnotetion {

    private static Fraction fraction1;
    private static Fraction fraction2;
    private static Fraction fraction3;
    private static Fraction fraction4;
    private static Fraction fraction5;
    private static Fraction fraction6;

    @MyTest
    void testEqualsWithSameDenominationAndSameFractions() {
        fraction1 = new FractionImp(1, 2);
        fraction2 = new FractionImp(1, 2);
        assertTrue(fraction1.equals(fraction2));
        assertTrue(fraction1.hashCode() == fraction2.hashCode());
    }

    @MyTest
    void testEqualsWithNotSameDenomination() {
        fraction1 = new FractionImp(1, 2);
        fraction3 = new FractionImp(1, 3);
        assertFalse(fraction1.equals(fraction3));
        assertFalse(fraction1.hashCode() == fraction3.hashCode());
    }

    @MyTest
    void testEquals(){
        fraction3 = new FractionImp(1, 3);
        fraction6 = new FractionImp(3, 9);
        assertTrue(fraction3.equals(fraction6));
        assertTrue(fraction3.hashCode() == fraction6.hashCode());
    }

    @MyTest
    void testEqualsWithNotSameDenominationButSameFractions() {
        fraction1 = new FractionImp(1, 2);
        fraction4 = new FractionImp(2, 4);
        assertTrue(fraction1.equals(fraction4));
        assertTrue(fraction1.hashCode() == fraction4.hashCode());
    }

    @MyTest
    void testPlusWithSameDenominator() {
        fraction1 = new FractionImp(1, 2);
        fraction2 = new FractionImp(1, 2);
        Fraction result = fraction1.plus(fraction2);
        assertEquals(1, result.getNumerator());
        assertEquals(1, result.getDenominator());
    }

    @MyTest
    void testPlusWithNotSameDenominator() {
        fraction1 = new FractionImp(1, 2);
        fraction3 = new FractionImp(1, 3);
        Fraction result = fraction1.plus(fraction3);
        assertEquals(5, result.getNumerator());
        assertEquals(6, result.getDenominator());
    }

    @MyTest
    void testPlusWithSameDenominatorWhereNumeratorMoreThenDenominator() {
        fraction3 = new FractionImp(1, 3);
        fraction5 = new FractionImp(5, 3);
        Fraction result = fraction3.plus(fraction5);
        assertEquals(2, result.getNumerator());
        assertEquals(1, result.getDenominator());
    }

    @MyTest
    void testMinusWithSameDenominator() {
        fraction1 = new FractionImp(1, 2);
        fraction2 = new FractionImp(1, 2);
        Fraction result = fraction1.minus(fraction2);
        assertEquals(0, result.getNumerator());
        assertEquals(1, result.getDenominator());
    }

    @MyTest
    void testMinusWithNotSameDenominator() {
        fraction1 = new FractionImp(1, 2);
        fraction5 = new FractionImp(5, 3);
        Fraction result = fraction5.minus(fraction1);
        assertEquals(7, result.getNumerator());
        assertEquals(6, result.getDenominator());
    }

    @MyTest
    void testMultiplyWithSameDenominator() {
        fraction1 = new FractionImp(1, 2);
        fraction2 = new FractionImp(1, 2);
        Fraction result = fraction1.multiply(fraction2);
        assertEquals(1, result.getNumerator());
        assertEquals(4, result.getDenominator());
    }

    @MyTest
    void testMultiplyWithNotSameDenominator() {
        fraction1 = new FractionImp(1, 2);
        fraction4 = new FractionImp(2, 4);
        Fraction result = fraction1.multiply(fraction4);
        assertEquals(1, result.getNumerator());
        assertEquals(4, result.getDenominator());
    }

    @MyTest
    void testDivideWithSameDenominatorAndNumerator() {
        fraction1 = new FractionImp(1, 2);
        fraction2 = new FractionImp(1, 2);
        Fraction result = fraction1.divide(fraction2);
        assertEquals(1, result.getNumerator());
        assertEquals(1, result.getDenominator());
    }

    @MyTest
    void testDivideWithNotSameDenominatorAndNumerator() {
        fraction1 = new FractionImp(1, 2);
        fraction3 = new FractionImp(1, 3);
        Fraction result = fraction1.divide(fraction3);
        assertEquals(3, result.getNumerator());
        assertEquals(2, result.getDenominator());
    }

    @MyTest
    void testBadFractionCreation() {
        assertThrows(IllegalArgumentException.class, () -> new FractionImp(1, 0));
    }

}
