package facebook.interviewpreparation.arrays.contiguoussubarrays;

import java.util.function.BiPredicate;

public class ContiguousSubarrays {

    public static BiPredicate<Integer, Integer> leftValidation = (index, boundary) -> index >= boundary;
    public static BiPredicate<Integer, Integer> rightValidation = (index, boundary) -> index < boundary;

    /**
     * Complexity: O(N)
     * Space: O(N)
     *
     * @param arr
     * @return
     */
    public static int[] countSubarrays(int[] arr) {
        int[] results = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int leftSum = checkContiguous(arr, i, -1, 0, leftValidation);
            int rightSum = checkContiguous(arr, i, 1, arr.length, rightValidation);
            results[i] = leftSum + rightSum + 1;
        }

        return results;
    }

    public static int checkContiguous(int[] arr, int index, int sumFactor, int boundary,
                                      BiPredicate<Integer, Integer> validation) {
        int cont = 0;
        int currentValue = arr[index];
        index += sumFactor;

        while(validation.test(index, boundary) && currentValue > arr[index]) {
            index += sumFactor;
            cont++;
        }

        return cont;
    }

}
