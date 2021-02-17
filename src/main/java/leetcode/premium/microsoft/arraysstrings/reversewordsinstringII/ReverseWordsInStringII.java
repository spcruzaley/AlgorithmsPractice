package leetcode.premium.microsoft.arraysstrings.reversewordsinstringII;

import java.util.Arrays;

public class ReverseWordsInStringII {

    /**
     * Complexity: O(N)
     * Space: O(N-1) due to:
     *      We are using an array of ints to store the spaces in order to distinguish each word, thus, in the worst case
     *      we can receive only one letter and a space, something like this:
     *
     *          input: 'a',' ','b',' ','c',' ','d',' ','e',' ','f'
     *
     * @param s
     */
    public static void reverseWords(char[] s) {
        //Search for spaces
        int[] spacesIndx = getSpacesIndex(s);

        //Using the delimiter space index, we can reverse each word
        int currentIndex = 0;
        for (int i = 0; i < spacesIndx.length; i++) {
            reverseWord(s, currentIndex, spacesIndx[i] - 1);
            currentIndex = spacesIndx[i] + 1;
        }

        //Once all the words in the array are reversed we need to reverse the entire phrase char by char
        reverseWord(s, 0, s.length-1);
    }

    public static int[] getSpacesIndex(char[] chars) {
        int spaces = getNumSpaces(chars);
        int[] spacesIndx = new int[spaces+1]; //Add an additional element to the end word

        for (int i = 0, j = 0; i < chars.length; i++) {
            if(chars[i] == 32)
                spacesIndx[j++] = i;
        }
        spacesIndx[spacesIndx.length-1] = chars.length;

        return spacesIndx;
    }

    public static int getNumSpaces(char[] chars) {
        int cont = 0;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == 32)
                cont++;
        }
        return cont;
    }

    /**
     * Reverse a word received in an array of chars
     *
     * @param chars
     * @param start Inclusive Start index
     * @param end Inclusive End index
     */
    public static void reverseWord(char[] chars, int start, int end) {
        if(chars.length == 1)
            return;

        while(start < end) {
            char tmp = chars[start];
            chars[start] = chars[end];
            chars[end] = tmp;

            start++;
            end--;
        }
    }

}
