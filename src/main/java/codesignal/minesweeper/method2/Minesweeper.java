package codesignal.minesweeper.method2;

import java.util.*;

public class Minesweeper {

    /**
     * For this approach I used something like a BST, searching all neighbors for a given cell, checking it if its a
     * valid cell using a helper class (Coordinates) to avoid to do all the validations "by hand" (Like in method1).
     *
     *  Complexity: O(N^2), I only need to traverse all the matrix, even I'm doing a validation for a valid boundaries
     *              by cell, it will always constant, so I could have something like O((N^2) * 8) - The 8 means the for loop
     *              that I used for check all the neighbors, so that 8 could be removed.
     *  Space: O(N) where N its the original matrix size, due to we need to return the array with the mines number.
     *
     * @param matrix
     * @return
     */
    static int[][] minesweeper(boolean[][] matrix) {
        int[][] finalMatrix = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int mines = BSTArray(matrix, i, j);
                finalMatrix[i][j] = mines;
            }
        }

        return finalMatrix;
    }

    private static int BSTArray(boolean[][] matrix, int i, int j) {
        List<Coordinates> coordinatesList = buildCoordinates();
        Queue<Boolean> queue = new LinkedList<>();
        int mines = 0;

        //traverse all the cell boundaries (right, left, left-down, etc.)
        for (int k = 0; k < 8; k++) {
            int x = coordinatesList.get(k).x;
            int y = coordinatesList.get(k).y;

            //Validation to know if a cell is not out of boundary
            if(isValid(i+x, j+y, matrix.length, matrix[i].length)) {
                queue.add(matrix[i+x][j+y]);
            }
        }

        //Now just validate if we have mines and increment the counter
        while (!queue.isEmpty()) {
            if(queue.poll())
                mines++;
        }

        return mines;
    }

    public static boolean isValid(int currentX, int currentY, int boundaryX, int boundaryY) {
        return currentX >= 0 && currentY >= 0 && currentX < boundaryX && currentY < boundaryY;
    }

    private static List<Coordinates> buildCoordinates() {
        List<Coordinates> coordinatesList = new ArrayList<>();

        coordinatesList.add(new Coordinates(0,1)); //right
        coordinatesList.add(new Coordinates(1,1)); //right-down
        coordinatesList.add(new Coordinates(1,0)); //down
        coordinatesList.add(new Coordinates(1,-1)); //down-left
        coordinatesList.add(new Coordinates(0,-1)); //left
        coordinatesList.add(new Coordinates(-1,-1)); //left-up
        coordinatesList.add(new Coordinates(-1,0)); //up
        coordinatesList.add(new Coordinates(-1,1)); //up-right

        return coordinatesList;
    }

    static class Coordinates {
        int x;
        int y;

        public Coordinates(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
