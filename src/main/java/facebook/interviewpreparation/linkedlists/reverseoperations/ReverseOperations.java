package facebook.interviewpreparation.linkedlists.reverseoperations;

public class ReverseOperations {

    /**
     * TODO: Investigate about the complexity
     *
     * Complexity: O(N), still not sure about the correct complexity
     * Space: O(N), we need to use a temporal Node as helper
     *
     * @param head
     * @return
     */
    public Node reverse(Node head) {
        Node current = head;
        Node previous = null;

        while (current != null) {
            if(isEven(current.data)) {
                current = reverseEvenListElements(current);
                if(previous != null) {
                    previous.next = current;
                    current = previous.next;
                } else {
                    head = current;
                    current = head;
                }

                while (current != null && isEven(current.data)) {
                    previous = current;
                    current = current.next;
                }
            }
            if(current == null)
                break;

            previous = current;
            current = current.next;
        }

        return head;
    }

    private boolean isEven(int data) {
        return data % 2 == 0;
    }

    /**
     * Method to revert the FIRST consecutive even numbers in a linked list
     *
     * @param node
     * @return
     */
    public Node reverseEvenListElements(Node node) {
        Node previous = null;
        Node current = node;

        while(current != null) {
            Node tmp = current.next;
            current.next = previous;
            previous = current;
            current = tmp;

            if(current == null || !isEven(current.data))
                break;
        }

        Node temporal = previous;
        while (temporal.next != null) {
            temporal = temporal.next;
        }
        temporal.next = current;

        return previous;
    }

}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}