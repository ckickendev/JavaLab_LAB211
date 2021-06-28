package JavaLabCucManh.Day1.Homework.Count;

import JavaLabCucManh.Day1.Homework.Count.CountToken;

public class View {
    public static void main(String[] args) {
        CountToken countToken = new CountToken();
        countToken.inputString();
        int word = countToken.countWord(countToken.getString());
        System.out.println("Word: " + word);

        countToken.countChar(countToken.getString());
    }
}
