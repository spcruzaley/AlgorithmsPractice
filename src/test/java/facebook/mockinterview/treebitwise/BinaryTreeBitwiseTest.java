package facebook.mockinterview.treebitwise;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeBitwiseTest {

    @Test
    public void testBitwiseTree() {
        TreeNode treeNode = buildTreeNode();
        BinaryTreeBitwise.bitwiseTree(treeNode.left.right);

        /* Expected output
          1
        /   \
       1     1
      / \   /  \
     1   1  1   1
         */
        validateTree(treeNode);
    }

    private void validateTree(TreeNode treeNode) {
        if(treeNode == null)
            return;

        Assert.assertEquals(1, treeNode.val);
        validateTree(treeNode.left);
        validateTree(treeNode.right);
    }

    private TreeNode buildTreeNode() {
        /*
          0
        /   \
       0     1
      / \   /  \
     1   0  1   1
         */
        TreeNode treeNode = new TreeNode(0);

        treeNode.left = new TreeNode(0);
        treeNode.left.parent = treeNode;
        treeNode.right = new TreeNode(1);
        treeNode.right.parent = treeNode;

        treeNode.left.left = new TreeNode(1);
        treeNode.left.left.parent = treeNode.left;
        treeNode.left.right = new TreeNode(0);
        treeNode.left.right.parent = treeNode.left;

        treeNode.right.left = new TreeNode(1);
        treeNode.right.left.parent = treeNode.right;
        treeNode.right.right = new TreeNode(1);
        treeNode.right.right.parent = treeNode.right;

        return treeNode;
    }

}
