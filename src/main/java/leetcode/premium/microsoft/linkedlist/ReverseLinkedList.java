package leetcode.premium.microsoft.linkedlist;

import common.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class ReverseLinkedList {

    /**
     * URL: https://leetcode.com/problems/reverse-linked-list/
     *
     * Solution taken from solution section
     *
     *  Complexity: O(N)
     *  Space: O(N)
     *
     * See (src/test/java/leetcode/premium/microsoft/linkedlist/ReverseLinkedListTest.java) for test cases
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;

        while(current != null) {
            ListNode tmp = current.next;
            current.next = previous;
            previous = current;
            current = tmp;
        }

        return previous;
    }

}
