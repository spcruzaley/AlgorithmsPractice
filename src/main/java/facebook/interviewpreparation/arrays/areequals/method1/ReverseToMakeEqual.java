package facebook.interviewpreparation.arrays.areequals.method1;

public class ReverseToMakeEqual {

    /**
     * Complexity: O(N) (NOTE: Not sure if the while could affect, as far as I can see, in the worst case
     *                          could be O(N+N/2), that will be reduced to O(N))
     * Space: O(1)
     *
     * @param array_a
     * @param array_b
     * @return
     */
    public static boolean areTheyEqual(int[] array_a, int[] array_b) {
        // Write your code here
        if(array_a.length != array_b.length)
            return false;

        for (int i = 0, j = 0, k; i < array_a.length; i++) {
            if(array_a[i] != array_b[j]) {
                k = j + 1;
                while (k < array_b.length) {
                    if(array_b[k] == array_a[i]) {
                        swap(array_b, k, i);
                        break;
                    }
                    k++;
                }
                if(k == array_b.length)
                    return false;
            } else {
                j++;
            }
        }

        return true;
    }

    private static void swap(int[] array, int start, int end) {
        int tmp = array[start];
        array[start] = array[end];
        array[end] = tmp;
    }

}
