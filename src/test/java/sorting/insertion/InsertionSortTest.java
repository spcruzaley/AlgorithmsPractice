package sorting.insertion;

import org.junit.Assert;
import org.junit.Test;

public class InsertionSortTest {

    @Test
    public void testSort() {
        int[] expectedOutput = new int[]{0,2,3,5,7,9};

        int[] inputArray = new int[]{5,9,2,0,3,7};
        InsertionSort.insertionSort(inputArray);

        Assert.assertArrayEquals(expectedOutput, inputArray);
    }

    @Test
    public void testSort_WithRepeatedElements() {
        int[] expectedOutput = new int[]{0,2,2,3,5,7,9};

        int[] inputArray = new int[]{5,9,2,0,3,7,2};
        InsertionSort.insertionSort(inputArray);

        Assert.assertArrayEquals(expectedOutput, inputArray);
    }

    @Test
    public void testSort_WithNegativeElements() {
        int[] expectedOutput = new int[]{-8,-5,-3,-1,0,2,2,3,5,7,9};

        int[] inputArray = new int[]{-8,5,9,2,-5,0,3,-3,7,-1,2};
        InsertionSort.insertionSort(inputArray);

        Assert.assertArrayEquals(expectedOutput, inputArray);
    }

}
