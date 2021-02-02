# LeetCode

## [Two Sum](https://leetcode.com/problems/two-sum)

### Description
Given an ***array*** of integers and an integer as ***target***, return *indices* of the two numbers such that they add up to target.
You may assume that each ***input would have exactly one solution***, and you may not use the same element twice.
**You can return the answer in any order.**

#### Example 1
```java
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
```
*Because **nums[0] + nums[1] == 9**, we return **[0, 1]**.*

#### Example 2:
```java
Input: nums = [3,2,4], target = 6
Output: [1,2]
```
*Because **nums[1] + nums[2] == 6**, we return **[1, 2]**.*

#### Example 3:
```java
Input: nums = [3,3], target = 6
Output: [0,1]
```
*Because **nums[0] + nums[1] == 6**, we return **[0, 1]**.*

### Two possible solutions

* [Using brute fore](method1/TwoSum.java)
    * [Test cases](../../../../test/java/leetcode/twosum/method1/TwoSumTest.java)
* [Using a Set](method2/TwoSum.java)
    * [Test cases](../../../../test/java/leetcode/twosum/method2/TwoSumTest.java)

> *NOTE: The approaches are base on my own knowledge and don't be taken as a final solution, it can or can't be the most efficient, If you have a better solution I encourage you to send me it if you want, to add it to the repository.*