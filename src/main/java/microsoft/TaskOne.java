package microsoft;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * TODO: Description pending, due to this problem was part of the first filter for Microsoft hiring process
 */
public class TaskOne {

    /**
     * Complexity: O(N) due to we need to traverse all the tree in order to compare each node with the root node value.
     * Space: O(N) due to in the worst case we can return all the nodes
     *
     * See (src/test/java/microsoft/TaskOneTest.java) for test cases
     *
     * @param T
     * @return
     */
    public int solution(TreeNode T) {
        // write your code in Java SE 8
        if(T == null)
            return 0;
        if(T.left == null && T.right == null)
            return 1;

        List<Integer> list = new ArrayList<>();

        /**
         * Traverse the tree inOrder (But probably I can do in preOrder or postOrder),
         * in order to generate a list of all the existing nodes that satisfy the validation needed,
         * we can pass the validation as a Predicate, so that in case that we need to modify the validation, we only
         * need to update the Predicate and not the definition, in this case, of the "inOrder" method created.
         */
        Predicate<Integer> validation = (x) -> x >= T.val;
        inOrder(T, list, validation);

        return list.size();
    }

    /**
     * Helper method to traverse the tree inOrder, that means:
     *      - First, visit the left child
     *      - Second, visit the current node
     *      - Third, visit the right node
     * @param T
     * @param list
     * @param validation
     */
    public void inOrder(TreeNode T, List<Integer> list, Predicate<Integer> validation) {
        if(T == null)
            return;

        inOrder(T.left, list, validation);
        if(validation.test(T.val)) {
            list.add(T.val);
        }
        inOrder(T.right, list, validation);
    }

}
