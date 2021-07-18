package JavaLabCucManh.Day8.Matrix_cucmanh;

import java.util.Scanner;

public class Validation {
    private Scanner scanner = new Scanner(System.in);

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
                if(result != "0") {
                    return Integer.parseInt((result));
                }else {
                    System.out.println("Please input number more than 0");
                }
            }catch (NumberFormatException ex){
                System.out.println("Please input number and ");
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
}
