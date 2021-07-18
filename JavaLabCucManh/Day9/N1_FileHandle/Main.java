package JavaLabCucManh.Day9.N1_FileHandle;

public class Main {
    Validation validation = new Validation();
    public int option(){
        System.out.println("--------------File processing---------------");
        System.out.println("1. Check Path");
        System.out.println("2. Get file name with type java");
        System.out.println("3. Get file with size greater than input");
        System.out.println("4. Write more content to file");
        System.out.println("5. Read file and count characters");
        System.out.println("6. Exit");
        System.out.print("Please choice one option: ");
        int choice = validation.checkInputIntLimit(1,6);
        return choice;
    }
}
