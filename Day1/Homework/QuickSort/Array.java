package JavaLabCucManh.Day1.Homework.QuickSort;

import java.util.Scanner;

public class Array {
    private int[] array;

    public Array() {
    }

    public int[] getArray() {
        return array;
    }

    public void creatArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of array: ");
        int length = Integer.parseInt(scanner.nextLine());
        int[] tempArray = new int[length];
        for(int i =0 ;i<length; i++){
            System.out.print("Index " +i+" : ");
            int value = Integer.parseInt(scanner.nextLine());
            tempArray[i] = value;
        }
        this.array = tempArray;

    }
    public int[] quickSort(int[] arr, int start, int end){
        int partition = partition(arr, start, end);
        if(partition-1>start) {
            quickSort(arr, start, partition - 1);
        }
        if(partition+1<end) {
            quickSort(arr, partition + 1, end);
        }
        return arr;
    }

    public int partition(int[] arr, int start, int end){
        int pivot = arr[end];

        for(int i=start; i<end; i++){
            if(arr[i]<pivot){
                int temp= arr[start];
                arr[start]=arr[i];
                arr[i]=temp;
                start++;
            }
        }
        int temp = arr[start];
        arr[start] = pivot;
        arr[end] = temp;

        return start;
    }

    public void display(int[] array){
        for(var x: array){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
