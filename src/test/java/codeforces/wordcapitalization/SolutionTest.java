package codeforces.wordcapitalization;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SolutionTest {

    @Test
    public void testA() {
        String expected = "ApPLe";
        String input = "ApPLe";

        String actual = Solution.solution(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testB() {
        String expected = "Konjac";
        String input = "konjac";

        String actual = Solution.solution(input);

        assertEquals(expected, actual);
    }

}