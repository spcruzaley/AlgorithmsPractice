# Facebook

## Number of Visible Nodes

### Description
There is a binary tree with N nodes. You are viewing the tree from its left side and can see only the leftmost nodes at each level. Return the number of visible nodes.

**Note:** You can see only the leftmost nodes, but that doesn't mean they have to be left nodes. The leftmost node at a level could be a right node.

#### Signature

```java
int visibleNodes(Node root)
```

#### Input

The root node of a tree, where the number of nodes is between 1 and 1000, and the value of each node is between 0 and 1_000_000_000

#### Output

An int representing the number of visible nodes.

#### Example 1
```bash
            8  <------ root
           / \
         3    10
        / \     \
       1   6     14
          / \    /
         4   7  13   

Output = 4
```

#### Example 2
```bash
            10  <------ root
           / \
         8    15
        /    /  \
       4    14  16
        \
         5
          \
           6          

Output = 5
```

<!--
### The possible

* [First approach](method1/PairSums.java)
    * [Test cases](../../../../../java/facebook/interviewpreparation/hashtables/pairsums/method1/PairSums.java)
* [Second approach](method2/PairSums.java)
  * [Test cases](../../../../../java/facebook/interviewpreparation/hashtables/pairsums/method2/PairSums.java)

> *NOTE: The approaches are base on my own knowledge and don't be taken as a final solution, it can or can't be the most efficient, If you have a better solution I encourage you to send me it if you want, to add it to the repository.*
-->