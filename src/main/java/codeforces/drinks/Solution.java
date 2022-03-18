package codeforces.drinks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        reader.readLine();
        int[] input = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        /***** SOlUTION *****/
        String solution = solution(input);
        System.out.print(solution);
    }

    public static String solution(int[] input) {
        double length = input.length;
        double sum = Arrays.stream(input).sum();

        return String.format("%.12f", (sum/length));
    }

}
