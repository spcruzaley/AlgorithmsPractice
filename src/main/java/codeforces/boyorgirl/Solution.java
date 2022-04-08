package codeforces.boyorgirl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String username = reader.readLine();

        /***** SOlUTION *****/
        String solution = solution(username);
        System.out.print(solution);
    }

    public static String solution(String code) {
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < code.length(); i++) {
            set.add(code.charAt(i));
        }

        return set.size() % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!";
    }

}
