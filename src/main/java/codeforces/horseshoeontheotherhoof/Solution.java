package codeforces.horseshoeontheotherhoof;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] input = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        /***** SOlUTION *****/
        int solution = solution(input);
        System.out.print(solution);
    }

    public static int solution(int[] input) {
        return input.length - Arrays.stream(input).boxed().collect(Collectors.toSet()).size();
    }

}
