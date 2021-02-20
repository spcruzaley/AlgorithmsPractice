package facebook.interviewpreparation.arrays.areequals.method2;

import org.junit.Assert;
import org.junit.Test;

public class ReverseToMakeEqualTest {

    @Test
    public void testAreTheyEqualAsTrue() {
        int[] array_a = {1, 2, 3, 4};
        int[] array_b = {1, 4, 3, 2};
        boolean expected = true;

        boolean actual = facebook.interviewpreparation.arrays.areequals.method1.ReverseToMakeEqual.areTheyEqual(array_a, array_b);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAreTheyEqualAsFalse() {
        int[] array_a = {1, 2, 3, 4};
        int[] array_b = {1, 4, 3, 3};
        boolean expected = false;

        boolean actual = ReverseToMakeEqual.areTheyEqual(array_a, array_b);

        Assert.assertEquals(expected, actual);
    }

}
