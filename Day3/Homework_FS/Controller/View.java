package JavaLabCucManh.Day3.Homework_FS.Controller;

import JavaLabCucManh.Day3.Homework_FS.Model.BuyerManagement;
import JavaLabCucManh.Day3.Homework_FS.Model.FruitManagement;
import JavaLabCucManh.Day3.Homework_FS.View.Menu;
import JavaLabCucManh.Day3.Homework_FS.Model.OrdersManagement;

public class View {
    public static void main(String[] args) {
        Menu menu = new Menu();
        FruitManagement fruitManagement = new FruitManagement();
        OrdersManagement ordersManagement = new OrdersManagement();
        BuyerManagement buyerManagement = new BuyerManagement(fruitManagement);
        int choice;
        do {
            choice = menu.mainMenu();
            switch (choice){
                case 1:{
                    fruitManagement.addFruit();
                    break;
                }
                case 2:{
                    ordersManagement.viewOrders();
                    System.out.println();
                    break;
                }
                case 3:{
                    buyerManagement.muaSamNaoCacBanOi();
                    System.out.println();
                    break;
                }
            }
        }while (choice!=4);
    }
}
