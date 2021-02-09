package microsoft;

import java.util.HashSet;
import java.util.Set;

public class TaskTwo {

    /**
     * Complexity: O(N) where N refers to the numbers of elements in array A, due to I need to
     *              traverse all the array in order to generate the final word.
     * Space: O(N+M) where N refers to the elements in array A, M refers to the S length.
     *
     * See (src/test/java/microsoft/TaskTwoTest.java) for test cases
     *
     * @param S
     * @param A
     * @return
     */
    public static String solution(String S, int[] A) {
        // write your code in Java SE 8
        StringBuilder builder = new StringBuilder();
        Set<Integer> indexes = new HashSet<>();
        indexes.add(0);

        /**
         * First I need to convert the String into a char array in order to pick up the character needed
         */
        char[] chars = S.toCharArray();
        /**
         * I 'll to use a buffer to store the characters as per the indexes received in A,
         * firstable, I need to put the first character in the buffer
         */
        builder.append(chars[0]);

        int index = 0;
        /**
         * Now I'll to go thru the indexes in A, I use a Set to validate if the index its not already used to avoid
         * duplicated characters, if its not present I can append the character to the buffer and add the
         * current index to the Set
         */
        for(int i = 0; i < A.length; i++) {
            index = A[index];
            if(!indexes.contains(index)) {
                builder.append(chars[index]);
                indexes.add(index);
            }
        }

        return builder.toString();
    }

}
