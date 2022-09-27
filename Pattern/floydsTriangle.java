package Pattern;
import java.util.*;
public class floydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Height of triangle : ");
        int n = sc.nextInt();
        int p = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" "+p++);
            }
            System.out.println(" ");
        }
    }
}
