package codesignal.minesweeper.method2;

import org.junit.Assert;
import org.junit.Test;

public class MinesweeperTest {

    @Test
    public void testMinesweeperFirstTest() {
        int[][] expectedMatrix = new int[][]{
                {1,2,1},
                {2,1,1},
                {1,1,1}
        };

        boolean[][] inputMatrix = generateFirstInputMatrix();
        int[][] actualMatrix = Minesweeper.minesweeper(inputMatrix);

        Assert.assertArrayEquals(expectedMatrix[0], actualMatrix[0]);
        Assert.assertArrayEquals(expectedMatrix[1], actualMatrix[1]);
        Assert.assertArrayEquals(expectedMatrix[2], actualMatrix[2]);
    }

    @Test
    public void testMinesweeperSecondTest() {
        int[][] expectedMatrix = new int[][]{
                {0,0,0},
                {0,0,0}
        };

        boolean[][] inputMatrix = generateSecondInputMatrix();
        int[][] actualMatrix = Minesweeper.minesweeper(inputMatrix);

        Assert.assertArrayEquals(expectedMatrix[0], actualMatrix[0]);
        Assert.assertArrayEquals(expectedMatrix[1], actualMatrix[1]);
    }

    @Test
    public void testMinesweeperThirdTest() {
        int[][] expectedMatrix = new int[][]{
                {0,1,1},
                {0,1,0}
        };

        boolean[][] inputMatrix = generateThreeInputMatrix();
        int[][] actualMatrix = Minesweeper.minesweeper(inputMatrix);

        Assert.assertArrayEquals(expectedMatrix[0], actualMatrix[0]);
        Assert.assertArrayEquals(expectedMatrix[1], actualMatrix[1]);
    }

    //Testing helper methods
    @Test
    public void isValidBoundariesFirstTest() {
        boolean actualValid = Minesweeper.isValid(3, 4, 2, 4);

        Assert.assertFalse(actualValid);
    }

    @Test
    public void isValidBoundariesSecondTest() {
        boolean actualValid = Minesweeper.isValid(1, 2, 2, 4);

        Assert.assertTrue(actualValid);
    }

    private boolean[][] generateFirstInputMatrix() {
        return new boolean[][]{
                {true, false, false},
                {false, true, false},
                {false, false, false}
        };
    }

    private boolean[][] generateSecondInputMatrix() {
        return new boolean[][]{
                {false, false, false},
                {false, false, false}
        };
    }

    private boolean[][] generateThreeInputMatrix() {
        return new boolean[][]{
                {false, false, false},
                {false, false, true}
        };
    }

}
