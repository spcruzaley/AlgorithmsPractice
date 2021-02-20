package facebook.interviewpreparation.arrays.areequals.method2;

import java.util.Arrays;

public class ReverseToMakeEqual {

    /**
     * Complexity: O(N log(N)) Arrays class offer a method `sort(int[] arr)` to sort the array, it takes n log(n), so
     *              in this case that would be the complexity.
     * Space: O(1)
     *
     * @param array_a
     * @param array_b
     * @return
     */
    public static boolean areTheyEqual(int[] array_a, int[] array_b) {
        // Write your code here
        if(array_a.length != array_b.length)
            return false;

        Arrays.sort(array_a);
        Arrays.sort(array_b);

        return Arrays.equals(array_a, array_b);
    }

}
