package leetcode.MoveZeroes.method3;

import org.junit.Assert;
import org.junit.Test;

public class MoveZeroesTest {

    @Test
    public void testMoveZeroes() {
        int[] expectedArray = new int[]{1,3,12,0,0};

        int[] actualArray = new int[]{0,1,0,3,12};
        MoveZeroes.moveZeroes(actualArray);

        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testMoveZeroesWorstCase() {
        int[] expectedArray = new int[]{1,0,0,0,0,0};

        int[] actualArray = new int[]{0,0,0,0,0,1};
        MoveZeroes.moveZeroes(actualArray);

        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testMoveZeroesMiddleCase() {
        int[] expectedArray = new int[]{1,2,3,0,0,0};

        int[] actualArray = new int[]{1,0,2,0,3,0};
        MoveZeroes.moveZeroes(actualArray);

        Assert.assertArrayEquals(expectedArray, actualArray);
    }

}
