package JavaLabCucManh.Day3.Candidate.Controller;

import JavaLabCucManh.Day3.Candidate.Model.CandidateManagement;
import JavaLabCucManh.Day3.Candidate.View.Menu;
import JavaLabCucManh.Day3.Candidate.Model.Validation;

public class View {
    public static void main(String[] args) {
        CandidateManagement candidateManagement = new CandidateManagement();
        Menu menu = new Menu();
        Validation validation = new Validation();
        int choice;
        do{
            choice = menu.getMenu();
            switch (choice){
                case 1:{
                    candidateManagement.addExperience();
                    candidateManagement.displayUpdate();
                    break;
                }
                case 2:{
                    candidateManagement.addFresher();
                    candidateManagement.displayUpdate();
                    break;
                }
                case 3:{
                    candidateManagement.addIntern();
                    candidateManagement.displayUpdate();
                    break;
                }
                case 4:{
                    candidateManagement.Searching();
                    candidateManagement.displayUpdate();
                    break;
                }
            }
        }while (choice!=5);
    }
}
