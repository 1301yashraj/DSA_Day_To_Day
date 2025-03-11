package DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubsetSum {
    // Given an array of integers and a target sum, determine if there exists a
    // subset of the array whose sum is equal to the target sum.
    // Input: arr = {3, 34, 4, 12, 5, 2}, target = 9
    // Output: true
    // Explanation: {4, 5} or {3, 2, 4} forms the sum 9.

    public static void main(String[] args) {
        int[] ar = new int[] { 3, 34, 4, 12, 5, 2 };
        int target = 51;
        boolean[] used = new boolean[ar.length];
        System.out.println(hasSubsset(ar, target, 0, used, new StringBuilder()));

        Map<String, List<Integer>> memo = new HashMap<>();
        List<Integer> result = findSubset(ar, target, 0, 0, memo);
        System.out.println("Memo >>>" + memo);
        System.out.println(result);
    }

    // Recursion
    // will find the subset and then the sum of it
    private static boolean hasSubsset(int[] ar, int target, int currentSum, boolean[] used, StringBuilder ans) {
        if (currentSum > target)
            return false;
        if (currentSum == target) {
            System.out.println(ans.toString());
            return true;
        }

        for (int i = 0; i < ar.length; i++) {
            if (used[i])
                continue;

            used[i] = true;
            int len = ans.length();
            if (len > 0)
                ans.append(", ");
            ans.append(ar[i]);
            if (hasSubsset(ar, target, currentSum + ar[i], used, ans))
                return true;
            used[i] = false;
            ans.setLength(len);
        }
        return false;
    }

    // Reaching a index with a sum just storing that is it possible to get the
    // result from that index onwards.
    private static Map<String, Boolean> memo = new HashMap<>();

    private static List<Integer> findSubset(int[] arr, int target, int index, int currentSum,
            Map<String, List<Integer>> memo) {
        if (currentSum == target)
            return new ArrayList<>(); // Found valid subset, return empty list to start building result
        if (index >= arr.length || currentSum > target)
            return null; // Out of bounds or exceeded target

        // Memoization key
        String key = index + "_" + currentSum;
        if (memo.containsKey(key))
            return memo.get(key);

        // Include the current element
        List<Integer> include = findSubset(arr, target, index + 1, currentSum + arr[index], memo);
        if (include != null) {
            List<Integer> subset = new ArrayList<>(include);
            subset.add(arr[index]); // Add current element
            memo.put(key, subset);
            return subset;
        }

        // Exclude the current element
        List<Integer> exclude = findSubset(arr, target, index + 1, currentSum, memo);
        memo.put(key, exclude != null ? exclude : new ArrayList<>()); // Store the result
        return exclude;
    }

}
