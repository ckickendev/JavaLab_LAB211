package JavaLabCucManh.Day5.BaiSo3;

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

    public String checkInputPhone(){
        String regex = "\\d{3}-\\d{3}-\\d{4}";
        String regex1 = "\\d{3}.\\d{3}.\\d{4}";
        String regex2 = "\\d{3} \\d{3} \\d{4}";
        String regex3 = "\\d{3}\\d{3}\\d{4}";
        while (true){
            String result = checkInputString();
            if(result.matches(regex) || result.matches(regex1) || result.matches(regex2) || result.matches(regex3)){
                return result;
            }else{
                System.out.println("Please input Phone flow");
                System.out.println("• 1234567890");
                System.out.println("• 123-456-7890");
                System.out.println("• 123-456-7890 x1234");
                System.out.println("• 123-456-7890 ext1234");
                System.out.println("• 123.456.7890");
                System.out.println("• 123 456 7890");
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
