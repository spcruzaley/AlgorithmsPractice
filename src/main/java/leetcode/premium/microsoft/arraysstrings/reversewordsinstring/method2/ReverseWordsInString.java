package leetcode.premium.microsoft.arraysstrings.reversewordsinstring.method2;

import java.util.Stack;
import java.util.StringTokenizer;

public class ReverseWordsInString {

    /**
     * URL: https://leetcode.com/problems/reverse-words-in-a-string
     *
     * Complexity: O(N)
     * Space: O(N+M+K) where:
     *
     *      N its the length of the given string to store the tokenizer string,
     *      M its the space number that the string has,
     *      K its the length of the given string, we used it in the StringBuilder
     *
     * @param s
     * @return
     */
    public static String reverseWords(String s) {
        StringTokenizer tokenizer = new StringTokenizer(s, " ");
        Stack<String> stack = new Stack<>();

        while(tokenizer.hasMoreElements()) {
            stack.add(tokenizer.nextElement().toString());
        }

        StringBuilder builder = new StringBuilder();
        while (!stack.isEmpty()) {
            builder.append(stack.pop());
            builder.append(" ");
        }

        return builder.toString().substring(0, s.length());
    }

}
