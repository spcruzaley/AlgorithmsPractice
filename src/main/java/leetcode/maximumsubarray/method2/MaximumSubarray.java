package leetcode.maximumsubarray.method2;

import java.util.Arrays;

public class MaximumSubarray {

    /**
     * Second solution with a different approach
     *      Complexity: O(N)
     *      Space: O(1)
     *
     * See (/src/test/java/leetcode/maximumsubarray/method2/MaximumSubarrayTest.java) for test cases
     *
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        boolean allNegatives = Arrays.stream(nums).allMatch(i -> i < 0);
        if(allNegatives) {
            for (int i = 0; i < nums.length; i++) {
                max = Math.max(max, nums[i]);
                sum += nums[i];
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (sum + nums[i] >= 0) {
                    sum += nums[i];
                    max = Math.max(max, sum);
                } else {
                    sum = 0;
                }
            }
        }

        return max;
    }

}
