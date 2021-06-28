package JavaLabCucManh.Day5.HomeWorkCucManh;

public class Menu {
    Validation validation = new Validation();
    public int option(){
        System.out.println("========= Doctor Management ==========");
        System.out.println("1. Add Doctor\n" +
                "2. Update Doctor\n" +
                "3. Delete Doctor\n" +
                "4. Search Doctor\n" +
                "5. Exit");
        System.out.print("Enter option: ");
        return validation.checkInputIntLimit(1,5);
    }
}
