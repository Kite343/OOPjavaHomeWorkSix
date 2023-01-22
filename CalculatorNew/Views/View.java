package CalculatorNew.Views;

public interface View {
    public String getValueStr(String title);

    public int getValueInt(String title);

    public double getValueDouble(String title);

    public void print(String title);
}
