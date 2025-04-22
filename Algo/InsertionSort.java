package Algo;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        // int[] arr = new int[] { 2, 3, 8, 4, 5, 6, 1, 7, 11, 10 };
        int[] arr = new int[] { 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        System.out.println();
        System.out.println("Unsorted >>" + Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (arr[j] > val) {
                    arr[j + 1] = arr[j];
                } else
                    break;
            }
            arr[j + 1] = val;
            System.out.println("Sorted " + i + " >>" + Arrays.toString(arr));
        }
        System.out.println("Sorted   >>" + Arrays.toString(arr));
        System.out.println();
    }
}