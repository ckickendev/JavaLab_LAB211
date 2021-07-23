package DSC.Final_Practical_Exam;

import java.util.ArrayList;

public class MainSort {

    public static void main(String[] args) {
        ascendingInsertion();
        descencingInsertion();
        ascendingSelection();
        descendingSelection();
        ascendingBubble();
        decencingBuble();
    }

    public static ArrayList<Employee> create() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add( new Employee("A05", "Tran Quang", 7));
        employees.add( new Employee("A03", "Nguyen An", 7));
        employees.add( new Employee("A01", "Truong Phung", 5));
        employees.add( new Employee("A04", "Pham Thi Lam", 2));
        employees.add( new Employee("A02", "Do Trung Ton", 5));
        return employees;
    }

    public static void ascendingInsertion(){
        ArrayList<Employee> employees = create();
        System.out.println("Ascending Insertion Sort");
        System.out.println("Before Sort");
        display(employees);
        int n = employees.size();
        for (int i = 1; i < n; ++i) {
            Employee key = employees.get(i);
            int j = i - 1;
            while (j >= 0 && employees.get(j).getId().compareToIgnoreCase(key.getId()) > 0 ) {
                employees.set(j+1, employees.get(j));
                j = j - 1;
            }
            employees.set(j+1, key);
        }
        System.out.println("After Sort");
        display(employees);
        System.out.println("==============================================");
    }

    public static void descencingInsertion(){
        ArrayList<Employee> employees = create();
        System.out.println("Descencing Insertion Sort");
        System.out.println("Before Sort");
        display(employees);
        int n = employees.size();
        for (int i = 1; i < n; ++i) {
            Employee key = employees.get(i);
            int j = i - 1;
            while (j >= 0 && employees.get(j).getId().compareToIgnoreCase(key.getId()) < 0 ) {
                employees.set(j+1, employees.get(j));
                j = j - 1;
            }
            employees.set(j+1, key);
        }
        System.out.println("After Sort");
        display(employees);
        System.out.println("==============================================");

    }

    public static void ascendingSelection(){
        ArrayList<Employee> employees = create();
        System.out.println("Ascencing Insertion Sort");
        System.out.println("Before Sort");
        display(employees);

        int n = employees.size();
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                if (employees.get(j).getId().compareToIgnoreCase(employees.get(min_idx).getId()) < 0) {
                    min_idx = j;
                }
            }
            Employee tmp = employees.get(min_idx);
            employees.set(min_idx, employees.get(i));
            employees.set(i, tmp);
        }

        System.out.println("After Sort");
        display(employees);
        System.out.println("==============================================");

    }

    public static void descendingSelection(){
        ArrayList<Employee> employees = create();
        System.out.println("Descencing Insertion Sort");
        System.out.println("Before Sort");
        display(employees);

        int n = employees.size();
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                if (employees.get(j).getId().compareToIgnoreCase(employees.get(min_idx).getId()) > 0) {
                    min_idx = j;
                }
            }
            Employee tmp = employees.get(min_idx);
            employees.set(min_idx, employees.get(i));
            employees.set(i, tmp);
        }

        System.out.println("After Sort");
        display(employees);
        System.out.println("==============================================");

    }

    public static void ascendingBubble(){
        ArrayList<Employee> employees = create();
        System.out.println("Ascencing Buble Sort");
        System.out.println("Before Sort");
        display(employees);

        int n = employees.size();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (employees.get(j).getId().compareToIgnoreCase(employees.get(j+1).getId()) > 0) {
                    Employee tmp = employees.get(j);
                    employees.set(j, employees.get(j+1));
                    employees.set(j+1, tmp);
                }

        System.out.println("After Sort");
        display(employees);
        System.out.println("==============================================");

    }

    public static void decencingBuble(){
        ArrayList<Employee> employees = create();
        System.out.println("Decencing Buble Sort");
        System.out.println("Before Sort");
        display(employees);

        int n = employees.size();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (employees.get(j).getId().compareToIgnoreCase(employees.get(j+1).getId()) < 0) {
                    Employee tmp = employees.get(j);
                    employees.set(j, employees.get(j+1));
                    employees.set(j+1, tmp);
                }

        System.out.println("After Sort");
        display(employees);
        System.out.println("==============================================");

    }



    public static void display(ArrayList<Employee> employees){
        for (var x: employees){
            System.out.println(x);
        }
    }
}
