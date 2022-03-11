# Codeforces

## Beautiful Year (E)
URL: https://codeforces.com/group/WWgO08JwTh/contest/354246/problem/E

### Description

It seems like the year of 2013 came only yesterday. Do you know a curious fact? The year of 2013 is the first year after the old 1987 with only distinct digits.

Now you are suggested to solve the following problem: given a year number, find the minimum year number which is strictly larger than the given one and has only distinct digits.

**Input**

The single line contains integer y (1000 ≤ y ≤ 9000) — the year number.

**Output**

Print a single integer — the minimum year number that is strictly larger than y and all it's digits are distinct. It is guaranteed that the answer exists.

#### Example 1
```java
INPUT
1897

OUTPUT
2013
```
**Explanation**

From 1987 we don't have some year without repeated numbers until 2013

#### Example 2
```java
INPUT
2013

OUTPUT
2014
```
**Explanation**

Same as above

### Solution

* [Solution](Solution.java)
  * [Test cases](../../../../test/java/codeforces/beautifulyear/SolutionTest.java)

> *NOTE: The approaches are base on my own knowledge and don't be taken as a final solution, it can or can't be the most efficient, If you have a better solution I encourage you to send me it if you want, to add it to the repository.*  