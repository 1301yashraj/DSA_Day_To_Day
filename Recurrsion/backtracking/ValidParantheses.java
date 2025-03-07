package Recurrsion.backtracking;

public class ValidParantheses {

    public static void main(String[] args) {
        int n = 3;
        generateAll(n, 0, 0, new StringBuilder());
    }

    private static void generateAll(int n, int usedLeft, int usedRight, StringBuilder pattern) {
        System.out.println("usedLeft >> " + usedLeft + " usedRight >> " + usedRight + " Pattern >> " + pattern);
        if (usedLeft == n && usedRight == n) {
            System.out.println(pattern.toString());
            return;
        }

        // include "("
        if (usedLeft < n) {
            pattern.append("(");
            generateAll(n, usedLeft + 1, usedRight, pattern);
            pattern.deleteCharAt(pattern.length() - 1);
        }

        // inclide ")"
        if (usedLeft > usedRight) {
            pattern.append(")");
            generateAll(n, usedLeft, usedRight + 1, pattern);
            pattern.deleteCharAt(pattern.length() - 1);
        }

    }
}
