package codeforces.cupboards;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SolutionTest {

    @Test
    public void testSolutionA() {
        int expected = 3;
        int[][] doors = new int[][]{
            {0, 1},
            {1, 0},
            {0, 1},
            {1, 1},
            {0, 1}
        };

        int actual = Solution.solution(doors);

        assertEquals(expected, actual);
    }

    @Test
    public void testSolutionB() {
        int expected = 0;
        int[][] doors = new int[][]{
                {0, 0},
                {0, 0}
        };

        int actual = Solution.solution(doors);

        assertEquals(expected, actual);
    }

    @Test
    public void testSolutionC() {
        int expected = 0;
        int[][] doors = new int[][]{
                {1, 1},
                {1, 1}
        };

        int actual = Solution.solution(doors);

        assertEquals(expected, actual);
    }

    @Test
    public void testSolutionD() {
        int expected = 1;
        int[][] doors = new int[][]{
                {0, 1},
                {1, 1},
                {1, 1}
        };

        int actual = Solution.solution(doors);

        assertEquals(expected, actual);
    }

}