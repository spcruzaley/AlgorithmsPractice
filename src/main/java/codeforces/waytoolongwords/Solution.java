package codeforces.waytoolongwords;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int wordsNum = Integer.parseInt(reader.readLine());
        String[] words = new String[wordsNum];
        for (int i = 0; i < wordsNum; i++) {
            words[i] = reader.readLine();
        }

        /***** SOlUTION *****/
        String solution = solution(words);
        System.out.print(solution);
    }

    public static String solution(String[] words) {
        StringBuilder builder = new StringBuilder();

        for (String word : words) {
            if (word.length() > 10) {
                builder.append(word.charAt(0))
                        .append(word.length() - 2)
                        .append(word.charAt(word.length()-1))
                        .append(System.lineSeparator());
            } else {
                builder.append(word).append(System.lineSeparator());
            }
        }

        return builder.substring(0, builder.length() - 1);
    }

}
