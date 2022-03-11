package codeforces.beautifulyear;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SolutionTest {

    @Test
    public void testA() {
        int expected = 2013;
        int input = 1987;

        int actual = Solution.solution(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testB() {
        int expected = 2014;
        int input = 2013;

        int actual = Solution.solution(input);

        assertEquals(expected, actual);
    }

}