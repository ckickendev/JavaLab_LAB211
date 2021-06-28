package JavaLabCucManh.Day6.Homework_dictionary;

public class View {
    public static void main(String[] args) {
        Main menu = new Main();
        ManagementDictionary managementDictionary = new ManagementDictionary();
        int option;
        do{
            option = menu.option();
            switch (option){
                case 1:{
                    managementDictionary.addWord();
                    break;
                }
                case 2:{
                    managementDictionary.deleteWord();
                    break;
                }
                case 3:{
                    managementDictionary.searchWord();
                    break;
                }
            }
        }while (option!=4);
    }
}
