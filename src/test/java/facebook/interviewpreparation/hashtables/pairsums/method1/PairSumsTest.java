package facebook.interviewpreparation.hashtables.pairsums.method1;

import org.junit.Assert;
import org.junit.Test;

public class PairSumsTest {

    @Test
    public void testNumberOfWays() {
        int expectedNum = 2;

        int actualNum = PairSums.numberOfWays(new int[]{1,2,3,4,3}, 6);

        Assert.assertEquals(expectedNum, actualNum);
    }

    @Test
    public void testNumberOfWaysSecondTest() {
        int expectedNum = 4;

        int actualNum = PairSums.numberOfWays(new int[]{1,5,3,3,3}, 6);

        Assert.assertEquals(expectedNum, actualNum);
    }

    @Test
    public void testNumberOfWaysBigNumbers() {
        int expectedNum = 2;

        int actualNum = PairSums.numberOfWays(new int[]{1_000_000_000,1_000_000,1,5,1}, 1_000_000_001);

        Assert.assertEquals(expectedNum, actualNum);
    }

}
