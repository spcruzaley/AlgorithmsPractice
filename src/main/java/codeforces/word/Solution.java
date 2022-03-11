package codeforces.word;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String code = reader.readLine();

        /***** SOlUTION *****/
        String solution = solution(code);
        System.out.print(solution);
    }

    public static String solution(String word) {
        char[] chars = word.toCharArray();
        int lower = 0;

        for(char c: chars) {
            lower += ((int)c >= 97) ? 1 : 0;
        }
        int upper = word.length() - lower;

        return (lower == upper || lower > upper) ? word.toLowerCase() : word.toUpperCase();
    }

}
