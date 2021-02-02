package leetcode.twosum.method2;

import java.util.HashSet;
import java.util.Set;

public class TwoSum {

    /**
     * Second solution using space helper to reduce the complexity, thus we have
     *      Complexity: O(N)
     *      Space: O(N)
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        Set<Integer> set = new HashSet<>();
        int[] twoSum = new int[2];

        for(int i = 0; i < nums.length; i++) {
            int potentialMatch = target - nums[i];

            if(set.contains(potentialMatch)) {
                twoSum[0] = i;
                twoSum[1] = potentialMatch;
            } else {
                set.add(nums[i]);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(i != twoSum[0] && nums[i] == twoSum[1]) {
                twoSum[1] = i;
                break;
            }
        }

        return twoSum;
    }

}
