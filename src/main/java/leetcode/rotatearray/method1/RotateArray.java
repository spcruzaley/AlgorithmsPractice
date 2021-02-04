package leetcode.rotatearray.method1;

public class RotateArray {

    /**
     * Approach using a recursion helper method
     *      Complexity: O(N)
     *      Space: O(N)
     *      NOTE: Not feasible for a big number array dut to the stack, it could crashes
     *
     * See (/src/test/java/leetcode/rotatearray/method1/RotateArrayTest.java) for test cases
     *
     * @param nums
     * @param k
     */
    public static void rotate(int[] nums, int k) {
        if(k == 0) return;
        if(k % nums.length == 0) return;
        if(k > nums.length) k %= nums.length;

        for (int i = 0; i < k; i++) {
            rightRotation(nums, nums.length - 1, nums[nums.length - 1]);
        }
    }

    public static void rightRotation(int[] array, int endIndex, int tmp) {
        if(endIndex == 0) {
            array[endIndex] = tmp;
            return;
        }

        array[endIndex] = array[endIndex-1];
        rightRotation(array, endIndex-1, tmp);
    }

}
