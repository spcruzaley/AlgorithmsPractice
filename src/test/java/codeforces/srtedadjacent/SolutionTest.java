package codeforces.srtedadjacent;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SolutionTest {

    @Test
    public void testSingleSolution() {
        int[] array = new int[]{5,-2,4,8,6,5};
        int[] res = Solution.singleSolution(array);

        for (int i = 0; i < res.length - 2; i++) {
            assertTrue(res[i] - res[i+1] < res[i+2]);
        }
    }

    @Test
    public void testSingleSolutionTwo() {
        int[] array = new int[]{8,1,4,2};
        int[] res = Solution.singleSolution(array);

        for (int i = 0; i < res.length - 2; i++) {
            assertTrue(res[i] - res[i+1] < res[i+2]);
        }
    }

}