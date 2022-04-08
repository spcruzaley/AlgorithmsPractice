package codeforces.tram;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SolutionTest {

    @Test
    public void testSolutionA() {
        int expected = 6;
        int[][] input = new int[][]{
                {0, 3},
                {2, 5},
                {4, 2},
                {4, 0}
        };

        int actual = Solution.solution(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testSolutionB() {
        int expected = 1;
        int[][] input = new int[][]{
                {0, 1},
                {1, 0},
                {0, 0},
                {0, 0},
                {0, 0},
                {0, 0},
                {0, 0},
                {0, 0}
        };

        int actual = Solution.solution(input);

        assertEquals(expected, actual);
    }

}