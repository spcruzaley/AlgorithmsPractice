package codeforces.beautifulmatrix;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testA() {
        int[][] lines = new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };

        int output = Solution.solution(lines);
        assertEquals(3, output);
    }

    @Test
    public void testB() {
        int[][] lines = new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };

        int output = Solution.solution(lines);
        assertEquals(1, output);
    }

    @Test
    public void testC() {
        int[][] lines = new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };

        int output = Solution.solution(lines);
        assertEquals(0, output);
    }

    private int[][] buildLines(String line) {
        String[] lines = line.split(System.lineSeparator());
        int[][] array = new int[lines.length][];
        int i = 0;
        for (String s : lines) {
            array[i++] = Arrays.stream(s.split(" "))
                    .mapToInt(Integer::parseInt).toArray();
        }

        return array;
    }

}