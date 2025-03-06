
package Recurrsion.backtracking;

import java.util.ArrayList;
import java.util.List;

class TargetSum {

    // just find all subsequnces and print where sum is equal to target.
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        int target = 4;

        targetPair(arr, target, 0, 0, new ArrayList<>());
    }

    private static void targetPair(int[] ar, int target, int index, int sum, List<Integer> ans) {
        if (target == sum) {
            System.out.println("PAIRS SELECTED " + ans);
            return;
        }
        if (target < sum || index == ar.length) {
            System.out.println("PAIRS >> " + ans);
            return;
        }

        // exclude no.
        targetPair(ar, target, index + 1, sum, ans);

        // include no.
        ans.add(ar[index]);
        targetPair(ar, target, index + 1, sum + ar[index], ans);

        // Backtrack - Remove the last added number
        ans.remove(ans.size() - 1);
    }
}