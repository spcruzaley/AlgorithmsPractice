package codeforces.panoramixsprediction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String stringColors = reader.readLine();

        /***** SOlUTION *****/
        String solution = solution(stringColors);
        System.out.print(solution);
    }

    public static String solution(String input) {
        int[] nums = Arrays.stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        if(nextPrime(nums[0]) == nums[1]) {
            return "YES";
        }

        return "NO";
    }

    public static int nextPrime(int from) {
        int nextPrime = from + 1;
        int cont = 0;

        while (cont < 1) {
            if(isPrime(nextPrime++)) {
                cont++;
            }
        }

        return nextPrime - 1;
    }

    public static boolean isPrime(int num) {
        int cont = 0;
        for (int i = 1; i <= num && i < 10; i++) {
            if(num%i == 0) {
                cont++;
            }
        }

        if(num >= 10) {
            cont++;
        }

        return cont == 2;
    }

}
