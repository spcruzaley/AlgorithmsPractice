package facebook.interviewpreparation.strings.rotationalcipher;

public class RotationalCipher {

    /**
     * Complexity: O(N)
     * Space: O(N), due to I'm using StringBuilder to store the final cipher String
     *
     * @param input
     * @param rotationFactor
     * @return
     */
    public String rotationalCipher(String input, int rotationFactor) {
        char[] chars = input.toCharArray();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            if(isNumber(chars[i])) {
                builder.append(rotateLetter(chars[i], rotationFactor, '0'));
            } else if(isLowercase(chars[i])) {
                builder.append(rotateLetter(chars[i], rotationFactor, 'a'));
            } else if(isUppercase(chars[i])) {
                builder.append(rotateLetter(chars[i], rotationFactor, 'A'));
            } else {
                builder.append(chars[i]);
            }
        }

        return builder.toString();
    }

    private char rotateLetter(char currentChar, int rotationFactor, char startChar) {
        int newPosition = (currentChar - startChar + rotationFactor) % (startChar == '0' ? 10 : 26);
        return (char)(newPosition + startChar);
    }

    private boolean isNumber(char c) {
        return (c >= 48 && c <= 57);
    }

    private boolean isUppercase(char c) {
        return (c >= 65 && c <= 90);
    }

    private boolean isLowercase(char c) {
        return (c >= 97 && c <= 122);
    }
}