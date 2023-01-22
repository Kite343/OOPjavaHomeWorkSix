package CalculatorNew.Controller;

import CalculatorNew.Models.ComplexModel;
import CalculatorNew.Models.RationalModel;
import CalculatorNew.Views.ConsoleView;
import CalculatorNew.Views.View;
import java.io.IOException;
import java.util.logging.*;

public class Programm {
    View view;
    Controller controller;
    Logger logger;
    FileHandler fh;
    SimpleFormatter sFormat;

    public Programm()   throws IOException {
        this.view = new ConsoleView();
        logger = Logger.getLogger("CalcLog");
        fh = new FileHandler("log.txt",true);
        logger.addHandler(fh);
        sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
    }

    public void start() {
        boolean start;
        String text = "Начать работу с калькулятором?\n1 - да \n2 - нет";
        start = startCalc(text);
        while (start){
            this.logger.log(Level.INFO, "старт программы");
            switch (view.getValueInt("Выберите тип калькулятора:\n1 - Рациональные числа \n2 - Комплексные числа")) {
                case 1:
                    this.controller = new Controller(new RationalModel(), view);
                    controller.startCalcRational();
                    break;
    
                case 2:
                    this.controller = new Controller(new ComplexModel(), view);
                    controller.startCalcComplex();
                    break;
            
                default:
                    view.print("ошибка. не верный выбор типа чисел");
                    this.logger.log(Level.INFO, "ошибка. не верный выбор типа калькулятора");
                    break;
            }

            text = "Продолжить работу с калькулятором?\n1 - да \n2 - нет";
            start = startCalc(text);
        }
    }

    private boolean startCalc(String text){
        switch (view.getValueInt(text)) {
            case 1:
                this.logger.log(Level.INFO, "Начало работы программы");
                return true;

            case 2:
                this.logger.log(Level.INFO, "конец работы программы");
                return false;
        
            default:
                view.print("ошибка. не верный выбор");
                this.logger.log(Level.INFO, "ошибка. не верный выбор (начало работы программы или конец");
                return false;
        }
    }

    
}
