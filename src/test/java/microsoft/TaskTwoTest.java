package microsoft;

import org.junit.Assert;
import org.junit.Test;

public class TaskTwoTest {

    @Test
    public void testSolutionFirstTest() {
        String expectedString = "code";

        String actualString = TaskTwo.solution("cdeo", new int[]{3,2,0,1});

        Assert.assertEquals(expectedString, actualString);
    }

    @Test
    public void testSolutionSecondTest() {
        String expectedString = "centipede";

        String actualString = TaskTwo.solution("cdeenetpi", new int[]{5,2,0,1,6,4,8,3,7});

        Assert.assertEquals(expectedString, actualString);
    }

    @Test
    public void testSolutionThirdTest() {
        String expectedString = "bat";

        String actualString = TaskTwo.solution("bytdag", new int[]{4,3,0,1,2,5});

        Assert.assertEquals(expectedString, actualString);
    }

}
