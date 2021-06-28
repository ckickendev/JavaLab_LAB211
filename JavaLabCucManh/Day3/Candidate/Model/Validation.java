package JavaLabCucManh.Day3.Candidate.Model;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

    public int checkInputInt(){
        while (true){
            String result = checkInputString();
            if(Integer.parseInt(result)>0){
                return Integer.parseInt(result);
            }else {
                System.out.println("Invalid\n Please check again");
            }
        }
    }

    public double checkInputDouble(){
        while (true){
            String result = checkInputString();
            if(Double.parseDouble(result)>0.00){
                return Double.parseDouble((result));
            }else {
                System.out.println("Invalid value\n Please check again");
            }
        }
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
    public String checkInputGrandRank(){
        while(true){
            String result = checkInputString();
            if(result.equalsIgnoreCase("Excellence")){
                return "Excellence";
            }else if(result.equalsIgnoreCase("Good")){
                return "Good";
            }else if(result.equalsIgnoreCase("Fair")){
                return "Fair";
            }else if(result.equalsIgnoreCase("Poor")){
                return "Poor";
            }else {
                System.out.println("You must be type one of these: (Excellence),(Good),(Fair),(Poor) !!!");
            }
        }
    }

    public String checkIdExit(ArrayList<Candidate> candidates){
        boolean flag;
        do{
            flag = false;
            String result = checkInputString();
            for(var x: candidates){
                if(x.getCandidateId().compareToIgnoreCase(result)==0){
                    System.out.println("ID exist, please check again!");
                    flag = true;
                }
            }
            if(!flag) {
                return result;
            }
        }while (true);
    }

    public int[] checkIdExist(ArrayList<Candidate> candidates, String name, int type){
        int[] result = {100,100,100,100,100,100,100,100,100,100};
        int i=0;
        for(var x: candidates){
            if(x.getLastName().contains(name) || x.getFirstName().contains(name) ){
                if (x.getCandidateType() == type) {
                    result[i] = candidates.indexOf(x);
                    i++;
                }
            }
        }
        return result;
    }

    public Date checkInputDate(){
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
        String result = checkInputString();
        Date date = new Date();
        try{
            date = formater.parse(result);
        }catch (ParseException e){
            System.err.println("Please input in format (dd/MM/yyyy)");
            System.out.print("Enter again: ");
            checkInputDate();
        }
        return date;
    }

    public int checkBirthDay(){
        while (true){
            int result = checkInputIntLimit(1900, 2021);
            return result;
        }
    }

    public String checkPhone(){
        while(true){
            String phone = checkInputString();
            if(phone.length()<10) {
                System.out.println("Please check again, length of phone must more than 10 !!! ");
            } else {
                return phone;
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


}
