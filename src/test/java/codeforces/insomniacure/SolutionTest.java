package codeforces.insomniacure;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SolutionTest {

    @Test
    public void testSolutionA() {
        int expected = 12;

        int actual = Solution.solution(1, 2, 3, 4, 12);

        assertEquals(expected, actual);
    }

    @Test
    public void testSolutionB() {
        int expected = 17;

        int actual = Solution.solution(2, 3, 4, 5, 24);

        assertEquals(expected, actual);
    }

}