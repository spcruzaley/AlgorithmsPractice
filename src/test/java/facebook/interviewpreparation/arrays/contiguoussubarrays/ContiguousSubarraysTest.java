package facebook.interviewpreparation.arrays.contiguoussubarrays;

import org.junit.Assert;
import org.junit.Test;

public class ContiguousSubarraysTest {

    @Test
    public void testCountSubarraysTestOne() {
        int[] expectedResult = {1, 3, 1, 5, 1};

        int[] input = {3, 4, 1, 6, 2};
        int[] actualResult = ContiguousSubarrays.countSubarrays(input);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountSubarraysTestTwo() {
        int[] expectedResult = {1, 2, 6, 1, 3, 1};

        int[] input = {2, 4, 7, 1, 5, 3};
        int[] actualResult = ContiguousSubarrays.countSubarrays(input);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    //Testing helper methods
    @Test
    public void testCheckContiguousToLeftWithIndexInZero() {
        int expectedResult = 0;

        int[] inputArray = {3, 4, 1, 6, 2};
        int actualResult = ContiguousSubarrays.checkContiguous(inputArray, 0, -1
                , 0, ContiguousSubarrays.leftValidation);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCheckContiguousToLeftWithIndexArrayLength() {
        int expectedResult = 0;

        int[] inputArray = {3, 4, 1, 6, 2};
        int actualResult = ContiguousSubarrays.checkContiguous(inputArray, inputArray.length - 1, -1
                ,0, ContiguousSubarrays.leftValidation);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCheckContiguousToRightWithIndexInZero() {
        int expectedResult = 0;

        int[] inputArray = {3, 4, 1, 6, 2};
        int actualResult = ContiguousSubarrays.checkContiguous(inputArray, 0, 1
                , inputArray.length, ContiguousSubarrays.rightValidation);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCheckContiguousToRightWithIndexArrayLength() {
        int expectedResult = 0;

        int[] inputArray = {3, 4, 1, 6, 2};
        int actualResult = ContiguousSubarrays.checkContiguous(inputArray, inputArray.length - 1, 1
                , inputArray.length, ContiguousSubarrays.rightValidation);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCheckContiguousToLeft() {
        int expectedResult = 3;

        int[] inputArray = {3, 4, 1, 6, 2};
        int actualResult = ContiguousSubarrays.checkContiguous(inputArray, 3, -1
                , 0, ContiguousSubarrays.leftValidation);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCheckContiguousToRight() {
        int expectedResult = 1;

        int[] inputArray = {3, 4, 1, 6, 2};
        int actualResult = ContiguousSubarrays.checkContiguous(inputArray, 1, 1
                , inputArray.length, ContiguousSubarrays.rightValidation);

        Assert.assertEquals(expectedResult, actualResult);
    }

}
