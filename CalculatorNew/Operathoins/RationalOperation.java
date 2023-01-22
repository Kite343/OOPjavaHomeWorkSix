package CalculatorNew.Operathoins;

import CalculatorNew.Numbers.Rational;

public class RationalOperation  extends NumsOperation<Rational>{

    
    public RationalOperation(Rational a, Rational b, Action op) {
        super(a, b, op);
    }

    @Override
    public Rational getA() {
        return a;
    }

    @Override
    public void setA(Rational a) {
        this.a = a;
        
    }

    @Override
    public Rational getB() {
        return b;
    }

    @Override
    public void setB(Rational b) {
        this.b = b;
        
    }

    @Override
    public Action getOp() {
        return op;
    }

    @Override
    public void setOp(Action op) {
        this.op = op;        
    }
    
}
