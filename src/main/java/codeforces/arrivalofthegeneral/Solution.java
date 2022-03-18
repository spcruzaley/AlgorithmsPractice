package codeforces.arrivalofthegeneral;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        reader.readLine();
        int[] soldiers = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        /***** SOlUTION *****/
        int movements = solution(soldiers);
        System.out.print(movements);
    }

    public static int solution(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndex = 0;
        int maxIndex = 0;
        int steps = 0;

        //Search max and min index
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
            if (array[i] <= min) {
                min = array[i];
                minIndex = i;
            }
        }

        //Compute steps for minimum
        steps = array.length - minIndex - 1;
        //Compute steps for maximum
        steps += maxIndex;

        //If min and max cross
        if (minIndex < maxIndex) {
            steps--;
        }

        return steps;
    }

}
