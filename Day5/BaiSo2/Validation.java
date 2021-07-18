package JavaLabCucManh.Day5.BaiSo2;

import java.util.Scanner;

public class Validation {
    public final Scanner scanner = new Scanner(System.in);

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
            String result = scanner.nextLine();
            if(!result.isEmpty()){
                return result;
            }else {
                System.out.println("Your input must be not null");
                System.out.println("Please input again");
            }
        }
    }

    public String checkOpe(){
        while (true){
            String result = checkInputString();
            if(result.compareToIgnoreCase("+") == 0 || result.compareToIgnoreCase("-") == 0  ||
                    result.compareToIgnoreCase("/") == 0 || result.compareToIgnoreCase("*") == 0  ||
                    result.compareToIgnoreCase("^") == 0 || result.compareToIgnoreCase("=") == 0 ){
                return result;
            }
            else {
                System.out.println("Please input (+, -, *, /, ^, =)");
            }
        }
    }

    public double checkInputDouble(){
        while (true){
            String result = checkInputString();
            if (!result.matches(("^[-+]?\\d+(\\.{0,1}(\\d+?))?$")) || result=="0"){
                System.out.println("Please input number");
            }else{
                return Double.parseDouble((result));
            }
        }
    }

    public double checkInputBMI(){
        while (true){
            String result = checkInputString();
            if (!result.matches(("^[-+]?\\d+(\\.{0,1}(\\d+?))?$")) || result=="0"){
                System.out.println("BMI is digit");
            }else{
                return Double.parseDouble((result));
            }
        }
    }

    public Integer checkInputInteger(){
        while (true){
            String regex = "\"^[-+]?\\\\d+(\\{0,1}(\\\\d+?))?$\"";
            String result = checkInputString();
            if (result.matches(regex)){
                System.out.println("Please input number");
            }else{
                return Integer.parseInt((result));
            }
        }
    }
}
