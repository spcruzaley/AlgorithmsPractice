package leetcode.premium.microsoft.arraysstrings.reversewordsinstring.method2;

import org.junit.Assert;
import org.junit.Test;

public class ReverseWordsInStringTest {

    @Test
    public void testReverseWords() {
        String expectedString = "SPCruzaley am I";

        String actualString = ReverseWordsInString.reverseWords("I am SPCruzaley");

        Assert.assertEquals(expectedString, actualString);
    }

}
