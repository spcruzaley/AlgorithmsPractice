package leetcode.premium.microsoft.linkedlist;

import common.ListNode;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers {

    /**
     * Complexity O(max(N,M)): The maximum value of N and M, where
     *      N is the length of the fist ListNode, and
     *      M the length of the second ListNode
     * Space: O(N)
     *
     * See (src/test/java/leetcode/premium/microsoft/linkedlist/AddTwoNumbersTest.java) for test cases
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> listA = getElementListReverted(l1);
        List<Integer> listB = getElementListReverted(l2);

        return populateResultList(listA, listB, listA.size() - 1, listB.size() - 1, 0);
    }

    private static ListNode populateResultList(List<Integer> listA, List<Integer> listB, int indexA, int indexB, int resto) {
        if(indexA < 0 && indexB < 0) {
            if(resto > 0)
                return new ListNode(resto);
            else
                return null;
        }

        int valueInA = (indexA < 0) ? 0 : listA.get(indexA);
        int valueInB = (indexB < 0) ? 0 : listB.get(indexB);

        int sum = valueInA + valueInB + resto;
        resto = 0;
        if(sum > 9) {
            resto = sum / 10;
            sum = sum % 10;
        }

        ListNode listNode = new ListNode(sum);
        listNode.next = populateResultList(listA, listB, indexA - 1, indexB - 1, resto);

        return listNode;
    }

    private static List<Integer> getElementListReverted(ListNode listNode) {
        List<Integer> list = new ArrayList<>();
        ListNode previous = null;
        ListNode current = listNode;

        while (current != null) {
            ListNode tmp = current.next;
            current.next = previous;
            previous = current;
            current = tmp;
        }
        while(previous != null) {
            list.add(previous.val);
            previous = previous.next;
        }

        return list;
    }

}
