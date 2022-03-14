package codeforces.stonesonthetable;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SolutionTest {

    @Test
    public void testA() {
        int expected = 1;
        String input = "RRG";

        int actual = Solution.solution(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testB() {
        int expected = 4;
        String input = "RRRRR";

        int actual = Solution.solution(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testC() {
        int expected = 0;
        String input = "BRBG";

        int actual = Solution.solution(input);

        assertEquals(expected, actual);
    }

}