package DP;

import java.util.HashMap;
import java.util.Map;

public class StairCase {
    /*
     * You are climbing a staircase. It takes N steps to reach the top.
     * Each time, you can either climb 1 step or 2 steps.
     * In how many distinct ways can you reach the top?
     */

    static int waysToClimb = 0;

    public static void main(String[] args) {
        int totalSteps = 4;
        climb(totalSteps, 0);
        System.out.println("Total Ways >>>" + waysToClimb);
        System.out.println("Ways >>" + climbMemo(totalSteps, 0));
        System.out.println(memo);
    }

    private static void climb(int finalStep, int onStep) {
        if (finalStep == onStep) {
            waysToClimb++;
            return;
        }

        if (onStep > finalStep)
            return;

        // take one step
        climb(finalStep, onStep + 1);
        // take two steps
        climb(finalStep, onStep + 2);
    }

    // Memoization
    /*
     * Here what we do is we found ways to reach to FinalStep from a given step and
     * we store it in a array and every time we reach that step again we just fetch
     * ways to reach final step from that step and add it directly.
     */
    static Map<Integer, Integer> memo = new HashMap<>();

    private static int climbMemo(int finalStep, int onStep) {
        if (onStep > finalStep)
            return 0; // Out of bounds
        if (onStep == finalStep)
            return 1; // Reached the top

        if (memo.containsKey(onStep)) {
            System.out.println("Found value for " + onStep + " as " + memo.get(onStep));
            return memo.get(onStep);
        }

        // taking one steps
        int wayOne = climbMemo(finalStep, onStep + 1);
        // taking two steps
        int wayTwo = climbMemo(finalStep, onStep + 2);

        memo.put(onStep, wayOne + wayTwo);
        return wayOne + wayTwo;

    }

}
