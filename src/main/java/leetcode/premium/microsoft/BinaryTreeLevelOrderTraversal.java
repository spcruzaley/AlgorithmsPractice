package leetcode.premium.microsoft;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {

    /**
     * URL: https://leetcode.com/problems/binary-tree-inorder-traversal
     *
     *  Complexity: O(N)
     *  Space: O(N)
     *
     * See ()
     *
     * @param root
     * @return
     */
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        DFS(root, list, 0);

        return list;
    }

    public static void DFS(TreeNode root, List<List<Integer>> levels, int level) {
        if(root == null)
            return;

        if(levels.size() == level)
            levels.add(new ArrayList<>());

        levels.get(level).add(root.val);

        DFS(root.left, levels, level+1);
        DFS(root.right, levels, level+1);
    }

}
