package codeforces.perfectpermutation;

import org.junit.Test;

import java.util.stream.Stream;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class SolutionTest {

    @Test
    public void testSolutionA() {
        int input = 1;

        assertEquals("-1", Solution.solution(input));
    }

    @Test
    public void testSolutionB() {
        int input = 2;

        assertEquals("2 1", Solution.solution(input));
    }

    @Test
    public void testSolutionC() {
        int permutations = 3;

        assertEquals("-1", Solution.solution(permutations));
    }

    @Test
    public void testSolutionD() {
        int permutations = 4;

        int[] actual = Stream.of(Solution.solution(permutations).split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 1, j = 0; i <= permutations; i++, j++) {
            assertNotEquals(actual[j], i);
        }
    }

}