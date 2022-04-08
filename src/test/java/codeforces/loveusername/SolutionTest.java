package codeforces.loveusername;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SolutionTest {

    @Test
    public void testSolutionA() {
        int expected = 2;
        int[] input = {100, 50, 200, 150, 200};

        int actual = Solution.solution(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testSolutionB() {
        int expected = 4;
        int[] input = {4664, 6496, 5814, 7010, 5762, 5736, 6944, 4850, 3698, 7242};

        int actual = Solution.solution(input);

        assertEquals(expected, actual);
    }

}