# Codeforces

## Perfect Permutation (Club de Algoritmia Hispano - M)
URL: https://codeforces.com/group/WWgO08JwTh/contest/354246/problem/M

### Description

A permutation is a sequence of integers p1, p2, ..., pn, consisting of n distinct positive integers, each of them doesn't exceed n. Let's denote the i-th element of permutation p as pi. We'll call number n the size of permutation p1, p2, ..., pn.

Nickolas adores permutations. He likes some permutations more than the others. He calls such permutations perfect. A perfect permutation is such permutation p that for any i (1 ≤ i ≤ n) (n is the permutation size) the following equations hold ppi = i and pi ≠ i. Nickolas asks you to print any perfect permutation of size n for the given n.

**Input**

A single line contains a single integer n (1 ≤ n ≤ 100) — the permutation size.

**Output**

If a perfect permutation of size n doesn't exist, print a single integer -1. Otherwise print n distinct integers from 1 to n, p1, p2, ..., pn — permutation p, that is perfect. Separate printed numbers by whitespaces.

#### Example 1
```java
INPUT
1

OUTPUT
-1
```

#### Example 2
```java
INPUT
2

OUTPUT
2 1
```

#### Example 3
```java
INPUT
4

OUTPUT
2 1 4 3
```

### Solution

* [Solution](Solution.java)
  * [Test cases](../../../../test/java/codeforces/perfectpermutation/SolutionTest.java)

> *NOTE: The approaches are base on my own knowledge and don't be taken as a final solution, it can or can't be the most efficient, If you have a better solution I encourage you to send me it if you want, to add it to the repository.*  