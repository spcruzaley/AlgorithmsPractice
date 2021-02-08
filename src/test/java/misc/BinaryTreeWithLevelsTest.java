package misc;

import common.TreeNode;
import common.Utils;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class BinaryTreeWithLevelsTest {

    @Test
    public void testBSTToNestedList() {
        String expectedNestedList = "[[3], [9, 20], [11, 15, 7], [1, 1]]";

        TreeNode treeNode = Utils.generateTreeNode(new Integer[]{3,9,20,11,null,15,7,1,1});
        List<List<Integer>> actualNestedList = BinaryTreeWithLevels.BSTToNestedList(treeNode);

        Assert.assertEquals(expectedNestedList, actualNestedList.toString());
    }

}
