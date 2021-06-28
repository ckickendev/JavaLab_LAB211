package JavaLabCucManh.Day4.Homework_equation;

public class Main {
    Validation validation = new Validation();
    public int option(){
        System.out.println("========= Equation Program =========");
        System.out.println("1. Calculate Superlative Equation");
        System.out.println("2. Calculate Quadratic Equation");
        System.out.println("3. Exit");
        System.out.println("Please choice one option:");
        int result = validation.checkInputIntLimit(1,3);
        return result;
    }
}
