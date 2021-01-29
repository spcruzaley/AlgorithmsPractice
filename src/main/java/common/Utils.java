package common;

public class Utils {

    /**
     * Swap two values in a given int array
     *
     * @param array
     * @param indexA
     * @param indexB
     */
    public static void swap(int[] array, int indexA, int indexB) {
        int tmp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = tmp;
    }

}
