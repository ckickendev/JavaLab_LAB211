package JavaLabCucManh.Day1.Homework.Count;

import java.util.Scanner;
import java.util.StringTokenizer;



public class CountToken {
    private String string;
    Scanner scanner = new Scanner(System.in);

    public CountToken() {
    }


    public void inputString(){
        System.out.println("Please input the string: ");
        String string = scanner.nextLine();
        this.string = string;
        return;
    }

    public int countWord(String word){
        int count = 0;
        StringTokenizer stringTokenizer = new StringTokenizer(word, " ");
        while (stringTokenizer.hasMoreTokens()){
            stringTokenizer.nextToken();
            count++;
        }
        return count;
    }

    public void countChar(String str) {
        int count[] = new int[256];

        int len = str.length();

        for (int i = 0; i < len; i++){
            count[str.charAt(i)]++;
        }
        char ch[] = new char[str.length()];
        System.out.println("Character: ");
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
                if (ch[j] == str.charAt(i)){
                    find++;
                }
            }

            if (find == 1) {
                System.out.println("(" + str.charAt(i) + ") :" + count[str.charAt(i)]);
            }
        }
    }

    public String getString() {
        return string;
    }

}
