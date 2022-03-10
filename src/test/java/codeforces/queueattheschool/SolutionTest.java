package codeforces.queueattheschool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testSolutionA() {
        String expected = "GBGGB";
        String queue = "BGGBG";
        int times = 1;

        String actual = Solution.solution(queue.toCharArray(), times);

        assertEquals(expected, actual);
    }

    @Test
    public void testSolutionB() {
        String expected = "GGBGB";
        String queue = "BGGBG";
        int times = 2;

        String actual = Solution.solution(queue.toCharArray(), times);

        assertEquals(expected, actual);
    }

    @Test
    public void testSolutionC() {
        String expected = "GGGB";
        String queue = "GGGB";
        int times = 1;

        String actual = Solution.solution(queue.toCharArray(), times);

        assertEquals(expected, actual);
    }

}