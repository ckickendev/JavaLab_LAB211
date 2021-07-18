package JavaLabCucManh.Day6.Worker;

import java.util.ArrayList;
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


    public double checkInputDouble(){
        while (true){
            String result = checkInputString();
            if (!result.matches(("^[-+]?\\d+(\\.{0,1}(\\d+?))?$")) || result=="0"){
                System.out.println("Please input number and greater than 0");
            }else{
                return Double.parseDouble((result));
            }
        }
    }

    public Integer checkInputInteger(){
        while (true){
            String regex = "\"^[-+]?\\\\d+(\\{0,1}(\\\\d+?))?$\"";
            String result = checkInputString();
            if (result.matches(regex) || Integer.parseInt(result) <= 0 ){
                System.out.println("Please input number and greater than 0");
            }else{
                return Integer.parseInt((result));
            }
        }
    }

    public int checkAge(){
        while (true){
            int result = checkInputInteger();
            if(result < 18 || result > 50){
                System.out.println("Your age wrong, must be in range: " + "18" + " and " + "50" + " !!!" );
            } else {
                return result;
            }
        }
    }

    public String checkCode(ArrayList<Worker> workers){
        boolean flag;
        do{
            flag = false;
            String result;
            try{
                result = checkInputString();
                for(var x: workers){
                    if(x.getCode().compareToIgnoreCase(result)==0){
                        System.out.println("Code exist, please check again!");
                        flag = true;
                    }
                }
                if(!flag) {
                    return result;
                }
            }catch(NullPointerException ex) {
                System.out.println("Code cannot null ");
            }

        }while (true);
    }
    public int checkCodeExist(String code, ArrayList<Worker> workers){
        for(var x: workers){
            if(x.getCode().compareToIgnoreCase(code)==0){
                return workers.indexOf(x);
            }
        }
        return -1;
    }

}
