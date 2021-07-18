package JavaLabCucManh.Day9.Homework_cucmanh;

import java.util.Scanner;

public class Validation {
    Scanner scanner = new Scanner(System.in);
    public int checkInputIntLimit(int min, int max){
        while(true){
            int result = Integer.parseInt(scanner.nextLine().trim());
            if(result<min || result>max){
                System.out.println("Your input wrong, must be in range: " + min + " and " + max + " !!!" );
            } else {
                return result;
            }
        }
    }

    public String checkInputString(){
        while (true){
            try{
                String result = scanner.nextLine();
                if(!result.isEmpty()){
                    return result;
                }else {
                    System.out.println("Your input must be not null");
                    System.out.println("Please input again");
                }
            }catch (NullPointerException ex){
                System.out.println("Cannot null");
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

    public String checkPhone(){
        while (true){
            System.out.print("Phone number: ");
            String result = checkInputString();
            if (!result.matches(("\\d{1,11}"))){
                System.out.println("Phone number must is number");
            }else {
                if(result.length() != 10) {
                    System.out.println("Phone number must be 10 digits");
                }else {
                    return result;
                }
            }

        }
    }

    public String checkEmail(){
        System.out.print("Email: ");
        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        while (true){
            String result = checkInputString();
            if(result.matches(regex)){
                return result;
            }else {
                System.out.println("Email not valid, please check again !!! ");
            }
        }
    }

    public String checkDate(){
        System.out.print("Date: ");
        String regex = "^\\d{2}/\\d{2}/\\d{4}$";
        while (true){
            String result = checkInputString();
            if(result.matches(regex)){
                return result;
            }else {
                System.out.println("Date to correct format(dd/mm/yyyy)");
            }
        }
    }
}
