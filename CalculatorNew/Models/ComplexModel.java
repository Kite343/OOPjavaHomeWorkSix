package CalculatorNew.Models;

import CalculatorNew.Actions.ActionsWithComplex;
import CalculatorNew.Numbers.Complex;
import CalculatorNew.Operathoins.ComplexOperation;

public class ComplexModel  extends NumsModel<ComplexOperation, Complex>{

    ActionsWithComplex actionsC;

    public ComplexModel() {
        this.actionsC = new ActionsWithComplex();
    }

    @Override
    public void setOperation(ComplexOperation operation) {
        this.operation = operation;
        
    }

    @Override
    public ComplexOperation getOperation() {
        return operation;
    }

    @Override
    public Complex result() {
        switch (operation.getOp()) {
            case sum:
                
                return actionsC.sum(operation.getA(), operation.getB());

            case minus:

                return actionsC.minus(operation.getA(), operation.getB());

            case mult:

                return actionsC.mult(operation.getA(), operation.getB());

            case div:

                return actionsC.div(operation.getA(), operation.getB());
        
            default:
                return null;
        }
    }
    
}
