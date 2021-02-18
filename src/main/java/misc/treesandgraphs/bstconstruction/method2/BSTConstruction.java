package misc.treesandgraphs.bstconstruction.method2;

/**
 * For this approach I'm using recursion for all the methods, however due that, we increase the Space
 * from log(N) to O(N)
 *
 * Complexity:
 *      - Average case: O(log (N))
 *      - Worst case: O(N)
 *
 * Space O(1)
 *      - Average case: O(log (N))
 *      - Worst case: O(N)
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
        insert(this, null, value);
        return this;
    }

    private void insert(BSTConstruction node, BSTConstruction parent, int value) {
        if(node == null) {
            if(value < parent.value)
                parent.left = new BSTConstruction(value);
            else
                parent.right = new BSTConstruction(value);
            return;
        }

        if(value < node.value) {
            node.insert(node.left, node, value);
        } else {
            node.insert(node.right, node, value);
        }
    }

    public boolean contains(int value) {
        if(this.value == value)
            return true;

        if(value < this.value)
            return left != null && left.contains(value);
        else
            return right != null && right.contains(value);
    }

    public BSTConstruction remove(int value) {
        remove(value, null);
        return this;
    }

    private void remove(int value, BSTConstruction parent) {
        if(value < this.value) {
            left.remove(value, this);
        } else if(value > this.value) {
            right.remove(value, this);
        } else {
            if (left != null && right != null) {
                this.value = right.getLowestNode();
                right.remove(this.value, this);
            } else if (parent == null) {
                if (left != null) {
                    this.value = left.value;
                    right = left.right;
                    left = left.left;
                } else if (right != null) {
                    this.value = right.value;
                    left = right.left;
                    right = right.right;
                }
            } else if (parent.left == this) {
                parent.left = left != null ? left : right;
            } else if (parent.right == this) {
                parent.right = left != null ? left : right;
            }
        }
    }

    public int getLowestNode() {
        if(left == null)
            return value;

        return left.getLowestNode();
    }

    public int size() {
        int count = 1;

        if(left != null)
            count += left.size();
        if(right != null)
            count += right.size();

        return count;
    }

}