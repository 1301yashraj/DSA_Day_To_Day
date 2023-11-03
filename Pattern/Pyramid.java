package Pattern;

import java.util.*;

public class Pyramid {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter Size : ");
      int n = sc.nextInt();

      // Pyramaid

      for (int i = 0; i < n; i++) {
        for (int j = n - 1; j >= i; j--) {
          System.out.print(" * ");
        }
        System.out.println();
      }

      // Inverted HAlf Pyramid

      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          if (j >= n - i - 1)
            System.out.print(" * ");
          else
            System.out.print("   ");
        }
        System.out.println();
      }
    }

  }

}
