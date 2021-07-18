package JavaLabCucManh.Day8.Matrix_cucmanh;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        Menu menu = new Menu();
        int choice;
        do{
            choice = menu.option();
            switch (choice){
                case 1:{
                    matrix.addMatrix();
                    break;
                }
                case 2:{
                    matrix.subMaxtrix();
                    break;
                }
                case 3:{
                    matrix.MultiplicationMatrix();
                    break;
                }
            }
        }while (choice!=4);
    }
}
