package JavaLabCucManh.Day3.Homework_FS.Model;

import java.util.ArrayList;
import java.util.HashMap;

public class BuyerManagement {
    FruitManagement fruitManagement ;

    public BuyerManagement() {
    }

    public BuyerManagement(FruitManagement fruitManagement) {
        this.fruitManagement = fruitManagement;
    }
    public static HashMap<String, ArrayList> listBuyer = new HashMap<>();


    Validation validation = new Validation();
    public void muaSamNaoCacBanOi(){
        ArrayList<Fruit> fruitsMenu = fruitManagement.getFruits();
        ArrayList<Fruit> fruits = new ArrayList<>();
        boolean continueKhong;
        do {
            System.out.println();
            displayFruit();
            System.out.print("Select items di em, follow item row: ");
            int items = validation.checkInputIntLimit(1, fruitManagement.getFruits().size() + 1);
            System.out.println("You selected: " + fruitsMenu.get(items - 1).getFruitName());
            System.out.print("Please input quantity: ");
            int quantityBuy = validation.checkInputIntLimit(1, fruitsMenu.get(items - 1).getQuantity());
            Fruit fruit = new Fruit(fruitsMenu.get(items - 1).getFruitID(), fruitsMenu.get(items - 1).getFruitName(),
                    fruitsMenu.get(items - 1).getPrice(), quantityBuy, fruitsMenu.get(items - 1).getOrigin());
            fruitManagement.getFruits().get(items - 1).setQuantity(fruitManagement.getFruits().get(items - 1).getQuantity() - quantityBuy);
            fruits.add(fruit);
            System.out.print("Do you want to order now (Y/N): ");
            continueKhong = validation.checkInputYN();
        }while (!continueKhong);

        displayListOrder(fruits);
        System.out.print("Input your name: ");
        String customer = validation.checkInputString();
        listBuyer.put(customer, fruits);
    }

    public static void displayListOrder(ArrayList<Fruit> fruitsOrder){
        System.out.println("Product | Quantity | Price | Amount");
        double price = 0;
        double subPrice =0;
        for (var x: fruitsOrder){
            System.out.print("    "+x.getFruitName()+"    ");
            System.out.print("    "+x.getQuantity()+"    ");
            System.out.print("    "+x.getPrice()+"$    ");
            subPrice = x.getQuantity()*x.getPrice();
            price += subPrice;
            System.out.println("    "+subPrice+"$    ");
        }
        System.out.println("Total: "+ price+"$");
    }


    public void displayFruit(){
        System.out.println("List of Fruit: ");
        System.out.println("| ++ Items ++ | ++ Fruit Name ++ | ++ Origin ++ | ++ Price ++ | ");
        for(var x:fruitManagement.getFruits()){
            System.out.print("       "+ (fruitManagement.getFruits().indexOf(x)+1)+"       ");
            System.out.print("       "+x.getFruitName()+"       ");
            System.out.print("       "+x.getOrigin()+"        ");
            System.out.print("       "+x.getPrice()+"$       ");
            System.out.println();
        }
    }

    public HashMap<String, ArrayList> getListBuyer() {
        return listBuyer;
    }

    public void setListBuyer(HashMap<String, ArrayList> listBuyer) {
        this.listBuyer = listBuyer;
    }
}
