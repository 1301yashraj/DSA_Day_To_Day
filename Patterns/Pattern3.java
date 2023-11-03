
//Downwards Traingle
import java.util.*;

public class Pattern3 {
    public static void main(String[] args) {
        ArrayList<Integer> ar = input();
        int size = ar.get(0);
        printTraingle(size);
    }

    public static void printTraingle(int size) {
        int centre = size - 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < (2 * size - 1); j++) {
                if (j >= centre - (size - i - 1) && j <= centre + (size - i - 1))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static ArrayList<Integer> input() {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of triangle ");
            newList.add(sc.nextInt());
        }
        return newList;
    }

}
