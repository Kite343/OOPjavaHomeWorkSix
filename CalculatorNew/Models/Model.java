package CalculatorNew.Models;

public interface Model <T, M>{
    public void setOperation(T operation);

    public T getOperation();

    public M result();
}
