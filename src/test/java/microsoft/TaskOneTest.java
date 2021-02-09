package microsoft;

import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TaskOneTest {

    @Test
    public void testingFirstTest() {
        int expectedOccurrences = 4;

        int actualOccurrences = new TaskOne().solution(buildFirstTreeTest());

        Assert.assertEquals(expectedOccurrences, actualOccurrences);
    }

    @Test
    public void testingSecondTest() {
        int expectedOccurrences = 2;

        int actualOccurrences = new TaskOne().solution(buildSecondTreeTest());

        Assert.assertEquals(expectedOccurrences, actualOccurrences);
    }

    @Test
    public void testingTestWithNullTree() {
        int expectedOccurrences = 0;

        int actualOccurrences = new TaskOne().solution(null);

        Assert.assertEquals(expectedOccurrences, actualOccurrences);
    }

    @Test
    public void testingTestWithOnlyRoot() {
        int expectedOccurrences = 1;

        int actualOccurrences = new TaskOne().solution(new TreeNode(5));

        Assert.assertEquals(expectedOccurrences, actualOccurrences);
    }

    private static TreeNode buildFirstTreeTest() {
        TreeNode tree = new TreeNode(5);
        tree.left = new TreeNode(3);
        tree.left.left = new TreeNode(20);
        tree.left.right = new TreeNode(21);
        tree.right = new TreeNode(10);
        tree.right.left = new TreeNode(1);

        return tree;
    }

    private static TreeNode buildSecondTreeTest() {
        TreeNode tree = new TreeNode(8);
        tree.left = new TreeNode(2);
        tree.left.left = new TreeNode(8);
        tree.left.right = new TreeNode(7);
        tree.right = new TreeNode(6);

        return tree;
    }

}
