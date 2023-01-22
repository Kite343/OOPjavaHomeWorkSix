package CalculatorNew.Actions;

import CalculatorNew.Numbers.Rational;

public class ActionsWithRational implements ActionsWithNums<Rational>{

    @Override
    public Rational sum(Rational a, Rational b) {
        int nom = a.getNominator() * b.getDenominator() + b.getNominator() * a.getDenominator();
        return new Rational(nom, a.getDenominator() * b.getDenominator());
    }

    @Override
    public Rational minus(Rational a, Rational b) {
        int nom = a.getNominator() * b.getDenominator() - b.getNominator() * a.getDenominator();
        return new Rational(nom, a.getDenominator() * b.getDenominator());
    }

    @Override
    public Rational mult(Rational a, Rational b) {
        return new Rational(a.getNominator() * b.getNominator(), a.getDenominator() * b.getDenominator());
    }

    @Override
    public Rational div(Rational a, Rational b) {
        return new Rational(a.getNominator() * b.getDenominator(), a.getDenominator() * b.getNominator());
    }
    
}
