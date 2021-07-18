package JavaLabCucManh.Day3.Homework_FS.Model;

import JavaLabCucManh.Day3.Homework_FS.Model.Fruit;
import JavaLabCucManh.Day3.Homework_FS.Model.Validation;

import java.util.ArrayList;

public class FruitManagement {
    ArrayList<Fruit> fruits = new ArrayList<>();
    Validation validation = new Validation();
    public void addFruit(){
        boolean continues;
        do{
            System.out.println("Add Fruit: ");
            System.out.print("Input fruit ID: ");
            String id = validation.checkIdExit(fruits);
            System.out.print("Input fruit name: ");
            String name = validation.checkInputString();
            System.out.print("Input price: ");
            double price = validation.checkInputDouble();
            System.out.print("Input quantity: ");
            int qtt = validation.checkInputInt();
            System.out.print("Input origin: ");
            String origin = validation.checkInputString();
            Fruit fruit = new Fruit(id, name, price, qtt, origin);
            fruits.add(fruit);
            System.out.println("Success!!!");
            System.out.println();
            displayFruit();
            System.out.print("Do you want to continues (Y/N): ");
            continues = validation.checkInputYN();
        }while(continues);
    }

    public void displayFruit(){
        System.out.println("List of Fruit: ");
        System.out.println("| ++ Fruit ID ++ | ++ Fruit Name ++ | ++ Origin ++ | ++ Price ++ | ");
        for(var x:fruits){
            System.out.print("         "+ x.getFruitID()+"        ");
            System.out.print("        "+x.getFruitName()+"        ");
            System.out.print("        "+x.getOrigin()+"        ");
            System.out.print("        "+x.getPrice()+"$      ");
            System.out.println();
        }
    }

    public ArrayList<Fruit> getFruits() {
        return fruits;
    }

    public void setFruits(ArrayList<Fruit> fruits) {
        this.fruits = fruits;
    }

}
