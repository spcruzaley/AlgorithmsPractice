package leetcode.premium.microsoft.linkedlist;

import common.ListNode;

public class MergeKSortedLists {

    /**
     * URL: https://leetcode.com/problems/merge-k-sorted-lists/
     *
     * Complexity: O(N*length(M)), where N is the number of ListNodes and length(M) is the length of each ListNode
     * Space: O(max(M)), where M is the length of one of the listNodes
     *
     * See (src/test/java/leetcode/premium/microsoft/linkedlist/MergeKSortedListsTest.java) for test cases
     *
     * @param lists
     * @return
     */
    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode newList = null;
        for (ListNode listNode: lists) {
            newList = mergeLists(newList, listNode);
        }

        return newList;
    }

    private static ListNode mergeLists(ListNode listA, ListNode listB) {
        if(listA == null && listB == null)
            return null;

        Integer pointerA = (listA != null) ? listA.val : Integer.MAX_VALUE;
        Integer pointerB = (listB != null) ? listB.val : Integer.MAX_VALUE;

        ListNode newListNode = new ListNode(Math.min(pointerA, pointerB));
        if(pointerA <= pointerB) {
            newListNode.next = mergeLists(listA.next, listB);
        } else {
            newListNode.next = mergeLists(listA, listB.next);
        }

        return newListNode;
    }

}
