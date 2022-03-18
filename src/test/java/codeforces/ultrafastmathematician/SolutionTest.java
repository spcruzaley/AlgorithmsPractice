package codeforces.ultrafastmathematician;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SolutionTest {

    @Test
    public void testSolutionA() {
        String expected = "1110001";
        String[] input = new String[]{"1010100", "0100101"};

        String actual = Solution.solution(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testSolutionB() {
        String expected = "111";
        String[] input = new String[]{"000", "111"};

        String actual = Solution.solution(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testSolutionC() {
        String expected = "0100";
        String[] input = new String[]{"1110", "1010"};

        String actual = Solution.solution(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testSolutionD() {
        String expected = "00010";
        String[] input = new String[]{"01110", "01100"};

        String actual = Solution.solution(input);

        assertEquals(expected, actual);
    }

}