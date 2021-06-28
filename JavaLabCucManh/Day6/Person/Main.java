package JavaLabCucManh.Day6.Person;

public class Main {
    public static void main(String[] args) {
        Validation val = new Validation();
        Menu m = new Menu();
        PersonList pl = new PersonList();
        int choice;
        do {
            choice = m.menu();
            switch (choice) {
                case 1 -> {
                    pl.inputPerson();
                    break;
                }
                case 2 -> {
                    pl.displaySortedPerson();
                    break;
                }
            }
        }while (choice!=3);
    }
}
