package codeforces.loveusername;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        reader.readLine();
        int[] scores = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        /***** SOlUTION *****/
        int solution = solution(scores);
        System.out.print(solution);
    }

    public static int solution(int[] scores) {
        int count = 0;
        int max = scores[0];
        int min = scores[0];

        for (int score: scores) {
            //get first amazing scores
            if (score > max) {
                count++;
                max = score;
            }
            //get second amazing scores
            if (score < min) {
                count++;
                min = score;
            }
        }

        return count;
    }

}
