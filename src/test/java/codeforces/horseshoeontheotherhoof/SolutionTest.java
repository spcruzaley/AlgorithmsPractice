package codeforces.horseshoeontheotherhoof;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SolutionTest {

    @Test
    public void testSolutionA() {
        int expected = 1;
        int[] input = new int[]{1, 7, 3, 3};

        int actual = Solution.solution(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testSolutionB() {
        int expected = 3;
        int[] input = new int[]{7, 7, 7, 7};

        int actual = Solution.solution(input);

        assertEquals(expected, actual);
    }

}