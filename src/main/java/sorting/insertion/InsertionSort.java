package sorting.insertion;

public class InsertionSort {

    /**
     * Complexity: O(N^2) in average/worst case, O(N) in the best case
     * Space: O(1)
     *
     * @param array
     * @return
     */
    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int k = i;
            for (int j = i - 1; j >= 0; j--) {
                if (array[k] < array[j]) {
                    swap(array, k--, j);
                } else {
                    break;
                }
            }
        }

        return array;
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
