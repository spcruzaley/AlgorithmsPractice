package common;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Utils {

    /**
     * Swap two values in a given int array
     * <p>
     * See (/src/test/java/common/UtilsTest.java) for test cases
     *
     * @param array
     * @param indexA
     * @param indexB
     */
    public static void swap(int[] array, int indexA, int indexB) {
        int tmp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = tmp;
    }

    /**
     * Generate a TreeNode object from a given Integer array
     *
     * @param intNodes
     * @return
     */
    public static TreeNode generateTreeNode(Integer[] intNodes) {
        TreeNode treeNode = generateTreeNode(intNodes, 1);

        return treeNode;
    }

    /**
     * Generate a nested list form a given Integer array
     *
     * TODO: Needs to fix it
     *
     * @param elements
     * @return
     */
    public static List<List<Integer>> generateNestedList(Integer[] elements) {
        List<List<Integer>> nestedList = new ArrayList<>();
        int level = 0;

        for (int i = 1; i < elements.length; i *= 2) {
            nestedList.add(level, new ArrayList<>());
            for (int j = 0; j < i; j++) {
                if(elements[i+j-1] != null)
                    nestedList.get(level).add(elements[i+j-1]);
            }
            level++;
        }

        return nestedList;
    }

    private static TreeNode generateTreeNode(Integer[] intNodes, int index) {
        if(index <= intNodes.length) {
            Integer currentValue = intNodes[index-1];

            if(currentValue != null) {
                TreeNode treeNode = new TreeNode(currentValue);
                treeNode.left = generateTreeNode(intNodes, index * 2);
                treeNode.right = generateTreeNode(intNodes, index * 2 + 1);

                return treeNode;
            }
        }

        return null;
    }

    public static void BFSTraverse(TreeNode root) {
        if (root == null)
            return;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            int current = node.val;

            System.out.print(current + "-");

            if (node.left != null)
                q.add(node.left);
            if (node.right != null)
                q.add(node.right);
        }
    }

    public static String printListNode(ListNode listNode) {
        if(listNode == null)
            return "";

        StringBuilder builder = new StringBuilder();

        while(listNode.next != null) {
            builder.append(listNode.val).append("-");
            listNode = listNode.next;
        }
        builder.append(listNode.val);

        return builder.toString();
    }

    public static ListNode generateListNode(Integer[] values) {
        return generateListNode(values, 0);
    }

    private static ListNode generateListNode(Integer[] values, int index) {
        if(index == values.length)
            return null;

        ListNode listNode = new ListNode(values[index]);
        listNode.next = generateListNode(values, index + 1);

        return listNode;
    }
}
