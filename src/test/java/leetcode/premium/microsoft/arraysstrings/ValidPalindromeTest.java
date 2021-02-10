package leetcode.premium.microsoft.arraysstrings;

import org.junit.Assert;
import org.junit.Test;

public class ValidPalindromeTest {

    @Test
    public void testIsPalindrome() {
        String input = "A man, a plan, a canal: Panama";

        boolean actualValue = ValidPalindrome.isPalindrome(input);

        Assert.assertTrue(actualValue);
    }

    @Test
    public void testIsPalindromeTwo() {
        String input = "0P";

        boolean actualValue = ValidPalindrome.isPalindrome(input);

        Assert.assertFalse(actualValue);
    }

}
