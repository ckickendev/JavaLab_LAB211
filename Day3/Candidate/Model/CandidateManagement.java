package JavaLabCucManh.Day3.Candidate.Model;

import java.util.ArrayList;
import java.util.Date;

public class CandidateManagement {
    ArrayList<Candidate> candidates = new ArrayList<>();
    Validation validation = new Validation();

    public void addExperience(){

//        tring candidateId, String firstName, String lastName, int birthDay, String address,
//                String phone, String email, int candidateType, int expInYear, String proSkill
        boolean continues;
        do{
            System.out.println("===========ADD EXPERIENCE CANDIDATE============");
            System.out.print("Input candidate ID: ");
            String id = validation.checkIdExit(candidates);
            System.out.print("Input candidate first name: ");
            String firstName = validation.checkInputString();
            System.out.print("Input candidate last name: ");
            String lastName = validation.checkInputString();
            System.out.print("Input candidate birthday: ");
            int birthday = validation.checkBirthDay();
            System.out.print("Input candidate address: ");
            String address = validation.checkInputString();
            System.out.print("Input candidate phone: ");
            String phone = validation.checkPhone();
            System.out.print("Input candidate email: ");
            String email = validation.checkEmail();
            System.out.print("Input candidate year of experience: ");
            int noe = validation.checkInputIntLimit(0, 100);
            System.out.print("Input candidate pro skill: ");
            String pro = validation.checkInputString();
            ExperienceCandidate experienceCandidate = new ExperienceCandidate(id, firstName, lastName, birthday, address,
                    phone, email, 0, noe, pro);
            candidates.add(experienceCandidate);
            System.out.println("Success!!!");
            display();
            System.out.print("Do you want to continue (Y/N): ");
            continues = validation.checkInputYN();
        }while (continues);
    }

    public void addFresher(){
//String candidateId, String firstName, String lastName, int birthDay, String address,
////                String phone, String email, int candidateType, Date graduation_date, int graduation_rank,
////        String education
        boolean continues;
        do{
            System.out.println("===========ADD FRESHER CANDIDATE============");
            System.out.print("Input candidate ID: ");
            String id = validation.checkIdExit(candidates);
            System.out.print("Input candidate first name: ");
            String firstName = validation.checkInputString();
            System.out.print("Input candidate last name: ");
            String lastName = validation.checkInputString();
            System.out.print("Input candidate birthday: ");
            int birthday = validation.checkBirthDay();
            System.out.print("Input candidate address: ");
            String address = validation.checkInputString();
            System.out.print("Input candidate phone: ");
            String phone = validation.checkPhone();
            System.out.print("Input candidate email: ");
            String email = validation.checkEmail();
            System.out.print("Input graduation date: ");
            Date grandate = validation.checkInputDate();
            System.out.print("Input graduation rank: ");
            String rank = validation.checkInputGrandRank();
            System.out.print("Input candidate education: ");
            String edu = validation.checkInputString();

            FresherCandidate fresherCandidate = new FresherCandidate(id, firstName, lastName, birthday, address,
                    phone, email, 1, grandate, rank, edu);
            candidates.add(fresherCandidate);
            System.out.println("Success!!!");
            display();
            System.out.print("Do you want to continue (Y/N): ");
            continues = validation.checkInputYN();
        }while (continues);
    }

    public void addIntern(){
//        String candidateId, String firstName, String lastName, int birthDay, String address,
//                String phone, String email, int candidateType, String majors, String semester,
//                String universityName
        boolean continues;
        do{
            System.out.println("===========ADD INTERN CANDIDATE============");
            System.out.println("Add intern candidate: ");
            System.out.print("Input candidate ID: ");
            String id = validation.checkIdExit(candidates);
            System.out.print("Input candidate first name: ");
            String firstName = validation.checkInputString();
            System.out.print("Input candidate last name: ");
            String lastName = validation.checkInputString();
            System.out.print("Input candidate birthday: ");
            int birthday = validation.checkBirthDay();
            System.out.print("Input candidate address: ");
            String address = validation.checkInputString();
            System.out.print("Input candidate phone: ");
            String phone = validation.checkPhone();
            System.out.print("Input candidate email: ");
            String email = validation.checkEmail();
            System.out.print("Input candidate major: ");
            String major = validation.checkInputString();
            System.out.print("Input candidate semester: ");
            String semester = validation.checkInputString();
            System.out.print("Input candidate university name: ");
            String uni = validation.checkInputString();

            InternCandidate internCandidate = new InternCandidate(id, firstName, lastName, birthday, address,
                    phone, email, 2, major, semester,uni);
            candidates.add(internCandidate);
            System.out.println("Success!!!");
            display();
            System.out.print("Do you want to continue (Y/N): ");
            continues = validation.checkInputYN();
        }while (continues);
    }

    public void Searching(){
        displayAll();
        System.out.print("Input Candidate name (First name or Last name): ");
        String search = validation.checkInputString();
        System.out.print("Input type of candidate: ");
        int type = validation.checkInputIntLimit(0,2);
        int[] listIndex = validation.checkIdExist(candidates, search, type);
        System.out.println("The candidates found: ");
        for(var x: listIndex){
            if(x!=100){
                System.out.println(candidates.get(x).getFirstName()+" "+candidates.get(x).getLastName()+" | "+
                        candidates.get(x).getBirthDay()+" | "+candidates.get(x).getAddress()+ " | " +
                        candidates.get(x).getPhone()+ " | " + candidates.get(x).getEmail()+ " | "+
                        candidates.get(x).getCandidateType());
            }
        }
    }

    public void display(){
        System.out.println();
        System.out.println("List of candidate: ");
        for(var x: candidates){
            System.out.println(x);
        }
    }

    public void displayUpdate(){
        System.out.println("List of candidate:");
        System.out.println("===========EXPERIENCE CANDIDATE============");
        for(var x: candidates){
            if(x.getCandidateType()==0){
                System.out.println(x.getFirstName()+" " + x.getLastName());
            }
        }
        System.out.println("===========FRESHER CANDIDATE============");
        for(var x: candidates){
            if(x.getCandidateType()==1){
                System.out.println(x.getFirstName()+" " + x.getLastName());
            }
        }
        System.out.println("===========INTERN CANDIDATE============");
        for(var x: candidates){
            if(x.getCandidateType()==2){
                System.out.println(x.getFirstName()+" " + x.getLastName());
            }
        }
    }

    public void displayAll(){
        System.out.println();
        if(candidates.isEmpty()){
            System.out.println("No one here!");
        }else {
            System.out.println("List of candidate:");
            System.out.println("===========EXPERIENCE CANDIDATE============");
            for(var x: candidates){
                if(x.getCandidateType()==0){
                    System.out.println(x.getFirstName()+" " + x.getLastName());
                }
            }
            System.out.println("===========FRESHER CANDIDATE============");
            for(var x: candidates){
                if(x.getCandidateType()==1){
                    System.out.println(x.getFirstName()+" " + x.getLastName());
                }
            }
            System.out.println("===========INTERN CANDIDATE============");
            for(var x: candidates){
                if(x.getCandidateType()==2){
                    System.out.println(x.getFirstName()+" " + x.getLastName());
                }
            }
        }
        System.out.println();
    }


}
