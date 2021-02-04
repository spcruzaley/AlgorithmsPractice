package leetcode.containsduplicate.method1;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    /**
     * First approach using a Set as a helper
     *      Complexity: O(N)
     *      Space: O(N)
     *
     * See (/src/test/java/leetcode/containsduplicate/method1/ContainsDuplicateTest.java) for test cases
     *
     * @param nums
     * @return
     */
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if(uniqueNumbers.contains(nums[i]))
                return true;
            else
                uniqueNumbers.add(nums[i]);
        }

        return false;
    }

}
