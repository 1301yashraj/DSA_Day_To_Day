package Recurrsion.backtracking;

import java.util.*;

public class AllKCombinations {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4));
        int k = 2;
        // nCk = 3C2 = 3
        boolean[] used = new boolean[list.size()];
        getKCombinations(list, k, used, new ArrayList<>(), 0);
    }

    private static void getKCombinations(List<Integer> list, int k, boolean[] used, List<Integer> ans, int start) {
        if (ans.size() == k) {
            System.out.println(ans);
            return;
        }

        for (int i = start; i < list.size(); i++) {
            // changing i = 0 to i = start as old numbers covered not requred to come
            // again as [1,2] and [2,1] is same,
            // as we have covered [1,2] while making combinations of 1
            // so when making combinations of 2 no need to cover previous values
            if (used[i])
                continue;

            used[i] = true;
            ans.add(list.get(i));
            getKCombinations(list, k, used, ans, i);
            used[i] = false;
            ans.remove(ans.size() - 1);
        }
    }
}
