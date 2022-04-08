package codeforces.boyorgirl;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SolutionTest {

    @Test
    public void testSolutionA() {
        String expected = "CHAT WITH HER!";
        String input = "wjmzbmr";

        String actual = Solution.solution(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testSolutionB() {
        String expected = "IGNORE HIM!";
        String input = "xiaodao";

        String actual = Solution.solution(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testSolutionC() {
        String expected = "CHAT WITH HER!";
        String input = "sevenkplus";

        String actual = Solution.solution(input);

        assertEquals(expected, actual);
    }

}