package JavaLabCucManh.Day6.Worker;

public class Menu {
    Validation validation = new Validation();
    public int option(){
        System.out.println("======== Worker Management =========\n" +
                "1. Add Worker\n" +
                "2. Up salary\n" +
                "3. Down salary\n" +
                "4. Display Information salary\n" +
                "5. Exit");
        System.out.print("Enter your choice: ");
        return validation.checkInputIntLimit(1,5);
    }
}
