package sorting.mergesort.method1;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortTest {

    @Test
    public void testMergeSort() {
        int[] expectedArray = new int[]{1,2,3,4,6,8,9};

        MergeSort mergeSort = new MergeSort();
        int[] array = new int[]{8,1,6,9,4,3,2};
        int[] actualArray = mergeSort.mergeSort(array);

        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testMergedSortedArrays_WhenRightArrayHasMoreElementsThanLeftArray() {
        int[] expectedArray = new int[]{2,4,6,8,9,10,11};

        int[] leftArray = new int[]{2,4};
        int[] rightArray = new int[]{6,8,9,10,11};
        int[] actualArray = new MergeSort().mergeSortedArrays(leftArray, rightArray);

        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testMergedSortedArrays_WhenLeftArrayHasMoreElementsThanRightArray() {
        int[] expectedArray = new int[]{-5,-2,0,2,4,7,6,9,10,14};

        int[] leftArray = new int[]{2,4,7,6,9,10,14};
        int[] rightArray = new int[]{-5,-2,0};
        int[] actualArray = new MergeSort().mergeSortedArrays(leftArray, rightArray);

        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testMergedSortedArrays_WhenLeftArrayAndRightArrayHasSameElementsNumber() {
        int[] expectedArray = new int[]{-5,-2,0,1,2,4,7,6};

        int[] leftArray = new int[]{2,4,7,6};
        int[] rightArray = new int[]{-5,-2,0,1};
        int[] actualArray = new MergeSort().mergeSortedArrays(leftArray, rightArray);

        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testMergedSortedArrays_WhenLeftArrayAndRightArrayHasOnlyOneElement() {
        int[] expectedArray = new int[]{4,9};

        int[] leftArray = new int[]{9};
        int[] rightArray = new int[]{4};
        int[] actualArray = new MergeSort().mergeSortedArrays(leftArray, rightArray);

        Assert.assertArrayEquals(expectedArray, actualArray);
    }

}
