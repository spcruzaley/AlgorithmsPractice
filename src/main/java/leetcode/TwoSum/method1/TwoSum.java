package leetcode.TwoSum.method1;

public class TwoSum {

    /**
     * First solution using brute force, as
     *      Complexity: O(N^2)
     *      Space: O(1)
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[j] == target - nums[i])
                    return new int[]{i,j};
            }
        }

        return new int[0];
    }

}
