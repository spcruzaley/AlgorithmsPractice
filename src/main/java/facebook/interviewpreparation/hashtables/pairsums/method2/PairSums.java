package facebook.interviewpreparation.hashtables.pairsums.method2;

import java.util.*;

public class PairSums {

    /**
     * Complexity: O(N)
     * Space: O(N)
     *
     * @param arr
     * @param k
     * @return
     */
    public static int numberOfWays(int[] arr, int k) {
        // Write your code here
        int module = getModule(k);
        int count = getCountRepeatedNumber(arr);

        Set<Integer> possibleMatches = new HashSet<>();
        for (int i : arr) {
            int complement = k % module - i % module;

            if (possibleMatches.contains(complement))
                count++;
            else
                possibleMatches.add(i % module);
        }

        return count;
    }

    /**
     * Complexity: O(N)
     * Space: O(N)
     *
     * @param arr
     * @return
     */
    public static int getCountRepeatedNumber(int[] arr) {
        Map<Integer, Integer> repeatedNumbers = new Hashtable<>();

        for (int i = 0; i < arr.length; i++) {
            int module = getModule(arr[i]);

            if(repeatedNumbers.get(arr[i]%module) == null) {
                repeatedNumbers.put(arr[i]%module, 1);
            } else {
                repeatedNumbers.put(arr[i]%module, repeatedNumbers.get(arr[i]%module)+1);
            }
        }

        int greaterThanTwoTimes=0;
        for (Map.Entry<Integer, Integer> entry: repeatedNumbers.entrySet()){
            if(entry.getValue() > 2)
                greaterThanTwoTimes++;
        }

        return greaterThanTwoTimes;
    }

    private static int getModule(int num) {
        if(num > Integer.MAX_VALUE/2)
            return 1;
        return 2000007;
    }

}
