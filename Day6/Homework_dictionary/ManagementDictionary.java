package JavaLabCucManh.Day6.Homework_dictionary;

import java.util.ArrayList;

public class ManagementDictionary {
    ArrayList<Dictionary> dictionaries = new ArrayList<>();
    Validation validation = new Validation();

    public void addWord(){
        System.out.println("------------- Add -------------");
        System.out.print("Enter English: ");
        String eMean = validation.checkInputString();
        System.out.print("Enter Vietnamese: ");
        String vMean = validation.checkInputString();
        dictionaries.add(new Dictionary(eMean, vMean));
        System.out.println("Successful");
    }

    public void deleteWord(){
        System.out.println("------------ Delete ----------------");
        System.out.print("Enter English: ");
        String eMean = validation.checkInputString();
        int index = validation.checkExistMean(eMean, dictionaries);
        if(index == -1){
            System.out.println("Not Exist");
        }else {
            dictionaries.remove(index);
            System.out.println("Successful");
        }
    }

    public void searchWord(){
        System.out.println("------------- Translate ------------");
        System.out.print("Enter English: ");
        String eMean = validation.checkInputString();
        int index = validation.checkExistMean(eMean, dictionaries);
        if(index == -1){
            System.out.println("Not Exist");
        }else {
            System.out.print("Vietnamese: ");
            System.out.println(dictionaries.get(index).getVietnameseMean());

        }
    }
}
