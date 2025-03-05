package Recurrsion.basics;

public class PowerFunction {
    public static void main(String[] args) {
        System.out.println(power(2, 3, 1));
        System.out.println(power2(5, 4));
        System.out.println(OptimizedPowerFunction(5, 4));
    }

    private static int power(int a, int b, int ans) {
        if (b == 0)
            return ans;
        return power(a, b - 1, ans * a);
    }

    private static int power2(int a, int b) {
        if (b == 0)
            return 1;
        return a * power2(a, b - 1);
    }

    private static int OptimizedPowerFunction(int a, int b) { // O(logb) others take O(b)
        if (b == 0)
            return 1; // Base case: a^0 = 1

        int half = OptimizedPowerFunction(a, b / 2); // Recursive call for half exponent

        if (b % 2 == 0) { // If exponent is even
            return half * half;
        } else { // If exponent is odd
            return a * half * half;
        }
    }

}
