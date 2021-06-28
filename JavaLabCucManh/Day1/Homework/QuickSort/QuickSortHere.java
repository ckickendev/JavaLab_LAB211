package JavaLabCucManh.Day1.Homework.QuickSort;

public class QuickSortHere {
    public static void main(String[] args) {
        Array array = new Array();
        array.creatArray();
        System.out.println("After sort: ");
        array.display(array.quickSort(array.getArray(), 0, array.getArray().length-1));
    }


}
