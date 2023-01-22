package CalculatorNew.Views;

import java.util.Scanner;

public class ConsoleView implements View{

    private Scanner in;
    public ConsoleView() {
        in = new Scanner(System.in);
    }

    @Override
    public String getValueStr(String title) {
        System.out.println(title);
        return in.next();
    }

    @Override
    public int getValueInt(String title) {
        System.out.printf("%s\n", title);
        return in.nextInt();
    }

    @Override
    public double getValueDouble(String title) {
        System.out.printf("%s\n", title);
        return in.nextDouble();
    }

    @Override
    public void print(String title) {
        System.out.println(title);
        
    }
    
}
