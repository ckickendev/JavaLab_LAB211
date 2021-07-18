package JavaLabCucManh.Day6.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PersonList {
    public PersonList() {
    }

    public ArrayList<Person> personList = new ArrayList<>();
    Validation val = new Validation();
    public Scanner in = new Scanner(System.in);

    public void inputPerson() {
        int count = 0;
        while (true) {
            System.out.println("=====Management Person programer=====");
            System.out.println("Input Information of Person");
            System.out.print("Please input name: ");
            String name = val.checkInputString();
            System.out.print("Please input address: ");
            String address = val.checkInputString();
            System.out.print("Please input salary: ");
            double salary = val.checkInputDouble();
            personList.add(new Person(name, address, salary));
            System.out.println("Success!");
            count++;
            if (count >= 3) {
                if (!val.checkInputYN()) {
                    break;
                }
            }
        }
    }


    public void displaySortedPerson() {
        System.out.println("Information of Person you have entered:");
        int length = 0;
        for (Person x : personList) {
            length++;
        }
        Collections.sort(personList);
        System.out.println("");
        for (int i = 0; i < length; i++) {
            System.out.println("Name: " + personList.get(i).getName());
            System.out.println("Address: " + personList.get(i).getAddress());
            System.out.println("Salary: " + personList.get(i).getSalary());
            System.out.println("");
        }
        length = 0;
    }
}
