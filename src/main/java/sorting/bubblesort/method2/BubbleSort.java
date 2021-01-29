package sorting.bubblesort.method2;

import common.Utils;

public class BubbleSort {

    /**
     * Using two for loops we have
     *      Complexity: O(N^2) Still we have N square
     *      Space: O(1) Unlike the recursion approach, here we have constant space
     * @param array
     */
    public void sort(int[] array) {
        boolean sorted = false;
        int cont = 0;

        while(!sorted) {
            sorted = true;

            for (int i = 0; i < array.length - 1 - cont; i++) {
                if (array[i] > array[i + 1]) {
                    Utils.swap(array, i, i + 1);
                    sorted = false;
                }
            }
            cont++;
        }
    }

}
