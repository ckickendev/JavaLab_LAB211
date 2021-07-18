package JavaLabCucManh.Day2.StudentManager;

public class ViewNe {
    public static void main(String[] args) {
        MenuNe menuNe = new MenuNe();
        StudentManager studentManager = new StudentManager();
        Validation validation = new Validation();
        int choice;
        do{
            choice = menuNe.menuChoice();
            switch (choice){
                case 1:{
                    while (studentManager.getStudents().size()<=2){
                        studentManager.createStudent();
                    }
                    boolean continuee = true;
                    do{
                        System.out.println("Do you want to continue: (Y/N)");
                        continuee = validation.checkInputYN();
                        if(continuee==true){
                            studentManager.createStudent();
                        }else {
                            break;
                        }
                    }while (true);
                    break;
                }
                case 2:{
                    studentManager.find();
                    studentManager.sort();
                    break;
                }
                case 3:{
                    int choice3 = menuNe.choice3();
                    switch (choice3){
                        case 1:{
                            studentManager.update();
                            break;
                        }
                        case 2:{
                            studentManager.delete();
                            break;
                        }
                    }
                    break;
                }
                case 4:{
                    studentManager.report();
                    break;
                }
            }
        }while (choice!=5);
    }
}
