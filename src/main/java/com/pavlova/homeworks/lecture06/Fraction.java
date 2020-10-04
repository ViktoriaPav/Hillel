package com.pavlova.homeworks.lecture06;

public interface Fraction {

    int getNumerator();

    int getDenominator();

    Fraction plus(Fraction other);

    Fraction minus(Fraction other);

    Fraction multiply(Fraction other);

    Fraction divide(Fraction other);

}
