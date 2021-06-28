package JavaLabCucManh.Day5.BaiSo2;


public class View {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Loading loading = new Loading();
        int option;
        do{
            option = menu.option();
            switch (option){
                case 1:{
                    loading.option1();
                    break;
                }
                case 2:{
                    loading.option2();
                    break;
                }
            }
        }while (option!=3);
    }
}
