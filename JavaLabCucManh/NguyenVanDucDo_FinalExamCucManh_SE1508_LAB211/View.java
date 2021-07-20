package JavaLabCucManh.NguyenVanDucDo_FinalExamCucManh_SE1508_LAB211;

public class View {
    public static void main(String[] args) {
        Menu menu = new Menu();
        EmployeeManagement employeeManagement = new EmployeeManagement();
        int choice;
        do {
            choice = menu.option();
            switch (choice){
                case 1:{
                    employeeManagement.createEmployee();
                    break;
                }
                case 2:{
                    employeeManagement.showInfo();
                    break;
                }
                case 3:{
                    employeeManagement.CountSalary();
                    break;
                }
            }
        }while (choice != 4);
    }
}
