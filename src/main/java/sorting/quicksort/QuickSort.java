package sorting.quicksort;

import common.Utils;

public class QuickSort {

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
