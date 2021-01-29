package common;

import org.junit.Assert;
import org.junit.Test;

public class UtilsTest {

    @Test
    public void testSwap() {
        int[] expectedArray = new int[]{1,2,3};

        int[] inputArray = new int[]{2,1,3};
        Utils.swap(inputArray, 0, 1);

        Assert.assertArrayEquals(expectedArray, inputArray);
    }

}
