package JavaLabCucManh.Day7.AnalyzeInputString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loading {
    public final Scanner scanner = new Scanner(System.in);
    HashMap<String, ArrayList<Integer>> analyzeINT = new HashMap<>();
    HashMap<String, ArrayList<Character>> analyzeCHA = new HashMap<>();

    public int checkInputIntLimit(int min, int max){
        while(true){
            int result = Integer.parseInt(scanner.nextLine().trim());
            if(result<min || result>max){
                System.out.println("Your input wrong, must be in range: " + min + " and " + max + " !!!" );
            } else {
                return result;
            }
        }
    }

    public String checkInputString(){
        while (true){
            try{
                String result = scanner.nextLine();
                if(!result.isEmpty()){
                    return result;
                }else {
                    System.out.println("Your input must be not null");
                    System.out.println("Please input again");
                }
            }catch (NullPointerException ex){
                System.out.println("Cannot null");
            }

        }
    }

    public void analyzeNumber(String input){
        String regex = "\\d+";
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(input);
        int[] arrayInt = new int[20];
        int count = 0;
        while (matcher.find()){
//            System.out.println("Full match: "+ matcher.group(0));
            arrayInt[count] = Integer.parseInt(matcher.group(0));
            count++;
        }
        ArrayList<Integer> perfectSquare = new ArrayList<>();
        ArrayList<Integer> oddNumber = new ArrayList<>();
        ArrayList<Integer> EvenNumber = new ArrayList<>();
        ArrayList<Integer> AllNumber= new ArrayList<>();
        for (int i=0 ;i<count; i++){
            if(checkPerfectSquare(arrayInt[i])){
                perfectSquare.add(arrayInt[i]);
            }
            if(arrayInt[i]%2!=0){
                oddNumber.add(arrayInt[i]);
            }
            if(arrayInt[i]%2==0){
                EvenNumber.add(arrayInt[i]);
            }
            AllNumber.add(arrayInt[i]);
        }
        analyzeINT.put("Perfect Square Numbers", perfectSquare);
        analyzeINT.put("Odd Numbers",oddNumber);
        analyzeINT.put("Even Numbers", EvenNumber);
        analyzeINT.put("All Numbers", AllNumber);

        analyzeINT.forEach((k,v)->{
            System.out.println(k+" : " + v);
        });

    }

    public void analyzeLetter(String input){
        String regex = "\\D";
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(input);
        Character[] arrayCharacter = new Character[50];
        int count = 0;
        while (matcher.find()){
//          System.out.println("Full match: "+ matcher.group(0));
            arrayCharacter[count] = matcher.group(0).charAt(0);
            count++;
        }
        ArrayList<Character> upperCase = new ArrayList<>();
        ArrayList<Character> lowerCase = new ArrayList<>();
        ArrayList<Character> special = new ArrayList<>();
        ArrayList<Character> all = new ArrayList<>();
        for (int i=0; i<count; i++){
            if (Character.isUpperCase(arrayCharacter[i])){
                upperCase.add(arrayCharacter[i]);
            }else if(Character.isLowerCase(arrayCharacter[i])){
                lowerCase.add(arrayCharacter[i]);
            }else {
                special.add(arrayCharacter[i]);
            }
            all.add(arrayCharacter[i]);
        }
        analyzeCHA.put("Uppercase Characters", upperCase);
        analyzeCHA.put("Lowercase Characters", lowerCase);
        analyzeCHA.put("Special Characters", special);
        analyzeCHA.put("All Characters", all);
        analyzeCHA.forEach((k,v)->{
            System.out.println(k+" : " + v);
        });
    }



    static boolean checkPerfectSquare(int x) {
        double sq = Math.sqrt(x);
        return ((sq - Math.floor(sq)) == 0);
    }



}
