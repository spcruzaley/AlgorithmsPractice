package leetcode.premium.microsoft.arraysstrings.reversewordsinstringII;

import org.junit.Assert;
import org.junit.Test;

public class ReverseWordsInStringIITest {

    @Test
    public void testReverseWords() {
        char[] expectedWord = {'b','l','u','e',' ','i','s',' ','s','k','y',' ','t','h','e'};

        char[] inputWord = {'t','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e'};
        ReverseWordsInStringII.reverseWords(inputWord);

        Assert.assertArrayEquals(expectedWord, inputWord);
    }

    @Test
    public void testReverseWordsWithOnlyOneCharacter() {
        char[] expectedWord = {'f',' ','e',' ','d',' ','c',' ','b',' ','a'};

        char[] inputWord = {'a',' ','b',' ','c',' ','d',' ','e',' ','f'};
        ReverseWordsInStringII.reverseWords(inputWord);

        Assert.assertArrayEquals(expectedWord, inputWord);
    }

    //Testing helper methods
    @Test
    public void testReverseWord() {
        char[] expectedWord = {'e','s','r','e','v','e','r'};

        char[] inputWord = {'r','e','v','e','r','s','e'};
        ReverseWordsInStringII.reverseWord(inputWord, 0, inputWord.length - 1);

        Assert.assertArrayEquals(expectedWord, inputWord);
    }

    @Test
    public void testGetNumSpaces() {
        int expectedSpaces = 3;

        char[] inputWord = {'t','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e'};
        int actualSpaces = ReverseWordsInStringII.getNumSpaces(inputWord);

        Assert.assertEquals(expectedSpaces, actualSpaces);
    }

    @Test
    public void testGetSpacesIndex() {
        int[] expectedSpacesIndex = {3,7,10};

        char[] inputWord = {'t','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e'};
        int[] actualSpacesIndex = ReverseWordsInStringII.getSpacesIndex(inputWord);

        Assert.assertArrayEquals(expectedSpacesIndex, actualSpacesIndex);
    }

}
