# Codeforces

## Helpful Maths (Club de Algoritmia Hispano - T)
URL: https://codeforces.com/group/WWgO08JwTh/contest/354246/problem/T

### Description

Xenia the beginner mathematician is a third year student at elementary school. She is now learning the addition operation.

The teacher has written down the sum of multiple numbers. Pupils should calculate the sum. To make the calculation easier, the sum only contains numbers 1, 2 and 3. Still, that isn't enough for Xenia. She is only beginning to count, so she can calculate a sum only if the summands follow in non-decreasing order. For example, she can't calculate sum 1+3+2+1 but she can calculate sums 1+1+2 and 3+3.

You've got the sum that was written on the board. Rearrange the summans and print the sum in such a way that Xenia can calculate the sum.

**Input**

The first line contains a non-empty string s — the sum Xenia needs to count. String s contains no spaces. It only contains digits and characters "+". Besides, string s is a correct sum of numbers 1, 2 and 3. String s is at most 100 characters long.

**Output**

Print the new sum that Xenia can count.

#### Example 1
```java
INPUT
3+2+1

OUTPUT
1+2+3
```
**Explanation**

#### Example 2
```java
INPUT
1+1+3+1+3

OUTPUT
1+1+1+3+3
```
**Explanation**

#### Example 3
```java
INPUT
2

OUTPUT
2
```
**Explanation**

### Solution

* [Solution](Solution.java)
  * [Test cases](../../../../test/java/codeforces/helpfulmaths/SolutionTest.java)

> *NOTE: The approaches are base on my own knowledge and don't be taken as a final solution, it can or can't be the most efficient, If you have a better solution I encourage you to send me it if you want, to add it to the repository.*  