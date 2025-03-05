package Recurrsion.basics;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] ar = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int left = 0, right = ar.length - 1;
        // int num = 6;
        // int index = search(ar, left, right, num);
        // System.out.println("ar :" + Arrays.toString(ar) + " >>> " + num + " found @ "
        // + index + " is " + ar[index]);

        ar = new int[] { 1, 2, 3, 4, 5 };
        left = 0;
        right = ar.length - 1;
        int num = 1;
        int index = search(ar, left, right, num);
        System.out.println("ar :" + Arrays.toString(ar) + " >>> " + num + " found @ " + index + " is " + ar[index]);

        num = 2;
        left = 0;
        right = ar.length - 1;
        index = search(ar, left, right, num);
        System.out.println("ar :" + Arrays.toString(ar) + " >>> " + num + " found @ " + index + " is " + ar[index]);

        num = 3;
        left = 0;
        right = ar.length - 1;
        index = search(ar, left, right, num);
        System.out.println("ar :" + Arrays.toString(ar) + " >>> " + num + " found @ " + index + " is " + ar[index]);

        num = 4;
        left = 0;
        right = ar.length - 1;
        index = search(ar, left, right, num);
        System.out.println("ar :" + Arrays.toString(ar) + " >>> " + num + " found @ " + index + " is " + ar[index]);

        num = 5;
        left = 0;
        right = ar.length - 1;
        index = search(ar, left, right, num);
        System.out.println("ar :" + Arrays.toString(ar) + " >>> " + num + " found @ " + index + " is " + ar[index]);

    }

    private static int search(int[] ar, int left, int right, int num) {
        if (left > right)
            return -1;
        int mid = (left + right) / 2;
        if (ar[mid] == num)
            return mid;
        if (ar[mid] > num)
            right = mid - 1;
        else
            left = mid + 1;

        return search(ar, left, right, num);

    }
}
