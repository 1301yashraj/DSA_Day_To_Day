package Recurrsion.basics;

public class SumofDigits {
    public static void main(String[] args) {
        int num = 123456789;
        System.out.println("Sum of digits of " + num + " is " + sumDigit(num));
    }

    private static int sumDigit(int num) { // 1234
        if (num / 10 == 0)
            return num;
        return (num % 10) + sumDigit(num / 10);
        // 4 + (123)
        // ------3 + (12)
        // ------------2 + (1)
    }

}
