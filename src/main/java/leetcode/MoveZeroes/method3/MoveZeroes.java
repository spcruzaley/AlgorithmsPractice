package leetcode.MoveZeroes.method3;

public class MoveZeroes {

    /**
     * Best solution taken from LeetCode solutions
     *      Complexity: O(N)
     *      Space: O(1)
     *
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        int matchedWithZero = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[matchedWithZero++] = nums[i];
            }
        }

        for (int i = matchedWithZero; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

}
