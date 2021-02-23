package misc.treesandgraphs.averagebylevel;

import common.TreeNode;
import common.Utils;
import org.junit.Assert;
import org.junit.Test;

public class AverageByLevelTest {

    @Test
    public void testGetAveragesByLevel() {
        int[] expectedOutput = {4,8,6,6};

        TreeNode treeNode = Utils.generateTreeNode(new Integer[]{4,7,9,10,2,null,6,null, null, null, 6});
        int[] actualOutput = AverageByLevel.getAveragesByLevel(treeNode);

        Assert.assertArrayEquals(expectedOutput, actualOutput);
    }

}
