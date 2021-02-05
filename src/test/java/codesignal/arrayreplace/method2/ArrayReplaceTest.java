package codesignal.arrayreplace.method2;

import org.junit.Assert;
import org.junit.Test;

public class ArrayReplaceTest {

    @Test
    public void testArrayReplaceFirstTest() {
        int[] expectedArray = new int[]{1, 2, 1, 4, 5, 1};

        int[] inputArray = new int[]{1, 2, 3, 4, 5, 3};
        int[] actualArray = ArrayReplace.arrayReplace(inputArray, 3, 1);

        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testArrayReplaceSecondTest() {
        int[] expectedArray = new int[]{10, 10, 10};

        int[] inputArray = new int[]{2, 2, 2};
        int[] actualArray = ArrayReplace.arrayReplace(inputArray, 2, 10);

        Assert.assertArrayEquals(expectedArray, actualArray);
    }

}
