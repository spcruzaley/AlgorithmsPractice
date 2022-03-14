package codeforces.stonesonthetable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        reader.readLine();
        String stringColors = reader.readLine();

        /***** SOlUTION *****/
        int solution = solution(stringColors);
        System.out.print(solution);
    }

    public static int solution(String input) {
        char[] chars = input.toCharArray();
        int num = 0;

        for (int i = 0; i < chars.length - 1; i++) {
            if(chars[i] == chars[i+1]) {
                num++;
            }
        }

        return num;
    }

}
