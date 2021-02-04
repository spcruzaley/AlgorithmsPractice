package sorting.mergesort.method2;

import java.util.Arrays;

public class MergeSort {

    /**
     * Sort an array using a second approach that takes
     *      Complexity as: O(N log(N))
     *      Space as: O(N) - Less than the first approach
     *
     * See (/src/test/java/sorting/mergesort/method2/MergeSortTest.java) for test cases
     *
     * @param array
     * @return
     */
    public int[] mergeSort(int[] array) {
        if(array.length == 1)
            return array;

        int[] auxArray = Arrays.copyOf(array, array.length);
        mergeSortHelper(array, 0, array.length - 1, auxArray);

        return array;
    }

    private void mergeSortHelper(int[] mainArray, int startIndex, int endIndex, int[] auxArray) {
        if(startIndex == endIndex)
            return;

        int middleIndex = (startIndex + endIndex) / 2;

        mergeSortHelper(auxArray, startIndex, middleIndex, mainArray);
        mergeSortHelper(auxArray, middleIndex + 1, endIndex, mainArray);

        doMerge(mainArray, startIndex, middleIndex, endIndex, auxArray);
    }

    private void doMerge(int[] mainArray, int startIndex, int middleIndex, int endIndex, int[] auxArray) {
        int current = startIndex;
        int left = startIndex;
        int right = middleIndex + 1;

        while(left <= middleIndex && right <= endIndex) {
            if(auxArray[left] < auxArray[right]) {
                mainArray[current++] = auxArray[left++];
            } else {
                mainArray[current++] = auxArray[right++];
            }
        }

        while (left <= middleIndex)
            mainArray[current++] = auxArray[left++];

        while (right <= endIndex)
            mainArray[current++] = auxArray[right++];
    }

}
