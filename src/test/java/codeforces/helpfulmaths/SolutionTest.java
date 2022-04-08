package codeforces.helpfulmaths;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SolutionTest {

    @Test
    public void testSolutionA() {
        String expected = "1+2+3";
        int[] input = new int[]{3, 2, 1};

        String actual = Solution.solution(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testSolutionB() {
        String expected = "1+1+1+3+3";
        int[] input = new int[]{1, 1, 3, 1, 3};

        String actual = Solution.solution(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testSolutionC() {
        String expected = "2";
        int[] input = new int[]{2};

        String actual = Solution.solution(input);

        assertEquals(expected, actual);
    }

}