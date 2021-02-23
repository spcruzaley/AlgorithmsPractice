package facebook.interviewpreparation.stacks;

import org.junit.Assert;
import org.junit.Test;

public class BalanceBracketsTest {

    @Test
    public void testIsBalancedCaseOne() {
        String input = "{[()]}";
        boolean actualResult = BalanceBrackets.isBalanced(input);

        Assert.assertTrue(actualResult);
    }

    @Test
    public void testIsBalancedCaseTwo() {
        String input = "{}()";
        boolean actualResult = BalanceBrackets.isBalanced(input);

        Assert.assertTrue(actualResult);
    }

    @Test
    public void testIsBalancedCaseTree() {
        String input = "{(})";
        boolean actualResult = BalanceBrackets.isBalanced(input);

        Assert.assertFalse(actualResult);
    }

    @Test
    public void testIsBalancedCaseFour() {
        String input = ")";
        boolean actualResult = BalanceBrackets.isBalanced(input);

        Assert.assertFalse(actualResult);
    }

    @Test
    public void testIsBalancedCaseFive() {
        String input = "{[(])}";
        boolean actualResult = BalanceBrackets.isBalanced(input);

        Assert.assertFalse(actualResult);
    }

    @Test
    public void testIsBalancedCaseSeven() {
        String input = "{{[[(())]]}}";
        boolean actualResult = BalanceBrackets.isBalanced(input);

        Assert.assertTrue(actualResult);
    }

    @Test
    public void testIsBalancedNestedBrakets() {
        String input = "{{[[(())]()[]]}}";
        boolean actualResult = BalanceBrackets.isBalanced(input);

        Assert.assertTrue(actualResult);
    }

}
