package leetcode.premium.microsoft.linkedlist;

import common.ListNode;
import common.Utils;
import org.junit.Assert;
import org.junit.Test;

public class ReverseLinkedListTest {

    @Test
    public void testReverseList() {
        String expectedListNode = "5-4-3-2-1";

        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        ListNode actualListNode = ReverseLinkedList.reverseList(listNode);

        Assert.assertEquals(expectedListNode, Utils.printListNode(actualListNode));
    }

}
