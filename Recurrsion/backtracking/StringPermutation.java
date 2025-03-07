package Recurrsion.backtracking;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {
    public static void main(String[] args) {
        System.out.println("--------------");
        System.out.println(getAllPermuations("ABC".toCharArray(), new boolean["ABC".length()], new ArrayList<String>(),
                new StringBuilder()));
        System.out.println("--------------");
    }

    private static List<String> getAllPermuations(char[] characters, boolean[] used, ArrayList<String> finalResult,
            StringBuilder ans) {
        if (ans.length() == characters.length) {
            finalResult.add(ans.toString());
            return finalResult;
        }

        for (int i = 0; i < characters.length; i++) {
            if (used[i])
                continue;

            used[i] = true;
            ans.append(characters[i]);
            getAllPermuations(characters, used, finalResult, ans);
            used[i] = false;
            ans.deleteCharAt(ans.length() - 1);
        }

        return finalResult;
    }
}
