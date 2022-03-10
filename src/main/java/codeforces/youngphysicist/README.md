# Codeforces

## Young Physicist (A)
URL: https://codeforces.com/group/WWgO08JwTh/contest/354246/problem/A

### Description
A guy named Vasya attends the final grade of a high school. One day Vasya decided to watch a match of his favorite hockey team. And, as the boy loves hockey very much, even more than physics, he forgot to do the homework. Specifically, he forgot to complete his physics tasks. Next day the teacher got very angry at Vasya and decided to teach him a lesson. He gave the lazy student a seemingly easy task: You are given an idle body in space and the forces that affect it. The body can be considered as a material point with coordinates (0; 0; 0). Vasya had only to answer whether it is in equilibrium. "Piece of cake" — thought Vasya, we need only to check if the sum of all vectors is equal to 0. So, Vasya began to solve the problem. But later it turned out that there can be lots and lots of these forces, and Vasya can not cope without your help. Help him. Write a program that determines whether a body is idle or is moving by the given vectors of forces.

**Input**

The first line contains a positive integer n (1 ≤ n ≤ 100), then follow n lines containing three integers each: the xi coordinate, the yi coordinate and the zi coordinate of the force vector, applied to the body ( - 100 ≤ xi, yi, zi ≤ 100).

**Output**

Print the word "YES" if the body is in equilibrium, or the word "NO" if it is not.

#### Example 1
```java
INPUT
3
4 1 7
-2 4 -1
1 -5 -3

OUTPUT
NO
```
**Explanation**

Sum of X0 (4) + X0 (-2) + X0 (1) its **different** to zero. **or**
Sum of X2 (7) + X2 (-1) + X2 (-3) its **different** to zero.

#### Example 1
```java
INPUT
3
3 -1 7
-5 2 -4
2 -1 -3

OUTPUT
YES
```
**Explanation**

Sum of X0 (3) + X0 (-5) + X0 (2) its **equals** to zero. **and**
Sum of X1 (-1) + X1 (2) + X1 (-1) its **equals** to zero. **and**
Sum of X2 (7) + X2 (-4) + X2 (-3) its **equals** to zero.

### Solution

* [Solution](Solution.java)
    * [Test cases](../../../../test/java/codeforces/youngphysicist/SolutionTest.java)

> *NOTE: The approaches are base on my own knowledge and don't be taken as a final solution, it can or can't be the most efficient, If you have a better solution I encourage you to send me it if you want, to add it to the repository.*  