package sorting.mergesort.method2;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortTest {

    @Test
    public void testMergeSort() {
        int[] expectedArray = new int[]{1,2,3};

        int[] array = new int[]{3,2,1};
        new MergeSort().mergeSort(array);

        Assert.assertArrayEquals(expectedArray, array);
    }

}
