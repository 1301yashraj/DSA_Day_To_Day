package Pattern;

import java.util.*;

public class Butterfly {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter wingspan of Buuterfly :");
            int n = sc.nextInt();
            for (int i = 1; i <= n * 2; i++) {
                int num = (i <= n) ? i : (n * 2) - i + 1;
                for (int j = 1; j <= n * 2; j++) {
                    if (j <= num || j > n * 2 - num) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}