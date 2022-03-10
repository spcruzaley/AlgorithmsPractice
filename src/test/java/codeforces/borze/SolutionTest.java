package codeforces.borze;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SolutionTest {

    @Test
    public void testA() {
        String expected = "012";
        String input = ".-.--";

        String actual = Solution.solution(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testB() {
        String expected = "20";
        String input = "--.";

        String actual = Solution.solution(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testC() {
        String expected = "1012";
        String input = "-..-.--";

        String actual = Solution.solution(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testD() {
        String expected = "0012";
        String input = "..-.--";

        String actual = Solution.solution(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testE() {
        String expected = "0";
        String input = ".";

        String actual = Solution.solution(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testF() {
        String expected = "1";
        String input = "-.";

        String actual = Solution.solution(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testG() {
        String expected = "2";
        String input = "--";

        String actual = Solution.solution(input);

        assertEquals(expected, actual);
    }
}