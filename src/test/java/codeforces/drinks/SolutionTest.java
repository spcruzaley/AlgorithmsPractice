package codeforces.drinks;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SolutionTest {

    @Test
    public void testSolutionA() {
        String expected = "66.666666666667";
        int[] input = new int[]{50, 50, 100};

        String actual = Solution.solution(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testSolutionB() {
        String expected = "37.500000000000";
        int[] input = new int[]{0, 25, 50, 75};

        String actual = Solution.solution(input);

        assertEquals(expected, actual);
    }

}