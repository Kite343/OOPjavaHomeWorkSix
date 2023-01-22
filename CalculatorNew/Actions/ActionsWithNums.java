package CalculatorNew.Actions;

public interface ActionsWithNums<T> {
    public T sum(T a, T b);

    public T minus(T a, T b);

    public T mult(T a, T b);

    public T  div(T a, T b);
}
