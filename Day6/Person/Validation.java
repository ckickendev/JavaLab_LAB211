package JavaLabCucManh.Day6.Person;

import java.util.Scanner;

public class Validation {
    public Scanner in = new Scanner(System.in);

    public int checkInputIntLimit(int min, int max){
        while(true){
            int result = checkInputInteger();
            if(result<min || result>max){
                System.out.println("Your input wrong, must be in range: " + min + " and " + max + " !!!" );
            } else {
                return result;
            }
        }
    }

    public String checkInputString() {
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    public Integer checkInputInteger(){
        while (true){
            try {
                String result = checkInputString();
                return Integer.parseInt((result));
            }catch (NumberFormatException ex){
                System.out.println("Please input number");
            }
        }
    }

    public double checkInputDouble(){
        while (true){
            try{
                String result = checkInputString();
                return Double.parseDouble((result));
            }catch (NumberFormatException ex) {
                System.out.println("Please input number");
            }
        }
    }

    public boolean checkInputYN() {
        System.out.print("Do you want to continue (Y/N)? ");
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }
            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }

    public double checkInputSalary() {
        while (true) {
            try {
                double result = Double.parseDouble(in.nextLine());
                if (result < 0) {
                    System.err.println("Salary is greater than zero");
                } else {
                    return result;
                }
            } catch (NumberFormatException ex) {
                System.err.println("You must input number.");
                System.out.print("Please input salary: ");
            }
        }
    }
}
