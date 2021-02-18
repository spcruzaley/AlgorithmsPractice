package misc.treesandgraphs.bstconstruction.method1;

import org.junit.Assert;
import org.junit.Test;

public class BSTConstructionTest {

    @Test
    public void testInsertAndContains() {
        BSTConstruction bst = new BSTConstruction(5);
        bst.insert(4);
        bst.insert(6);
        bst.insert(2);
        bst.insert(3);

        Assert.assertFalse(bst.contains(1));
        Assert.assertTrue(bst.contains(2));
        Assert.assertFalse(bst.contains(7));
        Assert.assertTrue(bst.contains(6));
    }

    @Test
    public void testInsertAndRemoveRootNode() {
        BSTConstruction bst = getBst();

        Assert.assertTrue(bst.contains(10));
        Assert.assertEquals(11, bst.size());
        bst.remove(10);
        Assert.assertEquals(10, bst.size());
        Assert.assertFalse(bst.contains(10));
        Assert.assertEquals(12, bst.value);
    }

    @Test
    public void testCustomRemove() {
        BSTConstruction bst = new BSTConstruction(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(2);
        bst.insert(5);
        bst.insert(13);
        bst.insert(22);
        bst.insert(1);
        bst.insert(14);
        bst.insert(12);

        Assert.assertTrue(bst.contains(5));
        Assert.assertEquals(10, bst.size());
        bst.remove(5);
        Assert.assertEquals(9, bst.size());
    }

    @Test
    public void testRemoveElementInBSTAsList() {
        BSTConstruction bst = new BSTConstruction(1);
        bst.insert(2);
        bst.insert(3);
        bst.insert(4);

        Assert.assertTrue(bst.contains(1));
        Assert.assertEquals(4, bst.size());
        bst.remove(1);
        Assert.assertEquals(3, bst.size());
    }

    //Left nodes
    @Test
    public void testInsertAndRemoveLeftLeave() {
        BSTConstruction bst = getBst();

        Assert.assertTrue(bst.contains(1));
        Assert.assertEquals(11, bst.size());
        bst.remove(1);
        Assert.assertEquals(10, bst.size());
        Assert.assertFalse(bst.contains(1));
    }

    @Test
    public void testInsertAndRemoveLeftTwoLeaves() {
        BSTConstruction bst = getBst();

        Assert.assertTrue(bst.contains(1));
        Assert.assertTrue(bst.contains(3));
        Assert.assertEquals(11, bst.size());
        bst.remove(1);
        bst.remove(3);
        Assert.assertEquals(9, bst.size());
        Assert.assertFalse(bst.contains(1));
        Assert.assertFalse(bst.contains(3));
    }

    @Test
    public void testInsertAndRemoveLeftWithTwoChildrenLastLevel() {
        BSTConstruction bst = getBst();

        Assert.assertTrue(bst.contains(2));
        Assert.assertEquals(11, bst.size());
        bst.remove(2);
        Assert.assertEquals(10, bst.size());
        Assert.assertFalse(bst.contains(2));
    }

    @Test
    public void testInsertAndRemoveLeftWithTwoChildrenSecondLevel() {
        BSTConstruction bst = getBst();

        Assert.assertTrue(bst.contains(5));
        Assert.assertEquals(11, bst.size());
        bst.remove(5);
        Assert.assertEquals(10, bst.size());
        Assert.assertFalse(bst.contains(5));
    }

    //Right nodes
    @Test
    public void testInsertAndRemoveRigthLeave() {
        BSTConstruction bst = getBst();

        Assert.assertTrue(bst.contains(14));
        Assert.assertEquals(11, bst.size());
        bst.remove(14);
        Assert.assertEquals(10, bst.size());
        Assert.assertFalse(bst.contains(14));
    }

    @Test
    public void testInsertAndRemoveRightTwoLeaves() {
        BSTConstruction bst = getBst();

        Assert.assertTrue(bst.contains(12));
        Assert.assertTrue(bst.contains(22));
        Assert.assertEquals(11, bst.size());
        bst.remove(12);
        bst.remove(22);
        Assert.assertEquals(9, bst.size());
        Assert.assertFalse(bst.contains(12));
        Assert.assertFalse(bst.contains(22));
    }

    @Test
    public void testInsertAndRemoveRightWithTwoChildrenLastLevel() {
        BSTConstruction bst = getBst();

        Assert.assertTrue(bst.contains(13));
        Assert.assertEquals(11, bst.size());
        bst.remove(13);
        Assert.assertEquals(10, bst.size());
        Assert.assertFalse(bst.contains(13));
    }

    @Test
    public void testInsertAndRemoveRightWithTwoChildrenSecondLevel() {
        BSTConstruction bst = getBst();

        Assert.assertTrue(bst.contains(15));
        Assert.assertEquals(11, bst.size());
        bst.remove(15);
        Assert.assertEquals(10, bst.size());
        Assert.assertFalse(bst.contains(15));
        Assert.assertTrue(bst.contains(22));
    }

    @Test
    public void testInsertBSTAsSingleListToRight() {
        BSTConstruction bst = new BSTConstruction(1);
        bst.insert(2);
        bst.insert(3);
        bst.insert(4);
        bst.insert(5);

        Assert.assertEquals(5, bst.size());
    }

    @Test
    public void testInsertBSTAsSingleListToLeft() {
        BSTConstruction bst = new BSTConstruction(5);
        bst.insert(4);
        bst.insert(3);
        bst.insert(2);
        bst.insert(1);

        Assert.assertEquals(5, bst.size());
    }

    //Testing helper methods
    @Test
    public void testGetLowestNode() {
        BSTConstruction bst = getBst();

        int lowestNode = bst.getLowestNode();

        Assert.assertEquals(1, lowestNode);
    }

    private BSTConstruction getBst() {
        BSTConstruction bst = new BSTConstruction(10);

        bst.insert(5);
        bst.insert(15);

        bst.insert(2);
        bst.insert(6);
        bst.insert(13);
        bst.insert(22);

        bst.insert(1);
        bst.insert(3);
        bst.insert(12);
        bst.insert(14);
        return bst;
    }


}
