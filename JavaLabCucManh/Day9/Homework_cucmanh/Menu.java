package JavaLabCucManh.Day9.Homework_cucmanh;

public class Menu {
    public int option(){
        Validation validation = new Validation();
        System.out.println("======= Format CSV Program =======");
        System.out.println("1. Import CSV");
        System.out.println("2. Format Address");
        System.out.println("3. Format Name");
        System.out.println("4. Export CSV");
        System.out.println("5. Exit");
        System.out.print("Please choice one option:");
        return validation.checkInputIntLimit(1,5);
    }
}
