package leetcode.premium.microsoft.arraysstrings;

public class ValidPalindrome {

    /**
     * URL: https://leetcode.com/problems/valid-palindrome/
     *
     * Complexity: O(N)
     * Space: O(N)
     *
     * See (src/test/java/leetcode/premium/microsoft/arraysstrings/ValidPalindromeTest.java) for test cases
     *
     * @param s
     * @return
     */
    public static boolean isPalindrome(String s) {
        if(s == null || s.isEmpty())
            return true;

        char[] chars = s.toLowerCase().toCharArray();

        int leftPointer = 0;
        int rightPointer = s.length()-1;

        while(leftPointer <= rightPointer) {
            if(isCharacter(chars[leftPointer]) && isCharacter(chars[rightPointer])) {
                if(chars[leftPointer++] != chars[rightPointer--]) {
                    return false;
                }
            } else {
                if(!isCharacter(chars[leftPointer])) leftPointer++;
                if(!isCharacter(chars[rightPointer])) rightPointer--;
            }
        }

        return true;
    }

    private static boolean isCharacter(char ch) {
        //Validating lower
        return ((int)ch >= 97 && (int)ch <= 122) || ((int)ch >= 48 && (int)ch <= 57);
    }

}
