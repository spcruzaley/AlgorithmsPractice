package codesignal.boxblur.method1;

import org.junit.Assert;
import org.junit.Test;

public class BoxBlurTest {

    @Test
    public void testBoxBlurFirstTest() {
        int[][] expectedMatrix = new int[][]{{1}};

        int[][] actualMatrix = BoxBlur.boxBlur(generateMatrixFirstCase());

        Assert.assertArrayEquals(expectedMatrix[0], actualMatrix[0]);
    }

    @Test
    public void testBoxBlurSecondTest() {
        int[][] expectedMatrix = new int[][]{
                {5,4},
                {6,7}
        };

        int[][] actualMatrix = BoxBlur.boxBlur(generateMatrixSecondCase());

        Assert.assertArrayEquals(expectedMatrix[0], actualMatrix[0]);
        Assert.assertArrayEquals(expectedMatrix[1], actualMatrix[1]);
    }

    private int[][] generateMatrixFirstCase() {
        int[][] matrix = new int[][]{
                {1, 1, 1},
                {1, 7, 1},
                {1, 1, 1}
        };

        return matrix;
    }

    private int[][] generateMatrixSecondCase() {
        int[][] matrix = new int[][]{
                {7, 4, 0, 1},
                {5, 6, 2, 2},
                {6, 10, 7, 8},
                {9, 14, 2, 20}
        };

        return matrix;
    }

}
