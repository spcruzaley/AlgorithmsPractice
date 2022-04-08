package codeforces.waytoolongwords;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SolutionTest {

    @Test
    public void testSolutionA() {
        String expected = "word\n" +
                "l10n\n" +
                "i18n\n" +
                "p43s";
        String[] input = new String[]{
                "word",
                "localization",
                "internationalization",
                "pneumonoultramicroscopicsilicovolcanoconiosis"
        };

        String actual = Solution.solution(input);

        assertEquals(expected, actual);
    }

}