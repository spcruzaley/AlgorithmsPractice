package leetcode.maximumsubarray.method2;

import org.junit.Assert;
import org.junit.Test;

public class MaximumSubarrayTest {

    @Test
    public void testMaxSubArray() {
        int expectedMax = 6;
        int[] inputArray = new int[]{-2,1,-3,4,-1,2,1,-5,4};

        int actualMax = MaximumSubarray.maxSubArray(inputArray);

        Assert.assertEquals(expectedMax, actualMax);
    }

    @Test
    public void testMaxSubArrayWithAllNegatives() {
        int expectedMax = -1;
        int[] inputArray = new int[]{-2,-1,-3,-4,-1,-2,-1,-5,-4};

        int actualMax = MaximumSubarray.maxSubArray(inputArray);

        Assert.assertEquals(expectedMax, actualMax);
    }

    @Test
    public void testMaxSubArrayWithOnlyOnePositive() {
        int expectedMax = 1;
        int[] inputArray = new int[]{-2,-1,-3,-4,1,-2,-1,-5,-4};

        int actualMax = MaximumSubarray.maxSubArray(inputArray);

        Assert.assertEquals(expectedMax, actualMax);
    }

}
