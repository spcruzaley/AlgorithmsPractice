package codility.smallestpositiveinteger.method2;

import org.junit.Assert;
import org.junit.Test;

public class SmallestPositiveIntegerTest {

    @Test
    public void testSolutionWithMiddleSmallestInArray() {
        int expectedSmallest = 5;

        int[] inputArray = new int[]{1, 3, 6, 4, 1, 2};
        int actualSmallest = new SmallestPositiveInteger().solution(inputArray);

        Assert.assertEquals(expectedSmallest, actualSmallest);
    }

    @Test
    public void testSolutionWithMoreThanOneMiddleSmallestInArray() {
        int expectedSmallest = 4;

        int[] inputArray = new int[]{1, 3, 8, 5, 1, 2};
        int actualSmallest = new SmallestPositiveInteger().solution(inputArray);

        Assert.assertEquals(expectedSmallest, actualSmallest);
    }

    @Test
    public void testSolutionWithCompleteArrayPositives() {
        int expectedSmallest = 7;

        int[] inputArray = new int[]{1, 3, 6, 4, 1, 2, 5};
        int actualSmallest = new SmallestPositiveInteger().solution(inputArray);

        Assert.assertEquals(expectedSmallest, actualSmallest);
    }

    @Test
    public void testSolutionWithCompleteArrayAndNegatives() {
        int expectedSmallest = 1;

        int[] inputArray = new int[]{-1, -3};
        int actualSmallest = new SmallestPositiveInteger().solution(inputArray);

        Assert.assertEquals(expectedSmallest, actualSmallest);
    }

}
