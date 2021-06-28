package JavaLabCucManh.Day5.BaiSo3;

public class View {
    public static void main(String[] args) {
        ContactManagement contactManagement = new ContactManagement();
        Main main = new Main();
        int choice ;
        do{
            choice = main.option();
            switch (choice){
                case 1:{
                    contactManagement.addContact();
                    break;
                }
                case 2:{
                    contactManagement.displayContact();
                    break;
                }
                case 3:{
                    contactManagement.delete();
                    break;
                }
            }
        }while (choice!=4);
    }
}
