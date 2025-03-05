package Recurrsion.basics;

public class PowerFunction {
    public static void main(String[] args) {
        System.out.println(power(2, 3, 1));
        System.out.println(power2(5, 4));
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

}
