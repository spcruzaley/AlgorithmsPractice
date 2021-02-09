package leetcode.premium.microsoft;

import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class ValidateBinarySearchTreeTest {

    @Test
    public void test() {
        System.out.println(Integer.MAX_VALUE);
    }

    @Test
    public void isValidBSTWithOnlyRoot() {
        TreeNode treeNode = new TreeNode(1);

        boolean isValid = ValidateBinarySearchTree.isValidBST(treeNode);

        Assert.assertTrue(isValid);
    }

    @Test
    public void isValidBSTWithOnlyRootWithBiggerInt() {
        TreeNode treeNode = new TreeNode(2147483647);

        boolean isValid = ValidateBinarySearchTree.isValidBST(treeNode);

        Assert.assertTrue(isValid);
    }

    @Test
    public void isValidBSTWithOnlyLeft() {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(1);

        boolean isValid = ValidateBinarySearchTree.isValidBST(treeNode);

        Assert.assertFalse(isValid);
    }

    @Test
    public void isValidBSTWithOnlyRight() {
        TreeNode treeNode = new TreeNode(1);
        treeNode.right = new TreeNode(1);

        boolean isValid = ValidateBinarySearchTree.isValidBST(treeNode);

        Assert.assertFalse(isValid);
    }

    @Test
    public void isValidBSTWhenIsValidTestOne() {
        TreeNode treeNode = new TreeNode(2);
        treeNode.left = new TreeNode(1);
        treeNode.right = new TreeNode(3);

        boolean isValid = ValidateBinarySearchTree.isValidBST(treeNode);

        Assert.assertTrue(isValid);
    }

    @Test
    public void isValidBSTWhenIsInValidTestTwo() {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);

        boolean isValid = ValidateBinarySearchTree.isValidBST(treeNode);

        Assert.assertFalse(isValid);
    }

    @Test
    public void isValidBSTWhenIsValidTestTwo() {
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(5);
        treeNode.left.left = new TreeNode(3);
        treeNode.left.right = new TreeNode(7);
        treeNode.right = new TreeNode(15);
        treeNode.right.right = new TreeNode(13);

        boolean isValid = ValidateBinarySearchTree.isValidBST(treeNode);

        Assert.assertFalse(isValid);
    }

}
