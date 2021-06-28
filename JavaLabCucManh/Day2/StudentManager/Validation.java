package JavaLabCucManh.Day2.StudentManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Validation {
    private final Scanner sc = new Scanner(System.in);

    public String checkInputString() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("No empty input");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    public int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int choice = Integer.parseInt(checkInputString());
                if (choice < min || choice > max) {
                    throw new NumberFormatException();
                }
                return choice;
            } catch (NumberFormatException e) {
                System.out.println("Please enter number in range [" + min + "," + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    public boolean checkInputYN() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }
            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.out.println("Please enter y/Y or n/N");
            System.out.print("Enter again: ");
        }
    }

    public double checkInputDouble() {
        while (true) {
            try {
                double result = Double.parseDouble(checkInputString());
                if (result < 0) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Please enter number >= 0");
                System.out.print("Enter again: ");
            }

        }
    }

    public int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(checkInputString());
                if (result <= 0) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Please enter number > 0");
                System.out.print("Enter again: ");
            }
        }
    }
    public int checkIdExist(ArrayList<Student> ls, String code){

        for (int i = 0; i < ls.size(); i++) {
            if (code.equals(ls.get(i).getId())){
                return i;
            }
        }
        return -1;
    }
}
