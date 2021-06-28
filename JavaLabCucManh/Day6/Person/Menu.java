package JavaLabCucManh.Day6.Person;

import java.util.Scanner;

public class Menu {
    Scanner in = new Scanner(System.in);
    Validation validation = new Validation();
    public int menu() {
        int choice;
        System.out.println("1. Input person information.");
        System.out.println("2. Show 3 persons information by ascending of salary.");
        System.out.println("3. Exit.");
        System.out.print(" Enter your choice: ");
        return validation.checkInputIntLimit(1,3);
    }
}
