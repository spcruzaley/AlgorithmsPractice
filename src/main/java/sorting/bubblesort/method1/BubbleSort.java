package sorting.bubblesort.method1;

import common.Utils;

public class BubbleSort {

    /**
     * Bubble sort using recursion approach takes
     *      Complexity: O(N^2)
     *      Space: O(N) due to the recursion, we will to have in stack N - 1 levels
     *
     * See (/src/test/java/sorting/bubblesort/method1/BubbleSortTest.java) for test cases
     *
     * @param array
     */
    public void sort(int[] array) {
        bubbleSort(array, 0);
    }

    public static void bubbleSort(int[] array, int i) {
        if (i == array.length)
            return;

        for (int j = i + 1; j < array.length; j++) {
            if (array[j] < array[i]) {
                Utils.swap(array, i, j);
            }
        }

        bubbleSort(array, i + 1);
    }

}
