package JavaLabCucManh.Day3.Homework_FS.Model;

import JavaLabCucManh.Day3.Homework_FS.Model.BuyerManagement;

import java.util.ArrayList;
import java.util.HashMap;

public class OrdersManagement {
    public OrdersManagement() {
    }
    HashMap<String, ArrayList> listCustomers = BuyerManagement.listBuyer;
    public void viewOrders(){
        listCustomers.forEach((k,v) ->{
            System.out.println("Customer: " + k);
            BuyerManagement.displayListOrder(v);
            System.out.println();
        });
    }
}
