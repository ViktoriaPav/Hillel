package com.pavlova.homeworks.lecture06;

import java.util.Objects;

public class FractionImp implements Fraction {
    private final int numerator;
    private final int denominator;

    public FractionImp(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator can not be 0!");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FractionImp)) return false;
        FractionImp that = (FractionImp) o;
        if (getNumerator() == 0) {
            return getNumerator() == that.getNumerator();
        }
        if (getNumerator() == that.getNumerator() &&
                getDenominator() == that.getDenominator()) {
            return true;
        }
        if (getDenominator() / that.getDenominator() == getNumerator() / that.getNumerator()) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumerator(), getDenominator());
    }

    @Override
    public String toString() {
        if (getNumerator() == 0) {
            return "0";
        }
        return numerator + "/" + denominator;
    }

    @Override
    public int getNumerator() {
        return numerator;
    }

    @Override
    public int getDenominator() {
        return denominator;
    }

    @Override
    public Fraction plus(Fraction other) {
        int numerator = (getNumerator() * other.getDenominator()) + (other.getNumerator() * getDenominator());
        int denominator = getDenominator() * other.getDenominator();
        if (numerator % denominator == 0 && numerator != 0) {
            denominator = denominator / numerator;
            numerator = numerator / numerator;
        }
        return new FractionImp(numerator, denominator);
    }

    @Override
    public Fraction minus(Fraction other) {
        int numerator = (getNumerator() * other.getDenominator()) - (other.getNumerator() * getDenominator());
        int denominator = getDenominator() * other.getDenominator();
        if (numerator % denominator == 0 && numerator != 0) {
            denominator = denominator / numerator;
            numerator = numerator / numerator;
        }
        return new FractionImp(numerator, denominator);
    }

    @Override
    public Fraction multiply(Fraction other) {
        return new FractionImp(getNumerator() * other.getNumerator(),
                getDenominator() * other.getDenominator());

    }

    @Override
    public Fraction divide(Fraction other) {
        return new FractionImp(getNumerator() * other.getDenominator(),
                getDenominator() * other.getNumerator());
    }
}
