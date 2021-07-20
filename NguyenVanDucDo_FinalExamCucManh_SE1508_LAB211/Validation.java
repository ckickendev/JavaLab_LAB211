package JavaLabCucManh.NguyenVanDucDo_FinalExamCucManh_SE1508_LAB211;

import java.util.ArrayList;
import java.util.Scanner;

public class Validation {
    Scanner scanner = new Scanner(System.in);
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

    public float checkInputFloat(){
        while (true){
            try{
                String result = checkInputString();
                return Float.parseFloat((result));
            }catch (NumberFormatException ex) {
                System.out.println("Please input number !");
            }
        }
    }

    public String checkPhone(){
        while (true){
            System.out.print("Phone number: ");
            String result = checkInputString();
            if (!result.matches(("\\d{1,11}"))){
                System.out.println("Phone number must is number !");
            }else {
                if(result.length() != 10) {
                    System.out.println("Phone number must be 10 digits !");
                }else {
                    return result;
                }
            }

        }
    }

    public String checkEmail(){
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

    public String checkYear(){
        while(true){
            int result = checkInputInteger();
            if (result<1000 && result>9999){
                System.out.println("Length is 4 character, input again");
            }else if(result < 1900 || result > 2021) {
                System.out.println("Year must in range (1900 - current year )");
            }else {
                return String.valueOf(result);
            }
        }
    }

    public String checkIdExit(ArrayList<Employee> employees){
        boolean flag;
        do{
            flag = false;
            String result = checkInputString();
            for(var x: employees){
                if(x.getId().compareToIgnoreCase(result)==0){
                    System.out.println("ID exist, please check again!");
                    flag = true;
                }
            }
            if(!flag) {
                return result;
            }
        }while (true);
    }

    public boolean checkInputYN(){
        while (true){
            String result = checkInputString();
            if(result.equalsIgnoreCase("Y")){
                return true;
            }else if(result.equalsIgnoreCase("N")){
                return false;
            }else {
                System.out.println("You must be type Yes(Y) or No(N)");
            }
        }
    }
}
