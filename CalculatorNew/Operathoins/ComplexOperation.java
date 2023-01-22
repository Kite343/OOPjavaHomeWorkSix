package CalculatorNew.Operathoins;

import CalculatorNew.Numbers.Complex;

public class ComplexOperation extends NumsOperation<Complex>{

    
    public ComplexOperation(Complex a, Complex b, Action op) {
        super(a, b, op);
    }

    @Override
    public Complex getA() {
        return a;
    }

    @Override
    public void setA(Complex a) {
        this.a = a;
        
    }

    @Override
    public Complex getB() {
        return b;
    }

    @Override
    public void setB(Complex b) {
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
