package JavaLabCucManh.Day5.BaiSo3;

import java.util.ArrayList;

public class ContactManagement {
    Validation validation = new Validation();
    ArrayList<Contact> contacts = new ArrayList<>();
    public void addContact(){
        System.out.println("-------- Add a Contact --------");
        System.out.print("Enter First Name: ");
        String firstname = validation.checkInputString();
        System.out.print("Enter Last Name: ");
        String lastname = validation.checkInputString();
        System.out.print("Enter Group: ");
        String group = validation.checkInputString();
        System.out.print("Enter Address: ");
        String address = validation.checkInputString();
        System.out.print("Enter Phone: ");
        String phone = validation.checkInputPhone();
        Contact contact = new Contact(Contact.ID, group, phone, lastname, firstname, address);
        contacts.add(contact);
        Contact.ID++;
        System.out.println("Successful");
    }

    public void displayContact(){
        System.out.println("--------------------------------- Display all Contact ----------------------------");
        System.out.printf("%-5s%-25s%-20s%-20s%-20s%-20s%-20s\n",
                "Id", "Name","First name","Last name", "Group", "Address", "Phone");
        for(var x: contacts){
            System.out.printf("%-5s%-25s%-20s%-20s%-20s%-20s%-20s\n",
                    x.getId(), x.getFullName(), x.getFirstName(), x.getLastName(), x.getGroup(), x.getAddress(), x.getPhone());
        }
    }

    public void delete(){
        System.out.println("------- Delete a Contact -------");
        System.out.print("Enter ID: ");
        int deleteCheck = validation.checkInputInteger();
        int index = -1;
        for(var x: contacts){
            if(x.getId() == deleteCheck){
                index = contacts.indexOf(x);
            }
        }
        if(index == -1){
            System.out.println("Cannot find id because it's not exist");
        }else {
            contacts.remove(index);
            System.out.println("Successful");
        }
    }
}
