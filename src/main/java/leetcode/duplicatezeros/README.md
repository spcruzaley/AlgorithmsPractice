# LeetCode

## [Duplicate Zeros](https://leetcode.com/problems/duplicate-zeros/)

### Description
Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.

#### Example 1
```java
Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]
```
**Explanation**

After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]

#### Example 2:
```java
Input: arr = [1,2,3]
Output: [1,2,3]
```
**Explanation**

After calling your function, the input array is modified to: [1,2,3]

#### Constraints:
```java
1 <= arr.length <= 104
0 <= arr[i] <= 9
```

### Solution

* [Solution](Solution.java)
    * [Test cases](../../../../test/java/leetcode/duplicatezeros/SolutionTest.java)

> *NOTE: The approaches are base on my own knowledge and don't be taken as a final solution, it can or can't be the most efficient, If you have a better solution I encourage you to send me it if you want, to add it to the repository.*  