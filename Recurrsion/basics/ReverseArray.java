package Recurrsion.basics;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] ar = { 1, 2, 3, 4, 5 };
        System.out.println("Before : " + Arrays.toString(ar));
        reverse(ar, 0);
        System.out.println("After : " + Arrays.toString(ar));

        int[] ar2 = { 1, 2, 3, 4 };
        System.out.println("Before : " + Arrays.toString(ar2));
        reverse(ar2, 0);
        System.out.println("After : " + Arrays.toString(ar2));
    }

    private static void reverse(int[] ar, int currentIndex) {
        // System.out.println("currentIndex : " + currentIndex + " MAX :" + ((ar.length)
        // / 2));
        if (currentIndex > (((ar.length) / 2) - 1)) {
            return;
        }
        int temp = ar[currentIndex];
        ar[currentIndex] = ar[ar.length - currentIndex - 1];
        ar[ar.length - currentIndex - 1] = temp;
        reverse(ar, currentIndex + 1);
    }
}
