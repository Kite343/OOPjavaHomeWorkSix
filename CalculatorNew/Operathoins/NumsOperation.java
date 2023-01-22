package CalculatorNew.Operathoins;

public abstract class NumsOperation<T> implements Operation<T>{
    T a;
    T b;
    Action op;

    public NumsOperation(){
        
    }
    public NumsOperation(T a, T b, Action op) {
        this.a = a;
        this.b = b;
        this.op = op;
    }
}
