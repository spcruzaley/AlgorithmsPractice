package leetcode.containsduplicate.method2;

import org.junit.Assert;
import org.junit.Test;

public class ContainsDuplicateTest {

    @Test
    public void testContainsDuplicateAsTrue() {
        int[] inputArray = new int[]{1,2,3,4,6,8,1};
        boolean actualResult = ContainsDuplicate.containsDuplicate(inputArray);

        Assert.assertTrue(actualResult);
    }

    @Test
    public void testContainsDuplicateAsFalse() {
        int[] inputArray = new int[]{1,2,3,4,6,8};
        boolean actualResult = ContainsDuplicate.containsDuplicate(inputArray);

        Assert.assertFalse(actualResult);
    }

}
