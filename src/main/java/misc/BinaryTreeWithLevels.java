package misc;

import common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeWithLevels {

    /**
     * Example method to print the current node and the current level using BST (Breadth First Search).
     *
     * @param treeNode
     */
    public static void printBSTWithLevels(TreeNode treeNode) {
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

            System.out.println("Node: "+node.val+" - Current level: " + currentLevel);
            q.add(node.left);
            q.add(node.right);

            count++;
            if(count/2 == level) {
                currentLevel++;
                level *= 2;
            }
        }
    }

}
