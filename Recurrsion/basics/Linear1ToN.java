package Recurrsion.basics;

import java.util.Scanner;

public class Linear1ToN {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Print upto what ? >>");
            int max = sc.nextInt();
            sc.nextLine(); // to consume "newLine"
            System.out.println("INC I OR DEC D (I OR D)>>");
            String flow = sc.nextLine().trim().toUpperCase();
            System.out.println("--------------------------");
            if (flow.equals("I"))
                printTillMax(1, max);
            else
                printTillMax(max, 1);
        }

    }

    public static void printTillMax(int from, int to) {
        if (from == to) {
            System.out.println(from);
            return;
        }
        System.out.println(from);
        if (from > to)
            printTillMax(--from, to);
        else
            printTillMax(++from, to);

    }
}