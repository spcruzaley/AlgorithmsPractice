package codesignal.arrayreplace.method1;

public class ArrayReplace {

    /**
     * First approach using only a for loop
     *  Complexity: O(N)
     *  Space: O(1)
     *
     * See (/src/test/java/codesignal/arrayreplace/method1/ArrayReplaceTest.java) for test cases
     * @param inputArray
     * @param elemToReplace
     * @param substitutionElem
     * @return
     */
    static int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
        for (int i = 0; i < inputArray.length; i++) {
            if(inputArray[i] == elemToReplace)
                inputArray[i] = substitutionElem;
        }

        return inputArray;
    }

}
