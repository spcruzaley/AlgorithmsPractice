package leetcode.premium.microsoft;

import common.TreeNode;
import common.Utils;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class BinaryTreeLevelOrderTraversalTest {

    @Test
    public void testLevelOrder() {
        List<List<Integer>> expectedList = Utils.generateNestedList(new Integer[]{3,9,20,null,null,15,7});

        TreeNode treeNode = Utils.generateTreeNode(new Integer[]{3,9,20,null,null,15,7});
        List<List<Integer>> actualList = BinaryTreeLevelOrderTraversal.levelOrder(treeNode);

        Assert.assertArrayEquals(expectedList.toArray(), actualList.toArray());
    }

}
