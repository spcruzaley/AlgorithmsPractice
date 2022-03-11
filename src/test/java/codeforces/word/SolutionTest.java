package codeforces.word;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SolutionTest {

    @Test
    public void testA() {
        String expected = "house";
        String input = "HoUse";

        String actual = Solution.solution(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testB() {
        String expected = "VIP";
        String input = "ViP";

        String actual = Solution.solution(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testC() {
        String expected = "matrix";
        String input = "maTRIx";

        String actual = Solution.solution(input);

        assertEquals(expected, actual);
    }

}