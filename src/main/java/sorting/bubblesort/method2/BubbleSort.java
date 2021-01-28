package sorting.bubblesort.method2;

public class BubbleSort {

    /**
     * Using two for loops we have
     *      Complexity: O(N^2) Still we have N square
     *      Space: O(1) Unlike the recursion approach, here we have constant space
     * @param array
     */
    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    swap(array, i, j);
                }
            }
        }
    }

    private void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

}
