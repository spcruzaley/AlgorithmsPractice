package sorting.quicksort;

import org.junit.Assert;
import org.junit.Test;

public class QuickSortTest {

    @Test
    public void testQuickSort() {
        int[] expectedArray = new int[]{1,3,4,5,6,8};

        int[] inputArray = new int[]{3,6,4,5,8,1};
        QuickSort.quickSort(inputArray, 0, inputArray.length - 1);

        Assert.assertArrayEquals(expectedArray, inputArray);
    }

    @Test
    public void testQuickSortSecondTest() {
        int[] expectedArray = new int[]{2,3,5,5,6,8,9};

        int[] inputArray = new int[]{8,5,2,9,5,6,3};
        QuickSort.quickSort(inputArray, 0, inputArray.length - 1);

        Assert.assertArrayEquals(expectedArray, inputArray);
    }

}
