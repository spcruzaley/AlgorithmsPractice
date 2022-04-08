package codeforces.helpfulmaths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] input = Arrays.stream(reader.readLine().split("\\+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        /***** SOlUTION *****/
        String solution = solution(input);
        System.out.print(solution);
    }

    public static String solution(int[] input) {
        if(input.length == 1)
            return String.valueOf(input[0]);

        Arrays.sort(input);
        StringBuilder builder = new StringBuilder();

        for (int num : input) {
            builder.append(num).append("+");
        }

        return builder.substring(0, builder.length() - 1);
    }

}
