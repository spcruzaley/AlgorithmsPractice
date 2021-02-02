package leetcode.rotatearray.method2;

public class RotateArray {

    /**
     * Using a brute force, but instead to use a nested loop, we can use System.arraycopy, even this approach gives a N^2
     * it's more faster if we use nested loop.
     *
     *      Complexity: O(N^2)
     *      Space: O(1)
     *
     * NOTE: System.arraycopy has a complexity of O(length), internally it traverse, in this case, all the array
     * in order to generate the copy.
     *
     * @param nums
     * @param k
     */
    public static void rotate(int[] nums, int k) {
        if(k == 0) return;
        if(k % nums.length == 0) return;
        if(k > nums.length) k %= nums.length;

        for (int i = 0; i < k; i++) {
            int tmp = nums[nums.length - 1];
            System.arraycopy(nums, 0, nums, 1, nums.length - 1);
            nums[0] = tmp;
        }
    }

}
