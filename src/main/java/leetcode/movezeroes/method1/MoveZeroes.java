package leetcode.movezeroes.method1;

public class MoveZeroes {

    /**
     * Worst case we will to have a
     *      Complexity: O(N^2)
     *      Space: O(1)
     *
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        int rotations = 0;

        for (int i = 0; i < nums.length - rotations; i++) {
            if(nums[i] == 0) {
                leftRotation(nums, i, nums.length);
                rotations++;
                i--;
            }
        }
    }

    public static void leftRotation(int[] array, int initIndex, int endIndex) {
        for (int i = initIndex; i < endIndex - 1; i++) {
            int tmp = array[i];
            array[i] = array[i+1];
            array[i+1] = tmp;
        }
    }
}
