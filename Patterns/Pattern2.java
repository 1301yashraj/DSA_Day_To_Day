import java.util.*;
/*T
    Hollow Triangle and a simple triangle
          *                    *
        *   *                * * *
    Something like this.
 */

public class Pattern2 {
    public static void main(String[] args) {
        ArrayList<Integer> inputs = Pattern2.input();
        switch (inputs.get(1)) {
            case 1:
                Pattern2.hollow(inputs.get(0));
                break;
            case 2:
                Pattern2.solid(inputs.get(0));
        }
    }

    public static void hollow(int size) {
        int rows = size, columns = 2 * size - 1; // (size-1) on both side + 1 at centre
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                // print * at size-row position than row spaces than print *
                if (((size - row - 1) == col) || (col == (size + row - 1)) || row == (rows - 1))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void solid(int size) {
        int rows = size, columns = 2 * size - 1; // (size-1) on both side + 1 at centre
        for (int row = 0; row < rows; row++) {
            int count = 0;
            for (int col = 0; col < columns; col++) {
                // print * at size-row position than row spaces than print *
                if (((size - row - 1) == col) || (col == (size + row - 1)) || row == (rows - 1)) {
                    System.out.print("* ");
                    count++;
                }

                else {
                    if (count == 1 && row != 0)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static ArrayList<Integer> input() {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of triangle ");
            newList.add(sc.nextInt());
            System.out.print("\nEnter type of triangle 1 Hollow and 2 Solid");
            newList.add(sc.nextInt());
        }
        return newList;
    }
}
