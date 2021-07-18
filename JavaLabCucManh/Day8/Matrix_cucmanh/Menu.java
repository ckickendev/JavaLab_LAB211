package JavaLabCucManh.Day8.Matrix_cucmanh;

public class Menu {
    Validation validation = new Validation();
    public int option(){
        System.out.println("=======Calculate program========");
        System.out.println("1. Addition Matrix");
        System.out.println("2. Subtraction Matrix");
        System.out.println("3. Multiplication Matrix");
        System.out.println("4. Quit");
        System.out.println("Please input your choice");
        return validation.checkInputIntLimit(1,4);
    }
}
