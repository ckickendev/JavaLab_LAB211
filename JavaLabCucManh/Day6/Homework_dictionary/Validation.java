package JavaLabCucManh.Day6.Homework_dictionary;

import java.util.ArrayList;
import java.util.Scanner;

public class Validation {
    public final Scanner scanner = new Scanner(System.in);

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
            String result = scanner.nextLine();
            if(!result.isEmpty()){
                return result;
            }else {
                System.out.println("Your input must be not null");
                System.out.println("Please input again");
            }
        }
    }

    public String checkUpdate(){
        String result = scanner.nextLine();
        return result;
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
            try{
                String result = checkInputString();
                return Double.parseDouble((result));
            }catch (NumberFormatException ex) {
                System.out.println("Please input number");
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

    public int checkExistMean(String eMean, ArrayList<Dictionary> dictionaries){
        int index = -1;
        for (var x:dictionaries){
            if(x.getEnglishMean().toLowerCase().compareToIgnoreCase(eMean.toLowerCase())==0){
                index = dictionaries.indexOf(x);
            }
        }
        return index;
    }
}
