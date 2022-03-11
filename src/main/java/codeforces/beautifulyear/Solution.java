package codeforces.beautifulyear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String code = reader.readLine();

        /***** SOlUTION *****/
        int solution = solution(Integer.parseInt(code));
        System.out.print(solution);
    }

    public static int solution(int year) {
        int addition = 1;
        boolean isUnique = hasUniqueNumbers(year + addition, 4);

        while(!isUnique) {
            addition++;
            isUnique = hasUniqueNumbers(year + addition, 4);
        }

        return year + addition;
    }

    public static boolean hasUniqueNumbers(int number, int length) {
        Set<Character> characters = String.valueOf(number)
                .chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.toSet());

        return characters.size() == length;
    }

}
