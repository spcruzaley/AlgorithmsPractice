package microsoft;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TaskThreeTest {

    @Test
    public void testSolution() {
        int expectedSum = 0;

        int[] array = TaskThree.solution(3);
        int actualSum = IntStream.of(array).reduce(Integer::sum).getAsInt();
        System.out.println(Arrays.toString(array));

        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testSolutionSecondTest() {
        int expectedSum = 0;

        int[] array = TaskThree.solution(1);
        int actualSum = IntStream.of(array).reduce(Integer::sum).getAsInt();
        System.out.println(Arrays.toString(array));

        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testSolutionThirdTest() {
        int expectedSum = 0;

        int[] array = TaskThree.solution(2);
        int actualSum = IntStream.of(array).reduce(Integer::sum).getAsInt();
        System.out.println(Arrays.toString(array));

        Assert.assertEquals(expectedSum, actualSum);
    }

}
