package leetcode.duplicatezeros;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    @Test
    public void testSolutionA() {
        int[] expected = new int[]{1,0,0,2,3,0,0,4};
        int[] input = new int[]{1,0,2,3,0,4,5,0};

        Solution.solution(input);

        assertArrayEquals(expected, input);
    }

    @Test
    public void testSolutionB() {
        int[] expected = new int[]{1,2,3};
        int[] input = new int[]{1,2,3};

        Solution.solution(input);

        assertArrayEquals(expected, input);
    }

    @Test
    public void testSolutionC() {
        int[] expected = new int[]{1,8,2,3,4,4,5,0};
        int[] input = new int[]{1,8,2,3,4,4,5,0};

        Solution.solution(input);

        assertArrayEquals(expected, input);
    }

    @Test
    public void testSolutionD() {
        int[] expected = new int[]{1,8,2,3,4,4,0,0};
        int[] input = new int[]{1,8,2,3,4,4,0,5};

        Solution.solution(input);

        assertArrayEquals(expected, input);
    }

    @Test
    public void testSolutionE() {
        int[] expected = new int[]{1,8,0,0,3,4,4,0};
        int[] input = new int[]{1,8,0,3,4,4,0,5};

        Solution.solution(input);

        assertArrayEquals(expected, input);
    }

    @Test
    public void testRotateElementsA() {
        int[] expected = new int[]{0,1,2,3,4};
        int[] input = new int[]{1,2,3,4,5};

        Solution.rotateElements(input, 0, input.length - 1);

        assertArrayEquals(expected, input);
    }

    @Test
    public void testRotateElementsB() {
        int[] expected = new int[]{1,2,0,3,4};
        int[] input = new int[]{1,2,3,4,5};

        Solution.rotateElements(input, 2, input.length - 1);

        assertArrayEquals(expected, input);
    }

    @Test
    public void testRotateElementsC() {
        int[] expected = new int[]{1,2,3,4,0};
        int[] input = new int[]{1,2,3,4,5};

        Solution.rotateElements(input, 4, input.length - 1);

        assertArrayEquals(expected, input);
    }

}