package codeforces.perfectpermutation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int permutation = Integer.parseInt(reader.readLine());

        /***** SOlUTION *****/
        String solution = solution(permutation);
        System.out.print(solution);
    }

    public static String solution(int permutations) {
        if(permutations == 0 || permutations%2 != 0)
            return "-1";

        StringBuilder builder = new StringBuilder();
        for (int i = permutations; i > 0; i--) {
            builder.append(i);
            builder.append(" ");
        }

        return builder.substring(0, builder.toString().length() - 1);
    }

}
