package leetcode.premium.microsoft.arraysstrings.reversewordsinstring.method1;

import org.junit.Assert;
import org.junit.Test;

public class ReverseWordsInStringTest {

    @Test
    public void testReverseWords() {
        String expectedString = "SPCruzaley am I";

        String actualString = ReverseWordsInString.reverseWords("I am SPCruzaley");

        Assert.assertEquals(expectedString, actualString);
    }

    //Helper methods
    @Test
    public void testReverseStringMethod() {
        String expectedString = "aloh";

        String actualString = ReverseWordsInString.reverseString("hola");

        Assert.assertEquals(expectedString, actualString);
    }

    @Test
    public void testReverseStringMethodTestTwo() {
        String expectedString = "yelazurCPS ma I";

        String actualString = ReverseWordsInString.reverseString("I am SPCruzaley");

        Assert.assertEquals(expectedString, actualString);
    }

}
