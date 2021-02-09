package microsoft;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class TaskThree {

    /**
     * Complexity: O(1), due to we will to do a while loop N-1 times, and as per description,
     *              N could have 1 to 100, we can say that, even passing N as 100, we will to
     *              executed it in constant time.
     * Space: O(N), due to I need to store the elements that the sum produces zero.
     * @param N
     * @return
     */
    public static int[] solution(int N) {
        // write your code in Java SE 8
        /**
         * As the challenge doesn't say anything about the number limit that we can use for the
         * sum, I'll to use a range of Integer numbers from minus N^2 to N^2.
         */
        int minLimit = -(N * N);
        int maxLimit = N * N;
        Set<Integer> result = new HashSet<>();

        /**
         * I'll to do a loop of N-1 in order to get 3 random integers, in order to avoid to have
         * different numbers, I'll to put them in a Set structure.
         */
        while(result.size() < N - 1) {
            int random = generatesRandomInt(minLimit, maxLimit);
            result.add(random);
        }

        /**
         * Once I have the three numbers I just need to get the sum of them in order to put the fourth
         * number (as negative or positive) to get a sum of zero.
         */
        int summarize = result.stream().reduce(Integer::sum).orElse(0);
        result.add(result.size() > 0 ? (summarize * -1) : summarize);

        return result.stream().mapToInt(x -> x).toArray();
    }

    /**
     * Helper method to generate a random integer from a given min to a given max values
     *
     * @param min
     * @param max
     * @return
     */
    private static int generatesRandomInt(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}
