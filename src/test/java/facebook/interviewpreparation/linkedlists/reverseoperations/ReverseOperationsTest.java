package facebook.interviewpreparation.linkedlists.reverseoperations;

import org.junit.Assert;
import org.junit.Test;

public class ReverseOperationsTest {

    @Test
    public void testReverse() {
        int[] expectedList = {1,8,2,9,16,12};

        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(8);
        node.next.next.next = new Node(9);
        node.next.next.next.next = new Node(12);
        node.next.next.next.next.next = new Node(16);
        ReverseOperations reverseOperations = new ReverseOperations();
        Node reversed = reverseOperations.reverse(node);

        Assert.assertArrayEquals(expectedList, toArray(reversed, 6));
    }

    @Test
    public void testReverseSecondTest() {
        int[] expectedList = {24, 18, 2, 3, 5, 7, 9, 12, 6};

        Node node = new Node(2);
        node.next = new Node(18);
        node.next.next = new Node(24);
        node.next.next.next = new Node(3);
        node.next.next.next.next = new Node(5);
        node.next.next.next.next.next = new Node(7);
        node.next.next.next.next.next.next = new Node(9);
        node.next.next.next.next.next.next.next = new Node(6);
        node.next.next.next.next.next.next.next.next = new Node(12);
        ReverseOperations reverseOperations = new ReverseOperations();
        Node reversed = reverseOperations.reverse(node);

        Assert.assertArrayEquals(expectedList, toArray(reversed, 9));
    }

    @Test
    public void testReverseThirdTest() {
        int[] expectedList = {2,4,6,8,10};

        Node node = new Node(10);
        node.next = new Node(8);
        node.next.next = new Node(6);
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(2);
        ReverseOperations reverseOperations = new ReverseOperations();
        Node reversed = reverseOperations.reverse(node);

        Assert.assertArrayEquals(expectedList, toArray(reversed, 5));
    }

    @Test
    public void testReverseFourthTest() {
        int[] expectedList = {9,7,5,3,1};

        Node node = new Node(9);
        node.next = new Node(7);
        node.next.next = new Node(5);
        node.next.next.next = new Node(3);
        node.next.next.next.next = new Node(1);
        ReverseOperations reverseOperations = new ReverseOperations();
        Node reversed = reverseOperations.reverse(node);

        Assert.assertArrayEquals(expectedList, toArray(reversed, 5));
    }

    @Test
    public void testReverseOnlyOneEvenNumber() {
        int[] expectedList = {9,7,4,3,1};

        Node node = new Node(9);
        node.next = new Node(7);
        node.next.next = new Node(4);
        node.next.next.next = new Node(3);
        node.next.next.next.next = new Node(1);
        ReverseOperations reverseOperations = new ReverseOperations();
        Node reversed = reverseOperations.reverse(node);

        Assert.assertArrayEquals(expectedList, toArray(reversed, 5));
    }

    //Testing helper methods
    @Test
    public void testReverseEvenListElements() {
        int[] expectedList = {24,18,2,3,5};

        Node node = new Node(2);
        node.next = new Node(18);
        node.next.next = new Node(24);
        node.next.next.next = new Node(3);
        node.next.next.next.next = new Node(5);
        ReverseOperations reverseOperations = new ReverseOperations();
        int[] actualList = toArray(reverseOperations.reverseEvenListElements(node), 5);

        Assert.assertArrayEquals(expectedList, actualList);
    }

    @Test
    public void testReverseEvenListElementsSecondTest() {
        int[] expectedList = {2,8,9,16,12};

        Node node = new Node(8);
        node.next = new Node(2);
        node.next.next = new Node(9);
        node.next.next.next = new Node(16);
        node.next.next.next.next = new Node(12);
        ReverseOperations reverseOperations = new ReverseOperations();
        int[] actualList = toArray(reverseOperations.reverseEvenListElements(node), 5);

        Assert.assertArrayEquals(expectedList, actualList);
    }

    @Test
    public void testReverseEvenListElementsThirdTest() {
        int[] expectedList = {12,16};

        Node node = new Node(16);
        node.next = new Node(12);
        ReverseOperations reverseOperations = new ReverseOperations();
        int[] actualList = toArray(reverseOperations.reverseEvenListElements(node), 2);

        Assert.assertArrayEquals(expectedList, actualList);
    }

    private void printLinkedList(Node node) {
        while(node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
        System.out.println("");
    }

    private int[] toArray(Node node, int size) {
        int[] arr = new int[size];
        int cont = 0;

        while (node != null) {
            arr[cont++] = node.data;
            node = node.next;
        }

        return arr;
    }

}
