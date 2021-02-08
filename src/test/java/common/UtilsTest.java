package common;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class UtilsTest {

    @Test
    public void testSwap() {
        int[] expectedArray = new int[]{1,2,3};

        int[] inputArray = new int[]{2,1,3};
        Utils.swap(inputArray, 0, 1);

        Assert.assertArrayEquals(expectedArray, inputArray);
    }

    @Test
    public void GenerateTreeNode() {
        String expectedOutput = "TreeNode{val=3, left=TreeNode{val=9, left=null, right=null}, right=TreeNode{val=20, " +
                "left=TreeNode{val=15, left=null, right=null}, right=TreeNode{val=7, left=null, right=null}}}";

        Integer[] nodes = new Integer[]{3,9,20,null,null,15,7};
        TreeNode treeNode = Utils.generateTreeNode(nodes);

        Assert.assertEquals(expectedOutput, treeNode.toString());
    }

    @Test
    public void testGenerateNestedList() {
        String expectedResult = "[[3], [9, 20], [15, 7]]";

        Integer[] input = new Integer[]{3,9,20,null,null,15,7};
        List<List<Integer>> actualResult = Utils.generateNestedList(input);

        Assert.assertEquals(expectedResult, actualResult.toString());
    }

}
