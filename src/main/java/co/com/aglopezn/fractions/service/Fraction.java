package co.com.aglopezn.fractions.service;

import java.util.Objects;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
        if (denominator == 0) throw new IllegalArgumentException("Can not divide by zero");
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction plus(Fraction that){
        int resNumerator = (this.numerator * that.denominator ) + (that.numerator * this.denominator);
        int resDenominator = this.denominator * that.denominator;
        return new Fraction(resNumerator, resDenominator).simplify();
    }

    public Fraction times(Fraction that) {
        int resNumerator = this.numerator * that.numerator;
        int resDenominator = this.denominator * that.denominator;
        return new Fraction(resNumerator, resDenominator).simplify();
    }

    public Fraction minus(Fraction that){
        Fraction opposite = opposite(that);
        return this.plus(opposite);
    }

    public Fraction dividedBy(Fraction that){
        Fraction reciprocal = reciprocal(that);
        return this.times(reciprocal);
    }

    public Fraction simplify(){
        int mcd = greatestCommonDivisor(this.numerator, this.denominator);
        return new Fraction(this.numerator / mcd, this.denominator / mcd);
    }

    private Fraction reciprocal(Fraction f){
        return new Fraction(f.denominator, f.numerator);
    }

    private Fraction opposite(Fraction f){
        return new Fraction(f.numerator * (-1), f.denominator);
    }

    private int greatestCommonDivisor(int a, int b){
        return (b == 0) ? a : greatestCommonDivisor(b, a % b);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator && denominator == fraction.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public String toString() {
        return String.format("%d/%d", numerator, denominator);
    }
}
