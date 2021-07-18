package JavaLabCucManh.Day1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class BubleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayNe arrayNe = new ArrayNe();
        arrayNe.creat();
        System.out.println("Before sort: ");
        arrayNe.display(arrayNe.getArray());
        arrayNe.bSort();

        int find = arrayNe.find();
        int index = arrayNe.binarySearch(arrayNe.getArray(), 0, arrayNe.getArray().length-1, find);
        System.out.println("Found in: " + index);

    }
}
