package JavaLabCucManh.NguyenVanDucDo_FinalExamCucManh_SE1508_LAB211;

public class Menu {
    Validation validation = new Validation();
    public int option(){
        System.out.println("WELCOME TO EMPLOYEE MANAGEMENT");
        System.out.println("1: Create employee");
        System.out.println("2: View all employee information");
        System.out.println("3: View the employee's information has the highest total salary");
        System.out.println("4: Exit");
        System.out.print("Please enter your choice: ");
        return validation.checkInputIntLimit(1,4);
    }
}
