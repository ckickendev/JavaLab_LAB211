package JavaLabCucManh.Day4.Homework_equation;

public class View {
    public static void main(String[] args) {
        Main main = new Main();
        Calculate calculate = new Calculate();
        int option;
        do{
            option = main.option();
            switch (option){
                case 1:{
                    calculate.SuperlativeEquation();
                    break;
                }
                case 2:{
                    calculate.QuadraticEquation();
                    break;
                }
            }
        }while (option!=3);
    }
}
