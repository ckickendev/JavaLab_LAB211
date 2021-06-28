package JavaLabCucManh.Day3.Candidate.View;

import JavaLabCucManh.Day3.Candidate.Model.Validation;

public class Menu {
    Validation validation = new Validation();
    public int getMenu(){
        System.out.println("CANDIDATE MANAGEMENT SYSTEM");
        System.out.println("1. Experience");
        System.out.println("2. Fresher");
        System.out.println("3. Internship");
        System.out.println("4. Searching");
        System.out.println("5. Exit");
        System.out.println("(Please choose 1 to Create Experience Candidate, 2 to Create Fresher Candidate, 3 to Internship Candidate," +
                "4 to Searching and 5 to Exit program).");
        int result = validation.checkInputIntLimit(1,5);
        return result;
    }
}
