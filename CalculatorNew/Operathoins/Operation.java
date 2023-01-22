package CalculatorNew.Operathoins;

public interface Operation<T> {
    
    public T getA();

    public void setA(T a);
    
    public T getB();

    public void setB(T b);

    public Action getOp();

    public void setOp(Action op);
}
