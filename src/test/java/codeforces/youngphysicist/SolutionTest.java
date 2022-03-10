package codeforces.youngphysicist;

import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testA() throws IOException {
        int[][] lines = new int[][]{
                {-3, -36, -46},
                {-11, -50, 37},
                {42, -11, -15},
                {9, 42, 44}
        };

        String output = Solution.solution(lines);
    }

    @Test
    public void testB() throws IOException {
        String line = "-3 -36 -46\n" +
                "-11 -50 37\n" +
                "42 -11 -15\n" +
                "9 42 44\n" +
                "-29 -12 24\n" +
                "3 9 -40\n" +
                "-35 13 50\n" +
                "14 43 18\n" +
                "-13 8 24\n" +
                "-48 -15 10\n" +
                "50 9 -50\n" +
                "21 0 -50\n" +
                "0 0 -6";
        int[][] lines = buildLines(line);

        assertEquals("YES", Solution.solution(lines));
    }

    @Test
    public void test2() {
        String line = "3 -1 7\n" +
                "-5 2 -4\n" +
                "2 -1 -3";
        int[][] lines = buildLines(line);
        Solution.solution(lines);
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