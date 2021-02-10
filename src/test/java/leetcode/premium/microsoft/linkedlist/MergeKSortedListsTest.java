package leetcode.premium.microsoft.linkedlist;

import common.ListNode;
import common.Utils;
import org.junit.Assert;
import org.junit.Test;

public class MergeKSortedListsTest {

    @Test
    public void testMergeKLists() {
        String expectedResult = "1-1-2-2-3-3";

        ListNode listA = Utils.generateListNode(new Integer[]{1,2,3});
        ListNode listB = Utils.generateListNode(new Integer[]{1,2,3});
        ListNode[] lists = new ListNode[]{listA, listB};

        ListNode newList = MergeKSortedLists.mergeKLists(lists);
        String actualResult = Utils.printListNode(newList);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMergeKListsTwo() {
        String expectedResult = "1-2-3-8-9-10";

        ListNode listA = Utils.generateListNode(new Integer[]{1,3,9,10});
        ListNode listB = Utils.generateListNode(new Integer[]{2,8});
        ListNode[] lists = new ListNode[]{listA, listB};

        ListNode newList = MergeKSortedLists.mergeKLists(lists);
        String actualResult = Utils.printListNode(newList);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMergeKListsThree() {
        String expectedResult = "1-2-3-8-9-10";

        ListNode listA = Utils.generateListNode(new Integer[]{2,8});
        ListNode listB = Utils.generateListNode(new Integer[]{1,3,9,10});
        ListNode[] lists = new ListNode[]{listA, listB};

        ListNode newList = MergeKSortedLists.mergeKLists(lists);
        String actualResult = Utils.printListNode(newList);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMergeKListsTreeListNodes() {
        String expectedResult = "1-2-2-3-4-6-8-8-9-9-10";

        ListNode listA = Utils.generateListNode(new Integer[]{2,8});
        ListNode listB = Utils.generateListNode(new Integer[]{1,3,9,10});
        ListNode listC = Utils.generateListNode(new Integer[]{2,4,6,8,9});
        ListNode[] lists = new ListNode[]{listA, listB, listC};

        ListNode newList = MergeKSortedLists.mergeKLists(lists);
        String actualResult = Utils.printListNode(newList);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMergeKListsWithNullList() {
        String expectedResult = "1-2-2-3-4-6-8-8-9-9-10";

        ListNode listA = Utils.generateListNode(new Integer[]{2,8});
        ListNode listB = Utils.generateListNode(new Integer[]{1,3,9,10});
        ListNode listC = null;
        ListNode listD = Utils.generateListNode(new Integer[]{2,4,6,8,9});
        ListNode[] lists = new ListNode[]{listA, listB, listC, listD};

        ListNode newList = MergeKSortedLists.mergeKLists(lists);
        String actualResult = Utils.printListNode(newList);

        Assert.assertEquals(expectedResult, actualResult);
    }

}
