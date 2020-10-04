package com.pavlova.homeworks.lecture06;

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

        /*
         * Fractions 0/2 and 0/6 it `s = 0 and should be equals
         */
        if (getNumerator() == 0) {
            return getNumerator() == that.getNumerator();
        }
        if (getNumerator() == that.getNumerator() &&
                getDenominator() == that.getDenominator()) {
            return true;
        }

        if ((double) getNumerator() / getDenominator() == (double) that.getNumerator() / that.getDenominator()) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        double result = (double) denominator / numerator;
        result = 31 * result;
        return (int) result;
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
        return fractionReduction(numerator, denominator);
    }

    @Override
    public Fraction minus(Fraction other) {
        int numerator = (getNumerator() * other.getDenominator()) - (other.getNumerator() * getDenominator());
        int denominator = getDenominator() * other.getDenominator();
        return fractionReduction(numerator, denominator);
    }

    @Override
    public Fraction multiply(Fraction other) {
        int numerator = getNumerator() * other.getNumerator();
        int denominator = getDenominator() * other.getDenominator();
        return fractionReduction(numerator, denominator);
    }

    @Override
    public Fraction divide(Fraction other) {
        int numerator = getNumerator() * other.getDenominator();
        int denominator = getDenominator() * other.getNumerator();
        return fractionReduction(numerator, denominator);
    }

    private Fraction fractionReduction(int numerator, int denominator) {
        if (numerator != 0 && denominator % numerator == 0) {
            denominator = denominator / numerator;
            numerator = numerator / numerator;
        } else if (numerator % denominator == 0) {
            numerator = numerator / denominator;
            denominator = denominator / denominator;
        }
        return new FractionImp(numerator, denominator);
    }

}
