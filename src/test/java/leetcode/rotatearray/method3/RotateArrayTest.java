package leetcode.rotatearray.method3;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class RotateArrayTest {

    @Test
    public void testRotateFirstTest() {
        int[] expectedArray = new int[]{4,1,2,3};

        int[] actualArray = new int[]{1,2,3,4};
        RotateArray.rotate(actualArray, 1);

        System.out.println(Arrays.toString(actualArray));

        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testRotateSecondTest() {
        int[] expectedArray = new int[]{3,4,1,2};

        int[] actualArray = new int[]{1,2,3,4};
        RotateArray.rotate(actualArray, 2);

        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testRotateRotatingMoreThanArrayLengthTimes() {
        int[] expectedArray = new int[]{3,4,1,2};

        int[] actualArray = new int[]{1,2,3,4};
        RotateArray.rotate(actualArray, 6);

        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testRotateRotatingMoreThanArrayLengthTimesTwo() {
        int[] expectedArray = new int[]{1,2};

        int[] actualArray = new int[]{1,2};
        RotateArray.rotate(actualArray, 2);

        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    //Test helper methods
    @Test
    public void testReverse() {
        int[] expectedArray = new int[]{5,4,3,2,1};

        int[] actualArray = new int[]{1,2,3,4,5};
        RotateArray.reverse(actualArray, 0, actualArray.length - 1);

        Assert.assertArrayEquals(expectedArray, actualArray);
    }
}
