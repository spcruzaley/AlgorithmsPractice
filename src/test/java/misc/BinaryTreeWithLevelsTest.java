package misc;

import common.TreeNode;
import common.Utils;
import org.junit.Test;

public class BinaryTreeWithLevelsTest {

    @Test
    public void testPrintBSTWithLevels() {
        TreeNode treeNode = Utils.generateTreeNode(new Integer[]{3,9,20,11,null,15,7,1,1});
        BinaryTreeWithLevels.printBSTWithLevels(treeNode);
    }

}
