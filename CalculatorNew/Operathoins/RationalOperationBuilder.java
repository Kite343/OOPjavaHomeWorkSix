package CalculatorNew.Operathoins;

import CalculatorNew.Numbers.Rational;

public class RationalOperationBuilder {
    Rational a;
    Rational b;
    Action op;

    public void setA(int a1, int b1) {
        this.a = new Rational(a1, b1);
    }
    public void setB(int a2, int b2) {
        this.b = new Rational(a2, b2);
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

    public RationalOperation getRationalOp(){
        return new RationalOperation(a, b, op);
    }

    

    
}
