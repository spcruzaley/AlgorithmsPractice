package sorting.mergesort.method1;

import java.util.Arrays;

public class MergeSort {

    /**
     * Sort an array using a first approach that takes
     *      Complexity as: O(N log(N))
     *      Space as: O(N log(N))
     *
     * See (/src/test/java/sorting/mergesort/method1/MergeSortTest.java) for test cases
     *
     * @param array
     * @return
     */
    public int[] mergeSort(int[] array) {
        if(array.length == 1)
            return array;

        int middleIndex = array.length / 2;
        int[] leftArray = Arrays.copyOfRange(array, 0, middleIndex);
        int[] rightArray = Arrays.copyOfRange(array, middleIndex, array.length);

        return mergeSortedArrays(mergeSort(leftArray), mergeSort(rightArray));
    }

    public int[] mergeSortedArrays(int[] leftArray, int[] rightArray) {
        int[] sortedArray = new int[leftArray.length+rightArray.length];
        System.arraycopy(leftArray, 0, sortedArray, 0, leftArray.length);
        System.arraycopy(rightArray, 0, sortedArray, leftArray.length, rightArray.length);

        int current = 0;
        int left = 0;
        int right = 0;

        while (left < leftArray.length && right < rightArray.length) {
            if(leftArray[left] < rightArray[right]) {
                sortedArray[current++] = leftArray[left++];
            } else {
                sortedArray[current++] = rightArray[right++];
            }
        }

        while(left < leftArray.length)
            sortedArray[current++] = leftArray[left++];

        while(right < rightArray.length)
            sortedArray[current++] = rightArray[right++];

        return sortedArray;
    }

}
