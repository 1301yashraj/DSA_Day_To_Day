package Algo;

import java.util.Arrays;

public class InsertionSSort {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        insertionSort(arr1);
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int num = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > num) { // 5 > 3 {1 ,2 ,3 ,4,5} // 4> 3
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = num;
        }
        System.out.println(Arrays.toString(arr));
    }
}
