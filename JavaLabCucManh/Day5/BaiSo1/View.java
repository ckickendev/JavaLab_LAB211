package JavaLabCucManh.Day5.BaiSo1;

import JavaLabCucManh.Day5.BaiSo1.ManageEastAsiaCountries;
import JavaLabCucManh.Day5.BaiSo1.Menu;

public class View {
    public static void main(String[] args) {
        ManageEastAsiaCountries manageEastAsiaCountries = new ManageEastAsiaCountries();
        Menu menu = new Menu();
        int choice;
        do{
            choice = menu.displayMenu();
            switch (choice){
                case 1:{
                    manageEastAsiaCountries.inputCountry();
                    break;
                }
                case 2:{
                    manageEastAsiaCountries.displayJustInput();
                    break;
                }
                case 3:{
                    manageEastAsiaCountries.searchCountry();
                    break;
                }
                case 4:{
                    manageEastAsiaCountries.sortAndDisplay();
                    break;
                }
            }
        }while (choice != 5);

    }
}
