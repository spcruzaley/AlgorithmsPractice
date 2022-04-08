package codeforces.tram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int elements = Integer.parseInt(reader.readLine());
        int[][] places = new int[elements][];

        for (int i = 0, j = 0; i < elements; i++, j++) {
            places[i] = Arrays.stream(reader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        /***** SOlUTION *****/
        int solution = solution(places);
        System.out.print(solution);
    }

    public static int solution(int[][] places) {
        int actual = places[0][1];
        int max = Math.max(places[0][0], actual);

        for (int i = 1; i < places.length; i++) {
            actual -= places[i][0];
            actual += places[i][1];

            max = Math.max(max, actual);
        }

        return max;
    }

}
