package leetcode.premium.microsoft.linkedlist;

import common.ListNode;
import common.Utils;
import org.junit.Assert;
import org.junit.Test;

public class AddTwoNumbersTest {

    @Test
    public void testAddTwoNumbers() {
        String expectedValue = "7-3-1-1";

        ListNode listA = Utils.generateListNode(new Integer[]{2,4,3});
        ListNode listB = Utils.generateListNode(new Integer[]{5,9,7});

        ListNode listNode = AddTwoNumbers.addTwoNumbers(listA, listB);
        String actualValue = Utils.printListNode(listNode);

        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testAddTwoNumbersTwo() {
        String expectedValue = "0-1-8";

        ListNode listA = Utils.generateListNode(new Integer[]{5,4,3});
        ListNode listB = Utils.generateListNode(new Integer[]{5,6,4});

        ListNode listNode = AddTwoNumbers.addTwoNumbers(listA, listB);
        String actualValue = Utils.printListNode(listNode);

        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testAddTwoNumbersThree() {
        String expectedValue = "8-9-9-9-0-0-0-1";

        ListNode listA = Utils.generateListNode(new Integer[]{9,9,9,9,9,9,9});
        ListNode listB = Utils.generateListNode(new Integer[]{9,9,9,9});

        ListNode listNode = AddTwoNumbers.addTwoNumbers(listA, listB);

        String actualValue = Utils.printListNode(listNode);

        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testAddTwoNumbersFourth() {
        String expectedValue = "7-0-8";

        ListNode listA = Utils.generateListNode(new Integer[]{2,4,3});
        ListNode listB = Utils.generateListNode(new Integer[]{5,6,4});

        ListNode listNode = AddTwoNumbers.addTwoNumbers(listA, listB);
        String actualValue = Utils.printListNode(listNode);

        Assert.assertEquals(expectedValue, actualValue);
    }

}
