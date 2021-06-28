package JavaLabCucManh.Day5.HomeWorkCucManh;

public class VIew {
    public static void main(String[] args) {
        DoctorManagement doctorManagement = new DoctorManagement();
        Menu menu = new Menu();
        int choice ;
        do{
            choice = menu.option();
            switch (choice){
                case 1:{
                    doctorManagement.addDoctor();
                    break;
                }
                case 2:{
                    doctorManagement.updateDoctor();
                    break;
                }
                case 3:{
                    doctorManagement.deleteDoctor();
                    break;
                }
                case 4:{
                    doctorManagement.Search();
                    break;
                }
            }
        }while (choice!=5);
    }
}
