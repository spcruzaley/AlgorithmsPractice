package sorting.bubblesort.method1;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void testSort() {
        int[] expectedOutput = new int[]{0,2,3,5,7,9};

        int[] inputArray = new int[]{5,9,2,0,3,7};
        new BubbleSort().sort(inputArray);

        Assert.assertArrayEquals(expectedOutput, inputArray);
    }

    @Test
    public void testSort_WithRepeatedElements() {
        int[] expectedOutput = new int[]{0,2,2,3,5,7,9};

        int[] inputArray = new int[]{5,9,2,0,3,7,2};
        new BubbleSort().sort(inputArray);

        Assert.assertArrayEquals(expectedOutput, inputArray);
    }

}
