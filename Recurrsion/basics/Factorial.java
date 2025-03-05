package Recurrsion.basics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("FACTORIAL of what ? >>");
            int n = sc.nextInt();
            System.out.println("SUM from 1 to " + n + " is " + factorial(n));
        }
    }

    private static int factorial(int n) {
        if (n == 1)
            return n;
        return n * factorial(n - 1);
    }
}
