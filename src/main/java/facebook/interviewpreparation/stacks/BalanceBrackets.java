package facebook.interviewpreparation.stacks;

import java.util.Hashtable;
import java.util.Map;
import java.util.Stack;

public class BalanceBrackets {

    /**
     * Complexity: O(N)
     * Space: O(N+M) where M its the number of characters to be validated (Stored in the Map)
     *
     * @param s
     * @return
     */
    public static boolean isBalanced(String s) {
        if(s == null || s.isEmpty())
            return true;

        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> characterMap = charactersTable();

        for (int i = 0; i < chars.length; i++) {
            if(isPut(chars[i])) {
                stack.add(chars[i]);
            } else {
                if(stack.isEmpty())
                    return false;

                char topElement = stack.pop();
                char expectedCharacter = characterMap.get(topElement);

                if(expectedCharacter != chars[i])
                    return false;
            }
        }

        return true;
    }

    private static boolean isPut(char c) {
        /**
         * ( -> 40
         * [ -> 91
         * { -> 123
         */
        return c == 40 || c == 91 || c == 123;
    }

    private static Map<Character, Character> charactersTable() {
        Map<Character, Character> characterMap = new Hashtable<>();
        characterMap.put('(', ')');
        characterMap.put('[', ']');
        characterMap.put('{', '}');

        return characterMap;
    }

}
