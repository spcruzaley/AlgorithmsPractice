# Miscellaneous

## Binary Search Tree construction

### Description
Create a class to create a BST with the following 3 methods:
  * insert(int value)
  * contains(int value)
  * remove(int value)

You can take the following class as a template

```java
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
    return this;
  }
  
  public boolean contains(int value) {
    // Write your code here.
    return false;
  }

  public BSTConstruction remove(int value) {
    // Write your code here.
    // Do not edit the return statement of this method.
    return this;
  }
}
```

### Two possible solutions

* [First approach](method1/BSTConstruction.java)
    * [Test cases](../../../../../test/java/misc/treesandgraphs/bstconstruction/method1/BSTConstructionTest.java)
* [Second approach](method2/BSTConstruction.java)
  * [Test cases](../../../../../test/java/misc/treesandgraphs/bstconstruction/method2/BSTConstructionTest.java)

> *NOTE: The approaches are base on my own knowledge and don't be taken as a final solution, it can or can't be the most efficient, If you have a better solution I encourage you to send me it if you want, to add it to the repository.*