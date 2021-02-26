# Facebook

## Binary tree bitwise

### NOTE
Code challenge asked in a mock interview with a Facebook member, as part of hiring process.

### Description
You are given a binary tree where each node value is either `0` or `1`. The parent node value is the `bitwise AND` of the two child values.

Given a leaf node, `flip the node's value`. If the value was a 0, flip it to a 1. If the value was a 1, flip it to a 0.

After flipping the leaf node's value, update the tree accordingly. **There is a pointer from child** to parent. Each binary tree node also has left and right pointers.

### Example:

Given the **second leaf** node counting from the left

```
          0
        /   \
       0     1
      / \   /  \
     1   0  1   1
         ^
         ^
```

The expected result is:

```
          1
        /   \
       1     1
      / \   /  \
     1   1  1   1
```

### Explanation

* First: We need to flip the current node value, it is 0, so the final value will be 1.
* Second: We will to update the parent node value based on bitwise AND operation between the two child nodes.
    * Perform the same operation until we reach the root node.

### The possible solution given

* [Approach](BinaryTreeBitwise.java)
    * [Test cases](../../../../../test/java/facebook/mockinterview/treebitwise/BinaryTreeBitwiseTest.java)

> *NOTE: The approaches are base on my own knowledge and don't be taken as a final solution, it can or can't be the most efficient, If you have a better solution I encourage you to send me it if you want, to add it to the repository.*