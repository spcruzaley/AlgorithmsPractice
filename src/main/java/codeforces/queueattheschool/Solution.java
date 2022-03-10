package codeforces.queueattheschool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    public static String solution(char[] array, int times) {
        for (int i = 0; i < times; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if(array[j] < array[j+1]) {
                    array[j] = 'G';
                    array[j+1] = 'B';
                    j++;
                }
            }
        }

        return new String(array);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int elements = 2;

        int[] lineZero = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String queue = reader.readLine();

        /***** SOlUTION *****/
        char[] array = queue.toCharArray();
        String solution = solution(array, lineZero[1]);
        System.out.print(solution);
    }

}
