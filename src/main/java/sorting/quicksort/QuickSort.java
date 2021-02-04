package sorting.quicksort;

import common.Utils;

public class QuickSort {

    /**
     * Quick sort deals dividing the array in two from a given pivot, the complexity could variate
     *
     *  Best case:
     *      - Complexity O(N log (N))
     *      - Space O(log(N)
     *  Average case:
     *      - Complexity O(N log (N))
     *      - Space O(log(N)
     *  Worst case:
     *      - Complexity O(N^2)
     *      - Space O(log(N)
     *
     * See (/src/test/java/sorting/quicksort/QuickSortTest.java) for test cases
     *
     * @param array
     * @param leftIndex
     * @param rightIndex
     */
    public static void quickSort(int[] array, int leftIndex, int rightIndex) {
        if(leftIndex >= rightIndex) //base case
            return;

        int pivot = leftIndex;
        leftIndex++;

        while(rightIndex >= leftIndex) {
            if(array[leftIndex] > array[pivot] && array[rightIndex] < array[pivot]) {
                Utils.swap(array, leftIndex, rightIndex);
            } else if(array[leftIndex] <= array[pivot]) {
                leftIndex++;
            } else {
                rightIndex--;
            }
        }

        Utils.swap(array, pivot, rightIndex);

        //Call to left sub array
        quickSort(array, pivot, rightIndex - 1);
        //Call to right sub array
        quickSort(array, leftIndex, array.length-1);
    }

}
