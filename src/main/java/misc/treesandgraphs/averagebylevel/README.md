# Miscellaneous

## Average by level

### Description
Given a Binary tree, get the average value at each level of the tree

Consider the Binary tree like this:
```java
public class TreeNode {
  public int val;
  public TreeNode left;
  public TreeNode right;
  
  public TreeNode() {
  }

  public TreeNode(int val) {
    this.val = val;
  }

  public TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}
```

###Example
```
input:
           4
         /   \
       7      9
      / \      \
    10   2      6
          \
           6

output: [4,8,6,6]
```

* First level: has only **4**
* Second level: `7 + 9 = 16`, so, the average will be 16/2 (_due to have 2 elements_) given **8** as result
* Third level: `10 + 2 + 6 = 18`, so, the average will be 18/3 (_due to have 3 elements_) given **6** as result
* Fourth level: has only **6**

### Two possible solutions

* [Approach](AverageByLevel.java)
  * [Test cases](../../../../../test/java/misc/treesandgraphs/averagebylevel/AverageByLevelTest.java)

> *NOTE: The approaches are base on my own knowledge and don't be taken as a final solution, it can or can't be the most efficient, If you have a better solution I encourage you to send me it if you want, to add it to the repository.*