package Algo;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        for (int position = 0; position < arr.length; position++) {
            int min = arr[position];
            int minIndex = position;
            for (int j = position + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            // swap
            swap(arr, position, minIndex);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
