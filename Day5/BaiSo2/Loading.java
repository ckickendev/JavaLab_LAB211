package JavaLabCucManh.Day5.BaiSo2;

import java.text.BreakIterator;

public class Loading {
    Validation validation = new Validation();
    public void option1() {
        System.out.println("----- Normal Calculator -----");
        double number1;
        double number2;
        String operate;
        System.out.print("Enter number: ");
        number1 = validation.checkInputDouble();
        do {
            System.out.print("Enter Enter Operator: ");
            operate = validation.checkOpe();
            if (operate.compareToIgnoreCase("=")!=0) {
                System.out.print("Input number: ");
                number2 = validation.checkInputDouble();
                number1 = calculate(number1, number2, operate);
            }else {
                break;
            }
            System.out.println("Memory:" + number1);
        }while(operate!= "=");
        System.out.println("Result:" + number1);
    }

    public double calculate(double a, double b, String ope){
        switch (ope) {
            case "+": {
                return a + b;
            }
            case "-": {
                return a - b;
            }
            case "*": {
                return a * b;
            }
            case "/": {
                return a / b;
            }
            case "^": {
                return Math.pow(a, b);
            }
        }
        return 0;
    }

    public void option2() {
        System.out.println("----- BMI Calculator -----");
        System.out.print("Enter Weight(kg):");
        double a = validation.checkInputBMI();
        System.out.print("Enter Height(cm):");
        double b = validation.checkInputBMI();
        double BMI = a / ((b/100)*(b/100));
        System.out.print("BMI Number: " + BMI) ;
        String bmistatus = "";
        if(BMI < 19){
            bmistatus = "Under-standard";
        }else if(BMI < 25){
            bmistatus = "standard";
        }else if(BMI < 30){
            bmistatus = "Overweight";
        }else if(BMI < 40){
            bmistatus = "Fat - should lose weight";
        }else {
            bmistatus = "Very fat";
        }
        System.out.println("BMI Status: " + bmistatus);
    }
}
