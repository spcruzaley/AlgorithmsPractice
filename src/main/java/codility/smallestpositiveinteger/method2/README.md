# Codility

## Smallest positive Integer

### Description
Given an `array of integers`, find the first missing positive integer. In other words, find the lowest positive integer that does not exist in the array (*without consider the zero*). The array can contain duplicates and negative numbers as well.

#### Example 1
```java
Input: [3, 4, -1, 1]

Output: 2
```
Because if we order the elements we'll to have `-1, 1, 3, 4`, thus, the smallest positive integer missing its 2.

#### Example 2
```java
Input: [1, 2, 0]

Output: 3
```
Because if we order the elements we'll to have `0, 1, 2`, thus, the smallest positive integer missing its 3.

### Two possible solutions

* [Approach](SmallestPositiveInteger.java)
    * [Test cases](../../../../../test/java/codility/smallestpositiveinteger/method2/SmallestPositiveIntegerTest.java)

> *NOTE: The approaches are base on my own knowledge and don't be taken as a final solution, it can or can't be the most efficient, If you have a better solution I encourage you to send me it if you want, to add it to the repository.*  