package sorting.selection;

public class SelectionSort {

    /**
     * Complexity: O(N^2) in average/worst case, O(N) in the best case
     * Space: O(1)
     *
     * @param array
     * @return
     */
    public static int[] selectionSort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int currentPointer = i;

            for(int j = i + 1; j < array.length; j++) {
                if(array[currentPointer] > array[j]) {
                    currentPointer = j;
                }
            }

            int tmp = array[i];
            array[i] = array[currentPointer];
            array[currentPointer] = tmp;
        }

        return array;
    }

}
