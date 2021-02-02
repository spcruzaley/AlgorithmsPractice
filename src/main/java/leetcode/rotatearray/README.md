# LeetCode

## [Rotate Array](https://leetcode.com/problems/rotate-array/)

### Description
Given an array, rotate the array to the right by k steps, where k is non-negative.

Follow up:

* Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
* Could you do it in-place with O(1) extra space?

#### Example 1
```java
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
```

#### Example 2
```java
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
```

Constraints:

* 1 <= nums.length <= 2 * 104
* -231 <= nums[i] <= 231 - 1
* 0 <= k <= 105

### My own two possible solutions

* [First approach](method1/RotateArray.java)
    * [Test cases](../../../../test/java/leetcode/rotatearray/method1/RotateArrayTest.java)
* [Second approach](method2/RotateArray.java)
    * [Test cases](../../../../test/java/leetcode/rotatearray/method2/RotateArrayTest.java)
    
### Best solution taken from LeetCode solution section

* [Third approach](method3/RotateArray.java)
    * [Test cases](../../../../test/java/leetcode/rotatearray/method3/RotateArrayTest.java)

> *NOTE: The approaches are base on my own knowledge and don't be taken as a final solution, it can or can't be the most efficient, If you have a better solution I encourage you to send me it if you want, to add it to the repository.*  