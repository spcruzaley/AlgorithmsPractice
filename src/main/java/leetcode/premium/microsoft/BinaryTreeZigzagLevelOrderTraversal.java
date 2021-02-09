package leetcode.premium.microsoft;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;


public class BinaryTreeZigzagLevelOrderTraversal {

    /**
     * URL: https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
     *
     * I couldn't solve it my self, the solution was taken from Solution Section in LeetCode.
     * see https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/solution/ for original solution.
     *
     *  Complexity: O(N)
     *  Space: O(H) where HH is the height of the tree
     *
     * See (/Volumes/EXTERNAL/Personal/github/AlgorithmsPractice/src/test/java/leetcode/premium/microsoft/BinaryTreeZigzagLevelOrderTraversalTest.java) for test cases
     *
     * @param treeNode
     * @return
     */
    public static List<List<Integer>> zigzagLevelOrder(TreeNode treeNode) {
        List<List<Integer>> mainList = new ArrayList<>();
        if(treeNode != null)
            zigzagLevelOrder(treeNode, mainList, 0);

        return mainList;
    }

    private static void zigzagLevelOrder(TreeNode node, List<List<Integer>> mainList, int level) {
        if(level >= mainList.size()) {
            List<Integer> nestedList = new ArrayList<>();
            nestedList.add(node.val);

            mainList.add(nestedList);
        } else {
            if(level%2 != 0) {
                mainList.get(level).add(0, node.val);
            } else {
                mainList.get(level).add(node.val);
            }
        }

        if(node.left != null)
            zigzagLevelOrder(node.left, mainList, level+1);
        if(node.right != null)
            zigzagLevelOrder(node.right, mainList, level+1);
    }

}
