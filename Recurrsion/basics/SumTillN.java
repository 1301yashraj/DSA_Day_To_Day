package Recurrsion.basics;

import java.util.Scanner;

public class SumTillN {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Sum upto what ? >>");
            int n = sc.nextInt();
            System.out.println("SUM from 1 to " + n + " is " + add1stN(n));
        }
    }

    private static int add1stN(int n) {
        if (n == 1)
            return n;
        return n + add1stN(--n);
    }

}
