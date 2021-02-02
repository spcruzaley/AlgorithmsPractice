package leetcode.twosum.method2;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TwoSumTest {

    @Test
    public void testTwoSumAllPositives() {
        int[] expectedOutput = new int[]{2,4};
        int[] arrayInput = new int[]{2,5,7,9,3,4};
        int target = 10;

        int[] actualOutput = TwoSum.twoSum(arrayInput, target);

        Arrays.sort(actualOutput);
        Assert.assertArrayEquals("Expected Array: " + Arrays.toString(expectedOutput)
                        + " - Actual array: " + Arrays.toString(actualOutput),
                expectedOutput, actualOutput);
    }

    @Test
    public void testTwoSumWithNegativeInArrayFirstTest() {
        int[] expectedOutput = new int[]{0,3};
        int[] arrayInput = new int[]{-2,5,7,8,3,4};
        int target = 6;

        int[] actualOutput = TwoSum.twoSum(arrayInput, target);

        Arrays.sort(actualOutput);
        Assert.assertArrayEquals("Expected Array: " + Arrays.toString(expectedOutput)
                        + " - Actual array: " + Arrays.toString(actualOutput),
                expectedOutput, actualOutput);
    }

    @Test
    public void testTwoSumWithNegativeInArraySecondTest() {
        int[] expectedOutput = new int[]{0,4};
        int[] arrayInput = new int[]{4,3,7,9,-3,5};
        int target = 1;

        int[] actualOutput = TwoSum.twoSum(arrayInput, target);

        Arrays.sort(actualOutput);
        Assert.assertArrayEquals("Expected Array: " + Arrays.toString(expectedOutput)
                        + " - Actual array: " + Arrays.toString(actualOutput),
                expectedOutput, actualOutput);
    }

    @Test
    public void testTwoSumWithZeroTargetFirstTest() {
        int[] expectedOutput = new int[]{1,4};
        int[] arrayInput = new int[]{2,3,7,9,-3,5};
        int target = 0;

        int[] actualOutput = TwoSum.twoSum(arrayInput, target);

        Arrays.sort(actualOutput);
        Assert.assertArrayEquals("Expected Array: " + Arrays.toString(expectedOutput)
                        + " - Actual array: " + Arrays.toString(actualOutput),
                expectedOutput, actualOutput);
    }

    @Test
    public void testTwoSumWhenTargetIsNegativeFirstTest() {
        int[] expectedOutput = new int[]{0,4};
        int[] arrayInput = new int[]{2,3,7,9,-5,4,3};
        int target = -3;

        int[] actualOutput = TwoSum.twoSum(arrayInput, target);

        Arrays.sort(actualOutput);
        Assert.assertArrayEquals("Expected Array: " + Arrays.toString(expectedOutput)
                        + " - Actual array: " + Arrays.toString(actualOutput),
                expectedOutput, actualOutput);
    }

    @Test
    public void testTwoSumWhenTargetIsNegativeSecondTest() {
        int[] expectedOutput = new int[]{1,3};
        int[] arrayInput = new int[]{2,-13,7,6,-5,4,3};
        int target = -7;

        int[] actualOutput = TwoSum.twoSum(arrayInput, target);

        Arrays.sort(actualOutput);
        Assert.assertArrayEquals("Expected Array: " + Arrays.toString(expectedOutput)
                        + " - Actual array: " + Arrays.toString(actualOutput),
                expectedOutput, actualOutput);
    }

    @Test
    public void testTwoSumWhenAllAreNegatives() {
        int[] expectedOutput = new int[]{2,3};
        int[] arrayInput = new int[]{-2,-15,-7,-6,-5,-4,-3};
        int target = -13;

        int[] actualOutput = TwoSum.twoSum(arrayInput, target);

        Arrays.sort(actualOutput);
        Assert.assertArrayEquals("Expected Array: " + Arrays.toString(expectedOutput)
                        + " - Actual array: " + Arrays.toString(actualOutput),
                expectedOutput, actualOutput);
    }

    @Test
    public void testTwoSumLeetCodeOne() {
        int[] expectedOutput = new int[]{2,4};
        int[] arrayInput = new int[]{3,2,95,4,-3};
        int target = 92;

        int[] actualOutput = TwoSum.twoSum(arrayInput, target);

        Arrays.sort(actualOutput);
        Assert.assertArrayEquals("Expected Array: " + Arrays.toString(expectedOutput)
                        + " - Actual array: " + Arrays.toString(actualOutput),
                expectedOutput, actualOutput);
    }

    @Test
    public void testTwoSumLeetCodeTwo() {
        int[] expectedOutput = new int[]{0,1};
        int[] arrayInput = new int[]{-18,12,3,0};
        int target = -6;

        int[] actualOutput = TwoSum.twoSum(arrayInput, target);

        Arrays.sort(actualOutput);
        Assert.assertArrayEquals("Expected Array: " + Arrays.toString(expectedOutput)
                        + " - Actual array: " + Arrays.toString(actualOutput),
                expectedOutput, actualOutput);
    }

}
