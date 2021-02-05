package codesignal.arrayreplace.method2;

import java.util.stream.IntStream;

public class ArrayReplace {

    /**
     * Using Streams we can achieve it with just one line.
     *
     *  Complexity: O(N) Sill we have a linear complexity even if we don't use the for loop (Its used by the map)
     *  Space: O(N) In this case we don't have a constant space, due to we create a new one to return it as a result.
     *
     * See (/src/test/java/codesignal/arrayreplace/method2/ArrayReplaceTest.java) for test cases
     * @param inputArray
     * @param elemToReplace
     * @param substitutionElem
     * @return
     */
    static int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
        return IntStream.of(inputArray)
                .map(element -> (element == elemToReplace) ? substitutionElem : element)
                .toArray();
    }

}
