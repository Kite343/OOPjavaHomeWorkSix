package CalculatorNew.Models;

import CalculatorNew.Actions.ActionsWithRational;
import CalculatorNew.Numbers.Rational;
import CalculatorNew.Operathoins.RationalOperation;

public class RationalModel extends NumsModel<RationalOperation, Rational>{
    ActionsWithRational actionsR;

    public RationalModel() {
        this.actionsR = new ActionsWithRational();
    }

    @Override
    public void setOperation(RationalOperation operation) {
        this.operation = operation;
        
    }

    @Override
    public RationalOperation getOperation() {
        return operation;
    }

    @Override
    public Rational result() {
        switch (operation.getOp()) {
            case sum:
                
                return actionsR.sum(operation.getA(), operation.getB());

            case minus:

                return actionsR.minus(operation.getA(), operation.getB());

            case mult:

                return actionsR.mult(operation.getA(), operation.getB());

            case div:

                return actionsR.div(operation.getA(), operation.getB());
        
            default:
                return null;
        }
    }


    
}
