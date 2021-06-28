package JavaLabCucManh.Day6.Path;

import java.util.Scanner;

public class Validation {
    public Scanner in = new Scanner(System.in);

    public String checkInputString() {
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }
}
