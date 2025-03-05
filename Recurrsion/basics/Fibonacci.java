package Recurrsion.basics;

import java.util.Scanner;

public class Fibonacci {
    // to get correct nth fibo remember that
    // fibo start with 0 atindex 0 and 1 at index 1

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("FIBONACCI LENGTH ? >>");
            int n = sc.nextInt();
            System.out.println("FIBO " + n + " is  : ");
            fibo(n, 1, 0, 1);
            System.out.println();
            System.out.println("---");
            System.out.println("n th  fibo " + nthfibo(n));

        }

    }

    private static void fibo(int n, int start, int prev, int current) {
        if (start > n + 1)
            return;
        System.out.print(prev + " ");
        fibo(n, start + 1, current, prev + current);

    }

    // to find the nth fibonaacii
    private static int nthfibo(int n) {
        if (n <= 1)
            return n;
        return nthfibo(n - 1) + nthfibo(n - 2);
    }
}