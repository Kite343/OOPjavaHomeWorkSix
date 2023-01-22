package CalculatorNew.Numbers;

public class Rational {
    private int nominator;
    private int denominator;

    public Rational() {
        this(0, 1);
    }

    public Rational(int nominator) {
        this(nominator, 1);
    }

    public Rational(int nominator, int denominator) {
        this.nominator = nominator;
        this.denominator = denominator;
    }
    
    public void setNominator(int nominator) {
        this.nominator = nominator;
    }

    public int getNominator() {
        return nominator;
    }     
    
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    
    public int getDenominator() {
        return denominator;
    }


    public double getValue() {
        return nominator / (double) denominator;
    }

    @Override
    public String toString() {
        if(denominator == 1){
            return Integer.toString(nominator);
        }
        return nominator + "/" + denominator;
    }
    
}
