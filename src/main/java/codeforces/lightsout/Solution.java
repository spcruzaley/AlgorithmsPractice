package codeforces.lightsout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    public static String solution(int[][] array) {
        int[][] board = new int[][]{
                {1,1,1},
                {1,1,1},
                {1,1,1}
        };

        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                if(array[x][y] != 0 && array[x][y]%2 != 0) {
                    toggleMatrix(board, x, y);
                }
            }
        }

        return getBiDimensionalMatrixAsString(board);
    }

    public static void toggleMatrix(int[][] array, int x, int y) {
        //Left
        if (x-1 >= 0) {
            array[x-1][y] = Math.abs(array[x-1][y] - 1);
        }
        //Right
        if (x+1 < array[x].length) {
            array[x+1][y] = Math.abs(array[x+1][y] - 1);
        }
        //Up
        if (y-1 >= 0) {
            array[x][y-1] = Math.abs(array[x][y-1] - 1);
        }
        //Down
        if (y+1 < array.length) {
            array[x][y+1] = Math.abs(array[x][y+1] - 1);
        }
        //Position itself
        array[x][y] = Math.abs(array[x][y] - 1);
    }

    public static String getBiDimensionalMatrixAsString(int[][] array) {
        StringBuilder builder = new StringBuilder();

        for (int[] ints : array) {
            for (int anInt : ints) {
                builder.append(anInt);
            }
            builder.append(System.lineSeparator());
        }
        builder.replace(builder.length()-1,builder.length(),"");

        return builder.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int elements = 3;
        int[][] array = new int[elements][elements];

        for (int i = 0, j = 0; i < elements; i++, j++) {
            array[i] = Arrays.stream(reader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        /***** SOlUTION *****/
        String solution = solution(array);
        System.out.print(solution);
    }

}
