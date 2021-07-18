package JavaLabCucManh.Day8.Bank_management;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Validation validation = new Validation();
        Locale vietnamese = new Locale("vi");
        Locale english = new Locale("en");
        System.out.println("1. Vietnamese");
        System.out.println("2. English");
        System.out.println("3. Exit");
        System.out.print("Please choice one option: ");
        int choice = validation.checkInputIntLimit(1, 3, english);
        switch (choice) {
            case 1: validation.login(vietnamese);
            break;
            case 2: validation.login(english);
            break;
            case 3: return;
        }
    }
}
