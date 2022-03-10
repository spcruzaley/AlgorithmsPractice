package codeforces.youngphysicist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    public static String solution(int[][] lines) {
        for (int i = 0; i < lines[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < lines.length; j++) {
                sum += lines[j][i];
                System.out.print(lines[j][i] + " ");
            }
            System.out.println("");
            if(sum != 0)
                return "NO";
        }

        return "YES";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int elements = 3;
        int lines = Integer.parseInt(reader.readLine());
        int[][] array = new int[lines][elements];

        for (int i = 0, j = 0; i < lines; i++, j++) {
            array[i] = Arrays.stream(reader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        /***** SOlUTION *****/
        String solution = solution(array);
        System.out.print(solution);
    }
}
