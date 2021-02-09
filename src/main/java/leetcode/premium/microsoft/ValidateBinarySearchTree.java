package leetcode.premium.microsoft;

import common.TreeNode;

public class ValidateBinarySearchTree {

    /**
     * URL: https://leetcode.com/problems/validate-binary-search-tree/
     *
     * Complexity: O(N)
     * Space: O(N)
     *
     * See (/Volumes/EXTERNAL/Personal/github/AlgorithmsPractice/src/test/java/leetcode/premium/microsoft/ValidateBinarySearchTreeTest.java)
     * for test cases
     *
     * @param root
     * @return
     */
    public static boolean isValidBST(TreeNode root) {
        return isValidBSTHelper(root, null, null);
    }

    public static boolean isValidBSTHelper(TreeNode node, Integer left, Integer right) {
        if(node == null)
            return true;

        if((left != null && node.val <= left) || (right != null && node.val >= right))
            return false;

        return isValidBSTHelper(node.left, left, node.val) && isValidBSTHelper(node.right, node.val, right);
    }

}
