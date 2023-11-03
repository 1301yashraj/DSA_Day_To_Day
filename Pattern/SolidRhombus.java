package Pattern;

import java.util.*;

public class SolidRhombus {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter Size of Rhombus :");
      int n = sc.nextInt();
      for (int i = 1; i <= n; i++) {
        int count = 0;
        for (int j = 1; j < n * 2; j++) {
          if (j >= n - i + 1 && count < n) {
            System.out.print("*");
            count++;
          } else {
            System.out.print(" ");
          }
        }
        System.out.println("");
      }
    }
  }

}
