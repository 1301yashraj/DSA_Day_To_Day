
// A square hollow pattern or a frame
import java.util.*;

class Square {
    public static void main(String[] args) {
        try (// taking input
                Scanner sc = new Scanner(System.in)) {
            System.out.println("\n Enter the length and width of the frame");
            int length = sc.nextInt();
            int width = sc.nextInt();

            // solution
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < width; j++) {
                    String str = ((i == 0 || i == length - 1) || (j == 0 || j == width - 1)) ? "* " : "  ";
                    /* upper and lower boundary of the frame */ // left and right boundary of the frame
                    System.out.print(str);
                }
                System.out.println();
            }
        }
    }
}
