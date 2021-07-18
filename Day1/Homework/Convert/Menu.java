package JavaLabCucManh.Day1.Homework.Convert;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    public int menu() {
        System.out.println("Base: ");
        System.out.println("1: Binary. ");
        System.out.println("2: Decimal. ");
        System.out.println("3: Hexadecimal. ");
        System.out.println("Another: Exitttttttt.");
        System.out.println();
        System.out.print("Enter the base of input?????????????????????: ");
        int input = Integer.parseInt(scanner.nextLine());
        return input;
    }

    public int outPut(){
        System.out.print("Enter the base of output????????????????????: ");
        int output = Integer.parseInt(scanner.nextLine());
        return output;
    }

    public String inputNumber(){
        System.out.println("Input number you want to convert");
        String number = scanner.nextLine();
        return number;
    }
}
