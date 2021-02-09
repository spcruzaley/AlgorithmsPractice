package leetcode.premium.microsoft;


import common.TreeNode;
import common.Utils;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversalTest {

    @Test
    public void testZigzagLevelOrder() {
        List<List<Integer>> expectedList = Utils.generateNestedList(new Integer[]{3,9,20,11,null,15,7});

        TreeNode treeNode = Utils.generateTreeNode(new Integer[]{3,9,20,null,null,15,7});
        List<List<Integer>> actualNestesList = BinaryTreeZigzagLevelOrderTraversal.zigzagLevelOrder(treeNode);
        System.out.println(actualNestesList);

        Assert.assertArrayEquals(expectedList.toArray(), actualNestesList.toArray());
    }

    @Test
    public void test() {
        int nodes = 33;
        int level = 1;

        for (int i = 1; i <= nodes; i++) {
            System.out.println("Counter: "+i+" - Level: " + level);
            if(i/2 == level) {
                level *= 2;
            }
        }

    }

}
