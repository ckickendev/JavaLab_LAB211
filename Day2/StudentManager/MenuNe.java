package JavaLabCucManh.Day2.StudentManager;

public class MenuNe {
    Validation validation = new Validation();

    public int menuChoice(){
        System.out.println("WELCOME TO STUDENT MANAGEMENT ");
        System.out.println("1: Create.");
        System.out.println("2: Find and sort.");
        System.out.println("3: Update/Delete.");
        System.out.println("4: Report.");
        System.out.println("5: Exit");
        System.out.println("(Please choose 1 to Create, 2 to Find and Sort, " +
                "3 to Update/Delete, 4 to Report and 5 to Exit program).");
        int choice = validation.checkInputIntLimit(1,5);
        return choice;
    }

    public int choice3(){
        System.out.print("Do you want to choose update(1) or delete(2): ");
        int choice = validation.checkInputIntLimit(1,2);
        return choice;
    }
}
