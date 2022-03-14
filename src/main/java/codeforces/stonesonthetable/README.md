# Codeforces

## Stones on the Table (Club de Algoritmia Hispano - J)
URL: https://codeforces.com/group/WWgO08JwTh/contest/354246/problem/J

### Description

There are n stones on the table in a row, each of them can be red, green or blue. Count the minimum number of stones to take from the table so that any two neighboring stones had different colors. Stones in a row are considered neighboring if there are no other stones between them.

**Input**

The first line contains integer n (1 ≤ n ≤ 50) — the number of stones on the table.

The next line contains string s, which represents the colors of the stones. We'll consider the stones in the row numbered from 1 to n from left to right. Then the i-th character s equals "R", if the i-th stone is red, "G", if it's green and "B", if it's blue.

**Output**

Print a single integer — the answer to the problem.

#### Example 1
```java
INPUT
3
RRG

OUTPUT
1
```
**Explanation**

We only need to remove one letter (R) in order to get different neighbors.

#### Example 2
```java
INPUT
5
RRRRR

OUTPUT
4
```
**Explanation**

We need to remove 4 letters (R) in order to get different neighbors.

#### Example 3
```java
INPUT
4
BRBG

OUTPUT
0
```
**Explanation**

We don't need to remove any letter since all letters have different neighbors.

### Solution

* [Solution](Solution.java)
  * [Test cases](../../../../test/java/codeforces/stonesonthetable/SolutionTest.java)

> *NOTE: The approaches are base on my own knowledge and don't be taken as a final solution, it can or can't be the most efficient, If you have a better solution I encourage you to send me it if you want, to add it to the repository.*  