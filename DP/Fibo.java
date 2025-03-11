package DP;

import java.util.Arrays;

public class Fibo {
    public static void main(String[] args) {
        System.out.println(fibo(8));
        System.out.println(fiboR(8));

        // Memoization
        int n = 8;
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        System.out.println(fiboMemo(n, memo));
    }

    // General Approach
    private static int fibo(int n) {

        // System.out.print(0);
        int previous = 0, current = 1;
        for (int i = 0; i < n; i++) {
            int sum = previous + current;
            previous = current;
            // System.out.print(", " + previous);
            current = sum;
        }
        return previous;
    }

    // Recurssive
    public static int fiboR(int n) {
        if (n <= 1)
            return n;
        int prvious = fiboR(n - 2);
        int current = fiboR(n - 1);
        int val = prvious + current;
        // System.out.println(val);
        return val;
    }

    // Memoization
    public static int fiboMemo(int n, int[] memo) {
        if (n <= 1)
            return n;
        if (memo[n] != -1)
            return memo[n];

        memo[n] = fiboMemo(n - 1, memo) + fiboMemo(n - 2, memo);

        return memo[n];
    }
}
