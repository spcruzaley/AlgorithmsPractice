package codeforces.lightsout;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    //Complete tests
    @Test
    public void testSolutionA() {
        String expected = "001\n010\n100";
        int[][] input = new int[][]{
                {1,0,0},
                {0,0,0},
                {0,0,1}
        };

        String actual = Solution.solution(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testSolutionB() {
        String expected = "010\n011\n100";
        int[][] input = new int[][]{
                {1,0,1},
                {8,8,8},
                {2,0,3}
        };

        String actual = Solution.solution(input);
        assertEquals(expected, actual);
    }

    // Single tests
    int[][] boardInitialState = new int[][]{
            {1,1,1},
            {1,1,1},
            {1,1,1}
    };

    @Test
    public void testToggleMatrixA() {
        int[][] expected = new int[][]{
            {0,0,0},
            {1,0,1},
            {1,1,1}
        };
        int[][] input = boardInitialState.clone();
        int x = 0;
        int y = 1;

        Solution.toggleMatrix(input, x, y);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testToggleMatrixB() {
        int[][] expected = new int[][]{
                {0,0,1},
                {0,1,1},
                {1,1,1}
        };
        int[][] input = boardInitialState.clone();
        int x = 0;
        int y = 0;

        Solution.toggleMatrix(input, x, y);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testToggleMatrixC() {
        int[][] expected = new int[][]{
                {1,0,1},
                {0,0,0},
                {1,0,1}
        };
        int[][] input = boardInitialState.clone();
        int x = 1;
        int y = 1;

        Solution.toggleMatrix(input, x, y);
        assertArrayEquals(expected, input);
    }

}