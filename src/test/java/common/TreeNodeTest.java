package common;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNodeTest {

    @Test
    public void testBFSTraverse() {
        TreeNode treeNode = Utils.generateTreeNode(new Integer[]{3,9,20,11,null,15,7});
        List<Integer> list = new ArrayList<>();

        BFS(treeNode, list);

        System.out.println(list.toString());
    }

    private void BFS(TreeNode treeNode, List<Integer> list) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(treeNode);

        while(!q.isEmpty()) {
            TreeNode node = q.poll();

            if(node != null) {
                list.add(node.val);

                if(node.left != null)
                    q.add(node.left);
                if(node.right != null)
                    q.add(node.right);
            }
        }
    }

}
