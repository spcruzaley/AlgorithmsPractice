package facebook.mockinterview.treebitwise;

public class BinaryTreeBitwise {

    /**
     * Complexity: O(D), where D its the tree depth, due to in this case, the given tree will be considered as a complete BT.
     * Space: 0(D), where D its the tree depth, due to we need to call to the method "bitwiseTree" recursively by each level.
     *
     * @param treeNode
     */
    public static void bitwiseTree(TreeNode treeNode) {
        if(treeNode.parent == null)
            return;

        if(treeNode.left == null && treeNode.right == null)
            treeNode.val = ~treeNode.val & 1;

        treeNode.parent.val = treeNode.parent.left.val & treeNode.parent.right.val;

        bitwiseTree(treeNode.parent);
    }

}

class TreeNode {
    public TreeNode left, right, parent;
    public int val;

    public TreeNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "left=" + left +
                ", right=" + right +
                ", parent=" + (parent != null ? parent.val : "null") +
                ", val=" + val +
                '}';
    }
}