package codeforces.panoramixsprediction;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class SolutionTest {

    @Test
    public void testSolutionA() {
        String expected = "YES";
        String input = "3 5";

        assertEquals(expected, Solution.solution(input));
    }

    @Test
    public void testSolutionB() {
        String expected = "YES";
        String input = "7 11";

        assertEquals(expected, Solution.solution(input));
    }

    @Test
    public void testSolutionC() {
        String expected = "NO";
        String input = "7 9";

        assertEquals(expected, Solution.solution(input));
    }

    // Testing single methods
    @Test
    public void testNextPrimeA() {
        int expected = 5;
        int input = 4;

        int actual = Solution.nextPrime(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testNextPrimeB() {
        int expected = 17;
        int input = 13;

        int actual = Solution.nextPrime(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testNextPrimeC() {
        int expected = 83;
        int input = 80;

        int actual = Solution.nextPrime(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testNextPrimeD() {
        int expected = 113;
        int input = 109;

        int actual = Solution.nextPrime(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testIsPrime() {
        assertTrue(Solution.isPrime(3));
        assertTrue(Solution.isPrime(5));
        assertTrue(Solution.isPrime(11));
        assertTrue(Solution.isPrime(107));
    }

}