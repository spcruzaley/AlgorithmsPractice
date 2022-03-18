package codeforces.ultrafastmathematician;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = new String[2];
        input[0] = reader.readLine();
        input[1] = reader.readLine();

        /***** SOlUTION *****/
        String solution = solution(input);
        System.out.print(solution);
    }

    public static String solution(String[] input) {
        StringBuilder builder = new StringBuilder();
        String strA = input[0];
        String strB = input[1];

        for (int i = 0; i < strA.length(); i++) {
            builder.append(strA.charAt(i) ^ strB.charAt(i));
        }

        return builder.toString();
    }

}
