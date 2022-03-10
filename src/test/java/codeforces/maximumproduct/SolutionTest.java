package codeforces.maximumproduct;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void test() {
        String input = "4\n" +
                "5\n" +
                "-1 -2 -3 -4 -5\n" +
                "6\n" +
                "-1 -2 -3 1 2 -1\n" +
                "6\n" +
                "-1 0 0 0 -1 -1\n" +
                "6\n" +
                "-9 -7 -5 -3 -2 1";
        String[] args = input.split(System.lineSeparator());
        Solution.main(args);
    }

}