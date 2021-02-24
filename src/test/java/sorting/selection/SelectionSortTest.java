package sorting.selection;

import org.junit.Assert;
import org.junit.Test;

public class SelectionSortTest {

    @Test
    public void testSort() {
        int[] expectedOutput = new int[]{0,2,3,5,7,9};

        int[] inputArray = new int[]{5,9,2,0,3,7};
        SelectionSort.selectionSort(inputArray);

        Assert.assertArrayEquals(expectedOutput, inputArray);
    }

    @Test
    public void testSort_WithRepeatedElements() {
        int[] expectedOutput = new int[]{0,2,2,3,5,7,9};

        int[] inputArray = new int[]{5,9,2,0,3,7,2};
        SelectionSort.selectionSort(inputArray);

        Assert.assertArrayEquals(expectedOutput, inputArray);
    }

    @Test
    public void testSort_WithNegativeElements() {
        int[] expectedOutput = new int[]{-8,-5,-3,-1,0,2,2,3,5,7,9};

        int[] inputArray = new int[]{-8,5,9,2,-5,0,3,-3,7,-1,2};
        SelectionSort.selectionSort(inputArray);

        Assert.assertArrayEquals(expectedOutput, inputArray);
    }

}
