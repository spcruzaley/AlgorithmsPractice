package sorting.mergesort.method2;

import common.Log;
import org.junit.Assert;
import org.junit.Test;

public class MergeSortTest {

    @Test
    public void testMergeSort() {
        int[] expectedArray = new int[]{1,2,3};

        int[] array = new int[]{3,2,1};
        int[] actualArray = new MergeSort().mergeSort(array);

        Log.log(expectedArray);
        Log.log(array);
        Log.log(actualArray);

        Assert.assertArrayEquals(expectedArray, array);
    }

}
