package misc;

import common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeWithLevels {

    /**
     * Example method to print the current node and the current level using BST (Breadth First Search).
     *
     * @param treeNode
     * @return
     */
    public static List<List<Integer>> BSTToNestedList(TreeNode treeNode) {
        List<List<Integer>> nestedList = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        q.add(treeNode);
        int level = 1;
        int count = 1;
        int currentLevel = 1;

        while (!q.isEmpty()) {
            TreeNode node = q.poll();

            if(node == null) {
                count++;
                continue;
            }

            q.add(node.left);
            q.add(node.right);

            if(nestedList.size() == currentLevel - 1) {
                nestedList.add(new ArrayList<>());
            }
            nestedList.get(currentLevel-1).add(node.val);

            count++;
            if(count/2 == level) {
                currentLevel++;
                level *= 2;
            }
        }

        return nestedList;
    }

}
