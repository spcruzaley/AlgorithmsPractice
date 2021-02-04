package leetcode.rotatearray.method3;

public class RotateArray {

    /**
     * Approach copied from LeetCode solutions section
     *      Complexity: O(N)
     *      Space: O(1)
     *
     * See (/src/test/java/leetcode/rotatearray/method3/RotateArrayTest.java) for test cases
     *
     * @param nums
     * @param k
     */
    public static void rotate(int[] nums, int k) {
        if(k == 0) return;
        if(k % nums.length == 0) return;
        if(k > nums.length) k %= nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int tmp = array[start];
            array[start++] = array[end];
            array[end--] = tmp;
        }
    }

}
