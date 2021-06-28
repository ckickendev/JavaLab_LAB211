package JavaLabCucManh.Day5.BaiSo3;

public class Main {
    Validation validation = new Validation();
    public int option(){
        System.out.println("========= Contact program =========\n" +
                "1. Add a Contact\n" +
                "2. Display all Contact\n" +
                "3. Delete a Contact\n" +
                "4. Exit");
        System.out.print("Enter your choice here: ");
        return validation.checkInputIntLimit(1,4);
    }
}
