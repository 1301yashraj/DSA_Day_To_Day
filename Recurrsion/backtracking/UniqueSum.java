package Recurrsion.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueSum {

    /*
     * Just find all the unique K combinations and insert a new base condtion for
     * sum also.
     */
    public static void main(String[] args) {
        System.out.println("--------------------");
        int[] arr = { 1, 2, 2, 3 };
        int target = 4;
        boolean[] used = new boolean[arr.length];
        System.out.println("Arr :" + Arrays.toString(arr) + " Target : " + target);
        getSum(arr, target, new ArrayList<Integer>(), 0, used, 0);

        System.out.println("--------------------");
        int[] arr2 = { 1, 1, 1, 2, 2 };
        int target2 = 3;
        boolean[] used2 = new boolean[arr2.length];
        System.out.println("Arr :" + Arrays.toString(arr2) + " Target : " + target2);
        getSum(arr2, target2, new ArrayList<Integer>(), 0, used2, 0);

    }

    // ar must be sorted to find unique
    private static void getSum(int[] ar, int target, List<Integer> ans, int sum, boolean[] used, int start) {
        if (sum > target)
            return;
        if (sum == target) {
            System.out.println(ans);
            return;
        }

        for (int i = start; i < ar.length; i++) {
            // if (used[i]) // as we are move i to ext index used is of no use
            // continue;

            // this condtion to not go in braches of repeated sequence depends on sorted ar
            // for understanding it better look at AllUniqueKCombinations.java

            // It would skip valid duplicates too early and miss valid combinations like
            // [1,1,1]
            if (i > start && ar[i - 1] == ar[i] /* && used[i - 1] != true && i>0 */)
                continue; // i>start is very important condition easier to use i>0 with used array

            // used[i] = true;
            ans.add(ar[i]);
            sum += ar[i];
            getSum(ar, target, ans, sum, used, i + 1);
            sum -= ar[i];
            ans.remove(ans.size() - 1);
            // used[i] = false;
        }
    }
}
