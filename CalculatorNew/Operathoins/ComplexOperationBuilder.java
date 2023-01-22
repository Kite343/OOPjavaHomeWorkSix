package CalculatorNew.Operathoins;

import CalculatorNew.Numbers.Complex;

public class ComplexOperationBuilder {
    Complex a;
    Complex b;
    Action op;

    public void setA(double a1, double b1) {
        this.a = new Complex(a1, b1);
    }
    public void setB(double a2, double b2) {
        this.b = new Complex(a2, b2);
    }
    public void setOp(String oper) {
        switch (oper) {
            case "+":
                this.op = Action.sum;
                break;
            
            case "-":
                this.op = Action.minus;
                break;
            
            case "*":
                this.op = Action.mult;
                break;  
                
            case "/":
                this.op = Action.div;
                break;
            default:
                this.op = Action.sum;   // временно, до реализации проверки на ошибки
                break;
        }
        
    }

    public ComplexOperation getComplexOp(){
        return new ComplexOperation(a, b, op);
    }
}
