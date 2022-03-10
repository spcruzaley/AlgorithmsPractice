package codeforces.borze;

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

    public static String solution(String code) {
        char[] codeChar = code.toCharArray();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < codeChar.length;) {
            if(codeChar[i] == '.') {
                builder.append("0");
                i++;
            } else {
                if(codeChar[i+1] == '.') {
                    builder.append("1");
                } else {
                    builder.append("2");
                }
                i+=2;
            }
        }

        return builder.toString();
    }

}
