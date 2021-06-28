package JavaLabCucManh.Day6.Worker;

public class View {
    public static void main(String[] args) {
        Menu menu = new Menu();
        WorkerManagement workerManagement = new WorkerManagement();
        int option ;
        do{
            option = menu.option();
            switch (option){
                case 1:{
                    workerManagement.addWorker();
                    break;
                }
                case 2:{
                    workerManagement.upSalary();
                    break;
                }
                case 3:{
                    workerManagement.downSalary();
                    break;
                }
                case 4:{
                    workerManagement.display();
                    break;
                }
            }
        }while (option!=5);
    }
}
