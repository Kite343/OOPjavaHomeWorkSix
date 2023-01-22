package CalculatorNew.Actions;

import CalculatorNew.Numbers.Complex;

public class ActionsWithComplex implements ActionsWithNums<Complex>{

    @Override
    public Complex sum(Complex a, Complex b) {        
        return new Complex(a.getReal() + b.getReal(),a.getImage() + b.getImage());
    }

    @Override
    public Complex minus(Complex a, Complex b) {
        
        return new Complex(a.getReal() - b.getReal(),a.getImage() - b.getImage());
    }

    @Override
    public Complex mult(Complex a, Complex b) {
        double newR = a.getReal() * b.getReal() - a.getImage() * b.getImage();
        double newI = a.getReal() * b.getImage() + a.getImage() * b.getReal();
        return new Complex(newR, newI);
    }

    @Override
    public Complex div(Complex a, Complex b) {
        double newR = (a.getReal() * b.getReal() + a.getImage() * b.getImage()) / (b.getReal() * b.getReal() + b.getImage() * b.getImage());
        double newI = (a.getImage() * b.getReal() - a.getReal() * b.getImage()) / (b.getReal() * b.getReal() + b.getImage() * b.getImage());
        return new Complex(newR, newI);
    }
    
}
