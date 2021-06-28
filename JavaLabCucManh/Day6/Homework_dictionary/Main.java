package JavaLabCucManh.Day6.Homework_dictionary;

public class Main {
    Validation validation = new Validation();
    public int option(){
        System.out.println("======== Dictionary program ========");
        System.out.println("1. Add Word\n" +
                "2. Delete Word\n" +
                "3. Translate\n" +
                "4. Exit");
        System.out.print("Enter your choice: ");
        return validation.checkInputIntLimit(1,4);
    }
}
