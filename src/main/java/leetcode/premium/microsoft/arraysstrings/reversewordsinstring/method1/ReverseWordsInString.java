package leetcode.premium.microsoft.arraysstrings.reversewordsinstring.method1;

public class ReverseWordsInString {

    /**
     * URL: https://leetcode.com/problems/reverse-words-in-a-string
     *
     * Complexity: O(N)
     * Space: O(N+M+K) where:
     *
     *      N its the length of the given string to store the reversedChars array,
     *      M its the space number that the string has,
     *      K its the length of the given string, we used it in the StringBuilder
     *
     * @param s
     * @return
     */
    public static String reverseWords(String s) {
        String reverserdString = reverseString(s);
        char[] reversedChars = reverserdString.toCharArray();

        //Search for spaces
        int[] spaces = new int[numSpaces(reversedChars)+1];
        int j = 0;
        for (int i = 0; i < reverserdString.length(); i++) {
            if(reversedChars[i] == 32) spaces[j++] = i;
        }
        //I need to store the last index in order to get the las word
        spaces[j] = reverserdString.length();

        //Reverse each word delimited by the space index
        StringBuilder builder = new StringBuilder();
        int previousIndex = 0;
        for (int space : spaces) {
            builder.append(reverseString(reverserdString.substring(previousIndex, space)));
            previousIndex = space;
            System.out.println("");
        }

        return builder.toString();
    }

    /**
     * Complexity: O(N)
     * Space: O(N)
     * @param word
     * @return
     */
    public static String reverseString(String word) {
        char[] chars = word.toCharArray();

        int leftPointer = 0;
        int rightPointer = chars.length - 1;

        //If the first character its an space we can leave it and increase the leftPointer to point to the next char
        if(chars[0] == 32) leftPointer++;

        while(leftPointer < rightPointer) {
            char tmpChar = chars[leftPointer];
            chars[leftPointer++] = chars[rightPointer];
            chars[rightPointer--] = tmpChar;
        }

        StringBuilder builder = new StringBuilder();
        for (char c : chars) {
            builder.append(c);
        }

        return builder.toString();
    }

    private static int numSpaces(char[] chars) {
        int spaces = 0;
        for (char c : chars) {
            if(c == 32) spaces++;
        }
        return spaces;
    }

}
