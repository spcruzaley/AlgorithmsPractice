package codeforces.arrivalofthegeneral;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SolutionTest {

    @Test
    public void testSolutionA() {
        int[] input = new int[]{33, 44, 11, 22};
        int expected = 2;

        int actual = Solution.solution(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testSolutionB() {
        int[] input = new int[]{10, 10, 58, 31, 63, 40, 76};
        int expected = 10;

        int actual = Solution.solution(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testSolutionC() {
        int[] input = new int[]{10, 76, 10, 31, 63, 10, 76};
        int expected = 2;

        int actual = Solution.solution(input);

        assertEquals(expected, actual);
    }

}