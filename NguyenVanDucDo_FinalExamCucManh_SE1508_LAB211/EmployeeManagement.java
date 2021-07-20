package JavaLabCucManh.NguyenVanDucDo_FinalExamCucManh_SE1508_LAB211;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class EmployeeManagement {
    Validation validation = new Validation();
    ArrayList<Employee> employees = new ArrayList<>();

    public void createEmployee(){
        do{
            System.out.print("Choose 1 to create Manager, 2 to create Staff: ");
            int type = validation.checkInputIntLimit(1,2);
            switch (type){
                case 1:{
                    do {
                        System.out.print("Enter employee ID: ");
                        String id = validation.checkIdExit(employees);
                        System.out.print("Enter employee name: ");
                        String name = validation.checkInputString();
                        System.out.print("Enter employee birth year: ");
                        String year = validation.checkYear();
                        System.out.print("Enter employee email: ");
                        String email = validation.checkEmail();
                        System.out.print("Enter employee coefficients salary: ");
                        float coSalary = validation.checkInputFloat();
                        System.out.print("Enter employee position coefficient: ");
                        float poCo = validation.checkInputFloat();
                        Manager manager = new Manager(id, name, year, email, coSalary, 1, poCo );
                        employees.add(manager);
                        System.out.println("Do you want to continue creating manager: (Y/N) ?");
                    } while (validation.checkInputYN());
                    break;
                }
                case 2:{

                    do {
                        System.out.print("Enter employee ID: ");
                        String id = validation.checkIdExit(employees);
                        System.out.print("Enter employee name: ");
                        String name = validation.checkInputString();
                        System.out.print("Enter employee birth year: ");
                        String year = validation.checkYear();
                        System.out.print("Enter employee email: ");
                        String email = validation.checkEmail();
                        System.out.print("Enter employee coefficients salary: ");
                        float coSalary = validation.checkInputFloat();
                        System.out.print("Enter employee department: ");
                        String department = validation.checkInputString();
                        Staff staff = new Staff(id, name, year, email, coSalary, 2, department);
                        employees.add(staff);
                        System.out.println("Do you want to continue creating staff: (Y/N) ?");
                    }while(validation.checkInputYN());
                    break;
                }
            }
        }while (false);
    }

    public void showInfo(){
        System.out.println("===========MANAGER===========");
        for( var x: employees){
            if (x.getEmployType() == 1) {
                System.out.printf("%-7s%-20s%-10s%-20s%-10s%-10s",
                        x.getId(), x.getName(), x.getBirth(), x.getEmail(), x.getCoefficientSalary(), ((Manager) x).getPositionCoefficient() );
                System.out.println();
            }
        }
        System.out.println("===========STAFF===============");
        for (var x: employees){
            if (x.getEmployType() == 2) {
                System.out.printf("%-7s%-20s%-10s%-20s%-10s%-10s",
                        x.getId(), x.getName(), x.getBirth(), x.getEmail(), x.getCoefficientSalary(), ((Staff) x).getDepartment() );
                System.out.println();
            }

        }
    }

    public void CountSalary(){
        HashMap<String, Float> listSalary = new HashMap<>();
        float[] arrayTotal = new float[employees.size()];
        int count = 0;
        for (var x: employees){
            if(x.getEmployType() == 1){
                float total = (x.getCoefficientSalary() + ((Manager) x).getPositionCoefficient() ) * 1650000;
                listSalary.put(x.getId(), total);
                arrayTotal[count] = total;
            }
            if(x.getEmployType() == 2){
                float total = (x.getCoefficientSalary()) * 1650000;
                listSalary.put(x.getId(), total);
                arrayTotal[count] = total;
            }
            count++;
        }
        float maxTotal = arrayTotal[0];
        for (int i = 0 ; i<arrayTotal.length; i++){
            if(maxTotal < arrayTotal[i]){
                maxTotal = arrayTotal[i];
            }
        }
        Set<String> keySet = listSalary.keySet();
        System.out.println("The highest salary persons: ");
        for (String key : keySet) {
            if(listSalary.get(key) == maxTotal){
                for (var x: employees){
                    if(x.getId() == key){
                        if(x.getEmployType() == 1) {
                            System.out.printf("%-7s%-20s%-10s%-20s%-10s%-10s%-10s",
                                    x.getId(), x.getName(), x.getBirth(), x.getEmail(), x.getCoefficientSalary(), ((Manager) x).getPositionCoefficient(), listSalary.get(key));
                            System.out.println();
                        }
                        if(x.getEmployType() == 2) {
                            System.out.printf("%-7s%-20s%-10s%-20s%-10s%-10s%-10s",
                                    x.getId(), x.getName(), x.getBirth(), x.getEmail(), x.getCoefficientSalary(), ((Staff) x).getDepartment(), listSalary.get(key));
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
}
