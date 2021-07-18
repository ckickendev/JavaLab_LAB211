package JavaLabCucManh.Day1.Homework.LinearSearch;

import java.util.Scanner;

public class LinearS {
    public static void main(String args[])
    {
        int c, n, search, array[];

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        n = Integer.parseInt(in.nextLine());
        array = new int[n];

        System.out.println("Enter those " + n + " elements");

        for (c = 0; c < n; c++){
            System.out.print("Value element "+ c + " : ");
            array[c] = Integer.parseInt(in.nextLine());
        }

        System.out.print("Enter value to find: ");
        search = in.nextInt();

        for (c = 0; c < n; c++) {
            if (array[c] == search) {
                System.out.println(search + " is present at location " + (c + 1) + ".");
                break;
            }
        }
        if (c == n){
            System.out.println(search + " isn't present in array.");
        }
    }
}
