package Algo;

public class SubArraySum {
    /*
     * Given an array of integers nums and an integer k,
     * return the total number of subarrays whose sum equals to k.
     *
     * A subarray is a contiguous non-empty sequence of elements within an array.
     *
     * Example 1:
     * Input: nums = [1,1,1], k = 2
     * Output: 2
     *
     * Example 2:
     * Input: nums = [1,2,3], k = 3
     * Output: 2
     */
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 0, 0 };
        int k = 2;

        // Wrong soultion we can use SLiding window because if we get a negative number
        // the slidng window breaks >> SLIDING WINDOW CAN WORK WHEN WE HAVE NEGATIVE
        // NUMBERS AS THEY BREAK THE CORE PRINCIPLE OF USING THE SLIDING WINDOW HERE
        int left = 0, right = -1, sum = 0, ans = 0;
        while (left < nums.length && right < nums.length) {
            if (sum < k) {
                right++;
                if (right >= nums.length)
                    break;
                sum += nums[right];
            } else {
                if (sum == k)
                    ans++;
                if (left == right) {
                    right++;
                    if (right >= nums.length)
                        break;
                    sum += nums[right];
                } else if (sum > k) {
                    sum -= nums[left];
                    left++;
                } else {
                    right++;
                }
            }
        }
        System.out.println("ANS IS " + ans);

    }
}