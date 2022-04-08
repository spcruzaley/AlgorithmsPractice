package codeforces.cupboards;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int cupboards = Integer.parseInt(reader.readLine());
        int[][] doors = new int[cupboards][];

        for (int i = 0; i < cupboards; i++) {
            doors[i] = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        }

        /***** SOlUTION *****/
        int solution = solution(doors);
        System.out.print(solution);
    }

    public static int solution(int[][] doors) {
        // Left side
        int seconds = getSeconds(doors, 0);
        // Right side
        seconds += getSeconds(doors, 1);

        return seconds;
    }

    /**
     * side 0: left
     * side 1: right
     */
    private static int getSeconds(int[][] doors, int side) {
        int opened = 0;
        for (int[] door : doors) {
            opened += door[side];
        }
        int closed = doors.length - opened;

        int seconds = 0;
        int windowStatus = opened < closed ? 1 : 0;
        for (int[] door : doors) {
            if (door[side] == windowStatus) seconds++;
        }

        return seconds;
    }
}
