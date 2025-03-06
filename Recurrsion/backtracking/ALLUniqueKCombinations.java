package Recurrsion.backtracking;

import java.util.ArrayList;
import java.util.List;

public class ALLUniqueKCombinations {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 1, 2));
        int k = 2;
        // nCk = 3C2 = 3
        boolean[] used = new boolean[list.size()];
        getKUniqueCombinations(list, k, used, new ArrayList<>(), 0);
    }

    private static void getKUniqueCombinations(List<Integer> list, int k, boolean[] used, List<Integer> ans,
            int start) {
        if (ans.size() == k) {
            System.out.println(ans);
            return;
        }

        for (int i = start; i < list.size(); i++) {
            if (used[i])
                continue;

            used[i] = true;
            // first occurance must be used before using hte second occurance
            // used[i - 1] != true prevents picking a duplicate number unless its first
            // occurrence was used.
            if (i > 0 && list.get(i) == list.get(i - 1) && used[i - 1] != true)
                continue;
            ans.add(list.get(i));
            getKUniqueCombinations(list, k, used, ans, i);
            used[i] = false;
            ans.remove(ans.size() - 1);
        }
    }

}
