package codeforces.beautifulmatrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int elementsInX = 5;
        int elementsInY = 5;

        int[][] array = new int[elementsInX][elementsInY];

        for (int i = 0, j = 0; i < elementsInX; i++, j++) {
            array[i] = Arrays.stream(reader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        /***** SOlUTION *****/
        int solution = solution(array);
        System.out.print(solution);
    }

    public static int solution(int[][] array) {
        int result = 0;

        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                if(array[x][y] == 1) {
                    result = Math.abs(2-x) + Math.abs(2-y);
                    break;
                }
            }
        }

        return result;
    }

}
