package Algo;

import java.util.HashMap;

/*
 * Given a string s, find the length of the longest substring without duplicate
 * characters.
 *
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 *
 * Example 2:
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 *
 *
 * Example 3:
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a
 * substring.
 *
 */
public class LongestSubString {
    public static void main(String[] args) {
        String s = "abcadeca"; //
        System.out.println(easyWayOut(s));
        System.out.println(optimalSlidingWindow(s));
        System.out.println("----------------");
        System.out.println(longestSubString(s));
    }

    public static int easyWayOut(String s) {
        int max = 0; // abcadeca
        for (int i = 0; i < s.length(); i++) {
            int charAtI = (s.charAt(i) - 97);
            for (int j = i + 1; j < s.length(); j++) {
                int charAtj = (s.charAt(j) - 97);
                if (charAtI == charAtj) { //
                    if ((j - i + 1) > max)
                        max = (j - i + 1);
                    break;
                }
            }
        }
        return max;
    }

    public static int longestSubString(String s) {
        // a b c a d e ca map = (b,1),c,2 a,3 d,4 e,5
        // p w w kew
        // lengthUniqueSubString = 5
        int max = 1; // 3
        HashMap<Character, Integer> map = new HashMap<>();
        int lengthUniqueSubString = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) { // 1
            // int num = (s.charAt(i) - 97 /* ASCII for a */);
            char character = s.charAt(i);
            if (map.containsKey(character)) {
                System.out.println(ans + " Length of string formed " + lengthUniqueSubString);
                i = map.get(character); // 0+1
                System.out.println("Again Starting from " + i + " char found : " + character);
                if (max < lengthUniqueSubString)
                    max = lengthUniqueSubString;
                lengthUniqueSubString = 0;
                ans = "";
                map = new HashMap<>();
            } else {
                map.put(character, i);
                lengthUniqueSubString++;
                ans = ans + character;
            }
        }
        return max;
    }

    private static int optimalSlidingWindow(String s) {
        int left = 0;
        int maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            if (map.containsKey(s.charAt(right)) && map.get(s.charAt(right)) >= left) {
                left = map.get(s.charAt(right)) + 1;
            }
            map.put(s.charAt(right), right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

}