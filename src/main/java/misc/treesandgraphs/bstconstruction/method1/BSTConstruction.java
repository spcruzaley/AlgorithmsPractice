package misc.treesandgraphs.bstconstruction.method1;

import java.util.LinkedList;
import java.util.Queue;

/**
 * For all the methods implemented (insert, contains, remove) the
 *
 * Complexity:
 *      - Average case: O(log (N))
 *      - Worst case: O(N)
 *
 * Space O(N)
 *
 * @param value
 * @return
 */
public class BSTConstruction {
    public int value;
    public BSTConstruction left;
    public BSTConstruction right;

    public BSTConstruction(int value) {
        this.value = value;
    }

    public BSTConstruction insert(int value) {
        // Write your code here.
        // Do not edit the return statement of this method.
        BSTConstruction node = this;

        while (node != null) {
            if(value < node.value) {
                if(node.left == null) {
                    node.left = new BSTConstruction(value);
                    break;
                } else {
                    node = node.left;
                }
            } else {
                if(node.right == null) {
                    node.right = new BSTConstruction(value);
                    break;
                } else {
                    node = node.right;
                }
            }
        }

        return this;
    }

    public boolean contains(int value) {
        // Write your code here.
        BSTConstruction node = this;

        while (node != null) {
            if(value < node.value) {
                node = node.left;
            } else if(value > node.value){
                node = node.right;
            } else {
                return true;
            }
        }

        return false;
    }

    public BSTConstruction remove(int value) {
        remove(value, null);
        return this;
    }

    public void remove(int value, BSTConstruction parent) {
        BSTConstruction current = this;

        while (current != null) {
            if(value < current.value) {
                parent = current;
                current = current.left;
            } else if(value > current.value) {
                parent = current;
                current = current.right;
            } else {
                if(current.left != null && current.right != null) {
                    current.value = current.right.getLowestNode();
                    current.right.remove(current.value, current);
                } else if(parent == null) {
                    if(current.left != null) {
                        current.value = current.left.value;
                        current.right = current.left.right;
                        current.left = current.left.left;
                    } else if(current.right != null) {
                        current.value = current.right.value;
                        current.left = current.right.left;
                        current.right = current.right.right;
                    } else {

                    }
                } else if(parent.left == current) {
                    parent.left = current.left != null ? current.left : current.right;
                } else if(parent.right == current) {
                    parent.right = current.left != null ? current.left : current.right;
                }
                break;
            }
        }
    }

    public int getLowestNode() {
        BSTConstruction node = this;

        while(node.left != null) {
            node = node.left;
        }

        return node.value;
    }

    public int size() {
        BSTConstruction root = this;
        Queue<BSTConstruction> queue = new LinkedList<>();
        queue.add(root);
        int cont = 0;

        while(!queue.isEmpty()) {
            BSTConstruction current = queue.poll();
            cont++;

            if(current.left != null) queue.add(current.left);
            if(current.right != null) queue.add(current.right);
        }

        return cont;
    }

}