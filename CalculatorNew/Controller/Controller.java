package CalculatorNew.Controller;

import CalculatorNew.Models.Model;
import CalculatorNew.Operathoins.ComplexOperationBuilder;
import CalculatorNew.Operathoins.RationalOperationBuilder;
import CalculatorNew.Views.View;

public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // нет проверок на правильность ввода
    public void startCalcRational() {
        boolean start;
        String text = "Начать работу с калькулятором Рациональных чисел?\n1 - да \n2 - нет";
        start = startCalc(text);
        while (start){
            view.print("Введите первое число");
            int a1 = view.getValueInt("числитель: ");
            int b1 = view.getValueInt("знаменатель: ");
            String op = view.getValueStr("Введите действие: +, -, *, /");
            view.print("Введите второе число");
            int a2 = view.getValueInt("числитель: ");
            int b2 = view.getValueInt("знаменатель: ");

            RationalOperationBuilder rat = new RationalOperationBuilder();
            rat.setA(a1, b1);
            rat.setB(a2, b2);
            rat.setOp(op);

            model.setOperation(rat.getRationalOp());

            view.print("=" + model.result());

            text = "Продолжить работу с калькулятором Рациональных чисел?\n1 - да \n2 - нет";
            start = startCalc(text);
        }
        
    }

    public void startCalcComplex() {
        boolean start;
        String text = "Начать работу с калькулятором Комплексных чисел?\n1 - да \n2 - нет";
        start = startCalc(text);
        while (start){

            view.print("Введите первое число");
            double a1 = view.getValueDouble("действительная часть:: ");
            double b1 = view.getValueDouble("мнимая часть: ");
            String op = view.getValueStr("Введите действие: +, -, *, /");
            view.print("Введите второе число");
            double a2 = view.getValueDouble("действительная часть:: ");
            double b2 = view.getValueDouble("мнимая часть: ");

            ComplexOperationBuilder compl = new ComplexOperationBuilder();
            compl.setA(a1, b1);
            compl.setB(a2, b2);
            compl.setOp(op);

            model.setOperation(compl.getComplexOp());

            view.print("=" + model.result());

            text = "Продолжить работу с калькулятором Комплексных чисел?\n1 - да \n2 - нет";
            start = startCalc(text);
        }
        
    }

    private boolean startCalc(String text){
        switch (view.getValueInt(text)) {
            case 1:

                return true;

            case 2:
                
                return false;
        
            default:

                view.print("ошибка. не верный выбор");
                
                return false;
        }
    }

    
}
