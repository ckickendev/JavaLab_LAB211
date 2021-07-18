package JavaLabCucManh.Day6.Worker;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class WorkerManagement {
    ArrayList<Worker> workers = new ArrayList<>();
    Validation validation = new Validation();
    HashMap<String, String> status = new HashMap<>();
    HashMap<String, String> dateUpdate = new HashMap<>();

    public void addWorker(){
        System.out.println("--------- Add Worker ----------");
        System.out.print("Enter Code: ");
        String code = validation.checkCode(workers);
        System.out.print("Enter Name: ");
        String name = validation.checkInputString();
        System.out.print("Enter Age: ");
        int age = validation.checkAge();
        System.out.print("Enter Salary: ");
        int salary = validation.checkInputInteger();
        System.out.print("Enter work location: ");
        String workLocation = validation.checkInputString();
        Worker worker = new Worker(code,name, age, salary, workLocation);
        workers.add(worker);
        System.out.println("Success !!! ");
    }

    public void upSalary(){
        System.out.println("------- Up Salary --------");
        System.out.print("Enter Code: ");
        String codeCheck = validation.checkInputString();
        if(validation.checkCodeExist(codeCheck, workers) != -1){
            System.out.print("Enter Salary: ");
            int amount = validation.checkInputInteger();
            int newAmount = workers.get(validation.checkCodeExist(codeCheck, workers)).getSalary()+amount;
            workers.get(validation.checkCodeExist(codeCheck, workers)).setSalary(newAmount);
            status.put(codeCheck, "UP");
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            Date date = new Date();
            dateUpdate.put(codeCheck, dateFormat.format(date));
            System.out.println("Success!");
        }else {
            System.out.println("Cannot update because code is not exist !");
        }
    }

    public void downSalary(){
        System.out.println("------- Down Salary --------");
        System.out.print("Enter Code: ");
        String codeCheck = validation.checkInputString();
        if(validation.checkCodeExist(codeCheck, workers) != -1){
            System.out.print("Enter Salary: ");
            int amount = validation.checkInputInteger();
            if(workers.get(validation.checkCodeExist(codeCheck, workers)).getSalary()-amount < 0){
                System.out.println("Khong the am nha !");
                return;
            }
            int newAmount = workers.get(validation.checkCodeExist(codeCheck, workers)).getSalary()-amount;
            workers.get(validation.checkCodeExist(codeCheck, workers)).setSalary(newAmount);
            status.put(codeCheck, "DOWN");
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            Date date = new Date();
            dateUpdate.put(codeCheck, dateFormat.format(date));
            System.out.println("Success!");
        }else {
            System.out.println("Cannot update because code is not exist !");
        }
    }

    public void display(){
        System.out.println("--------------------Display Information Salary-----------------------");
        System.out.printf("%-7s%-10s%-10s%-10s%-10s%-10s","Code","Name","Age","Salary","Status","Date");
        System.out.println();
        List keys = new ArrayList(status.keySet());
        Collections.sort(keys);
//
//        System.out.println();
//        for (String value : status.keySet()) {
//            System.out.println(value+ "Value = " + status.get(value));
//        }
//        System.out.println();
//        for (String value : dateUpdate.keySet()) {
//            System.out.println(value+ "Value = " + dateUpdate.get(value));
//        }

        for(String key : status.keySet()){
            Worker wokerHere =  workers.get(validation.checkCodeExist(key, workers));
            System.out.printf("%-7s%-10s%-10d%-10d%-10s%-10s",
                    key, wokerHere.getName(),wokerHere.getAge(),wokerHere.getSalary() ,status.get(key), dateUpdate.get(key));
            System.out.println();
        }
    }
}

