package leetcode.movezeroes.method2;

public class MoveZeroes {

    /**
     * Worst case we will to have a
     *      Complexity: O(N)
     *      Space: O(N) The space increases to N respect the method 1 due to the recursive leftRotation method
     *
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        int rotations = 0;

        for (int i = 0; i < nums.length - rotations; i++) {
            if(nums[i] == 0) {
                leftRotation(nums, i, nums.length, nums[i]);
                rotations++;
                i--;
            }
        }
    }

    public static void leftRotation(int[] array, int initIndex, int endIndex, int tmp) {
        if(initIndex + 1 == endIndex) {
            array[initIndex] = tmp;
            return;
        }

        array[initIndex] = array[initIndex+1];
        leftRotation(array, initIndex+1, endIndex, tmp);
    }

}
