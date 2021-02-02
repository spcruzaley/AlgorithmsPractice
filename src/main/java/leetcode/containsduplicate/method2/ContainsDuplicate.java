package leetcode.containsduplicate.method2;

import java.util.Arrays;

public class ContainsDuplicate {

    /**
     * Sorting the array we can avoid to use extra space, however the complexity increases
     *      Complexity: O(N log N) Due to sort algorithm
     *      Space: O(1)
     *
     * @param nums
     * @return
     */
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1])
                return true;
        }

        return false;
    }

}
