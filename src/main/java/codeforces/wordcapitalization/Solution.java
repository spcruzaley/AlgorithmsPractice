package codeforces.wordcapitalization;

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
        if((int)word.charAt(0) >= 97) {
            word = word.replaceFirst(String.valueOf(word.charAt(0)),
                    String.valueOf(word.charAt(0)).toUpperCase());
        }

        return word;
    }

}
