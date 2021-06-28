package JavaLabCucManh.Day1;

import java.util.Scanner;

public class ArrayNe {
    private int[] array;

    public ArrayNe() {
    }

    private Scanner sc = new Scanner(System.in);

    public void creat(){
        System.out.println("Input the number of array: ");
        int length = Integer.parseInt(sc.nextLine());
        this.array = new int[length];
        for (int i=0 ; i< length; i++) {
            double randomDouble = Math.random();
            randomDouble = randomDouble * 10 + 1;
            int randomInt = (int) randomDouble;
            array[i] = randomInt;
        }
    }
    public void bSort(){
        int[] result = this.array;
        for(int i=0; i< result.length; i++){
            boolean flag = true;
            for (int j=i+1; j < result.length; j++){
                if(result[i]>result[j]){
                    int SooNa = result[i];
                    result[i] = result[j];
                    result[j] = SooNa;
                    flag = false;
                }
                if(flag == true){
                    break;
                }
            }
        }
        System.out.println("After sort: ");
        display(result);
    }

//    public int binarySearch(int arr[], int l, int r, int x){
//        while(r>=l){
//            int mid = l + (r-l)/2;
//            if(arr[mid] == x){
//                return mid;
//            }
//            if(arr[mid] > x){
//                r = mid - 1;
//            }
//            if(arr[mid] < x){
//                l = mid +1 ;
//            }
//        }
//        return -1;
//    }

    public int binarySearch(int arr[], int l, int r, int x){
        while(r>=l){
            int mid = l + (r-l)/2;
            if(arr[mid] == x){
                return mid;
            }
            if(arr[mid] > x){
                r = mid - 1;
            }
            if(arr[mid] < x){
                l = mid +1 ;
            }
        }
        return -1;
    }




    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void display(int[] array){
        for(var x: array){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public int find(){
        System.out.print("Input number to search: ");
        int find = Integer.parseInt(sc.nextLine());
        return find;
    }


}
