package JavaLabCucManh.Day3.Homework_FS.View;

import JavaLabCucManh.Day3.Homework_FS.Model.Validation;

public class Menu {
    Validation validation = new Validation();
    public int mainMenu(){
        System.out.println("FRUIT SHOP SYSTEM");
        System.out.println("1. Create Fruit");
        System.out.println("2. View orders");
        System.out.println("3. Shopping (for buyer)");
        System.out.println("4. Exit");
        return validation.checkInputIntLimit(1,4);
    }
}
