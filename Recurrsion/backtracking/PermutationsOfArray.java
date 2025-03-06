package Recurrsion.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsOfArray {

    /*
     * This program covers 2 types of permutation :
     *
     * 1. Every number is considered unique
     *
     * way 1 : Reducce the array while moving forward and add the element to answer
     * way 2 : make a sepearte array which keeps check on the values which are
     * covered every time startng from zero
     * only add the number if its not consumed.
     *
     * 2. Repeating numbers present in array and print unique permutations
     * sort the array than dont add the next element if its already been used and is
     * similar to the element .i., only use the combinations made by first
     * occurance.
     *
     *
     */
    public static void main(String[] args) {
        int[] ar = new int[] { 1, 2, 3 };
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3)); // Now it's mutable
        // 1.
        // getAllPermutations(arr, new ArrayList<Integer>());
        boolean[] used = new boolean[arr.size()]; // Track used elements
        // 2. Unique and easier to implement
        // getAllPermutationsClean(arr, new ArrayList<>(), used);

        // 3. UniquePermutations
        // >> first sort the array n!/(permutions of repeating charcters)
        List<Integer> arr2 = new ArrayList<>(Arrays.asList(1, 1, 2, 2));
        boolean[] used2 = new boolean[arr2.size()];
        getAllPermutationsRepeatingnums(arr2, new ArrayList<>(), used2);
    }

    private static void getAllPermutations(List<Integer> ar, List<Integer> ans) {
        if (ar.isEmpty()) { // Base condition: all elements used
            System.out.println(ans);
            System.out.println("-------------------------------");
            return;
        }

        for (int i = 0; i < ar.size(); i++) {
            System.out.println("AR >> " + ar + "ANS >>> " + ans + "at index " + i);
            List<Integer> remaining = new ArrayList<>(ar); // Copy list to avoid modifying original
            int removed = remaining.remove(i); // Remove element safely
            List<Integer> newAns = new ArrayList<>(ans);
            newAns.add(removed);

            getAllPermutations(remaining, newAns);
        }
    }

    private static void getAllPermutationsClean(List<Integer> ar, List<Integer> ans, boolean[] used) {
        if (ans.size() == ar.size()) { // Base condition: all elements used
            System.out.println(ans);
            System.out.println("-------------------------------");
            return;
        }

        for (int i = 0; i < ar.size(); i++) {
            if (used[i])
                continue; // Skip already used elements

            used[i] = true; // Mark element as used
            ans.add(ar.get(i)); // Add to current permutation

            System.out.println("Consumed: " + ar.get(i) + " | Current: " + ans);

            getAllPermutationsClean(ar, ans, used);

            // Backtrack - undo changes
            used[i] = false;
            ans.remove(ans.size() - 1);
        }
    }

    private static void getAllPermutationsRepeatingnums(List<Integer> ar, List<Integer> ans, boolean[] used) {
        if (ans.size() == ar.size()) { // Base condition: all elements used
            System.out.println(ans);
            System.out.println("-------------------------------");
            return;
        }

        for (int i = 0; i < ar.size(); i++) {
            if (used[i])
                continue; // Skip already used elements

               //first occurance must be used before using hte second occurance
            if (i > 0 && used[i - 1] != true && ar.get(i - 1) == ar.get(i))
                continue;
            used[i] = true; // Mark element as used
            ans.add(ar.get(i)); // Add to current permutation

            // System.out.println("Consumed: " + ar.get(i) + " | Current: " + ans);

            getAllPermutationsRepeatingnums(ar, ans, used);

            // Backtrack - undo changes
            used[i] = false;
            ans.remove(ans.size() - 1);
        }
    }

}
