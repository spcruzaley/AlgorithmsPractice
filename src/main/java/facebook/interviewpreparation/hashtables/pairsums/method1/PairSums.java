package facebook.interviewpreparation.hashtables.pairsums.method1;

public class PairSums {

    private static final int MODULE = 2000007;

    /**
     * Using brute force, just to validate the results.
     *
     * Complexity: O(N^2)
     * Space: O(1)
     *
     * @param arr
     * @param k
     * @return
     */
    public static int numberOfWays(int[] arr, int k) {
        // Write your code here
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > Integer.MAX_VALUE/2 || arr[j] > Integer.MAX_VALUE/2) {
                    if((arr[i]%MODULE) + (arr[j]%MODULE) == (k%MODULE)) {
                        count++;
                    }
                } else {
                    if(arr[i] + arr[j] == k) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

}
