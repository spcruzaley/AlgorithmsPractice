package leetcode.rotatearray.method1;

import common.Utils;
import leetcode.rotatearray.method1.RotateArray;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class RotateArrayTest {

    @Test
    public void testRotateFirstTest() {
        int[] expectedArray = new int[]{4,1,2,3};

        int[] actualArray = new int[]{1,2,3,4};
        RotateArray.rotate(actualArray, 1);

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

}
