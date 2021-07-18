package JavaLabCucManh.Day9.Homework_cucmanh;

import java.util.ArrayList;

public class View {
    public static void main(String[] args) {
        int choice;
        Menu menu = new Menu();
        CSVController csvController = new CSVController();

        ArrayList<CSV> ls = new ArrayList<>();
        ls.add(new CSV(1, "Nguyen Van DUc   DO ", "docute@gmail.com", "01282189812", "Nam DOng   - THua Thien  Hue -    Viet Nam"));
        ls.add(new CSV(2, "NGuyen TrUNg   DuNg   ", "dungcute@gmail.com", "12877812", "QUang TracH - QUANG BinH   -   Viet Nam"));
        ls.add(new CSV(3, "Tran THI Thu HOai      	", "hoaucyte@gmail.com", "12717821", "Hoa KhANH     - DA   NANG    - Viet Nam  "));
        do{
            choice = menu.option();
            switch (choice){
                case 1:{
                    csvController.importFile(ls);
                    csvController.print(ls);
                    break;
                }
                case 2:{
                    csvController.formatAddress(ls);
                    csvController.print(ls);
                    break;
                }
                case 3:{
                    csvController.formatName(ls);
                    csvController.print(ls);
                    break;
                }
                case 4:{
                    csvController.exportFile(ls);
                    break;
                }
            }
        }while (choice!=5);
    }
}
