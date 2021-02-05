package codesignal.minesweeper.method1;

public class Minesweeper {

    /**
     * First approach validating boundaries manually, I mean, validate if left is valid, right, down, etc.
     *
     *  Complexity: O(N^2) due to we need to validate each field in the array
     *  Space: O(N) where N its the original matrix size, due to we need to return the array with the mines number
     *
     * See (/src/test/java/codesignal/minesweeper/method1/MinesweeperTest.java) for test cases
     *
     * @param matrix
     * @return
     */
    static int[][] minesweeper(boolean[][] matrix) {
        int[][] minesNumber = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int mines = getMinesBoundary(matrix, i, j);
                minesNumber[i][j] = mines;
            }
        }

        return minesNumber;
    }

    private static int getMinesBoundary(boolean[][] matrix, int i, int j) {
        int mines = 0;

        //right
        if(j + 1 < matrix[0].length)
            mines += (matrix[i][j+1]) ? 1 : 0;
        //right-down
        if(j + 1 < matrix[0].length && i+1 < matrix.length)
            mines += (matrix[i+1][j+1]) ? 1 : 0;
        //down
        if(i+1 < matrix.length)
            mines += (matrix[i+1][j]) ? 1 : 0;
        //down-left
        if(i+1 < matrix.length && j-1 >= 0)
            mines += (matrix[i+1][j-1]) ? 1 : 0;
        //left
        if(j-1 >= 0)
            mines += (matrix[i][j-1]) ? 1 : 0;
        //left-up
        if(i-1 >= 0 && j-1 >= 0)
            mines += (matrix[i-1][j-1]) ? 1 : 0;
        //up
        if(i-1 >= 0)
            mines += (matrix[i-1][j]) ? 1 : 0;
        //up-right
        if(i-1 >= 0 && j + 1 < matrix[0].length)
            mines += (matrix[i-1][j+1]) ? 1 : 0;

        return mines;
    }

}
