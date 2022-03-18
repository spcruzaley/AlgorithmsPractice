# Codeforces

## Ultra-Fast Mathematician (Club de Algoritmia Hispano - L)
URL: https://codeforces.com/group/WWgO08JwTh/contest/354246/problem/L

### Description

Shapur was an extremely gifted student. He was great at everything including Combinatorics, Algebra, Number Theory, Geometry, Calculus, etc. He was not only smart but extraordinarily fast! He could manage to sum 1018 numbers in a single second.

One day in 230 AD Shapur was trying to find out if any one can possibly do calculations faster than him. As a result he made a very great contest and asked every one to come and take part.

In his contest he gave the contestants many different pairs of numbers. Each number is made from digits 0 or 1. The contestants should write a new number corresponding to the given pair of numbers. The rule is simple: The i-th digit of the answer is 1 if and only if the i-th digit of the two given numbers differ. In the other case the i-th digit of the answer is 0.

Shapur made many numbers and first tried his own speed. He saw that he can perform these operations on numbers of length ∞ (length of a number is number of digits in it) in a glance! He always gives correct answers so he expects the contestants to give correct answers, too. He is a good fellow so he won't give anyone very big numbers and he always gives one person numbers of same length.

Now you are going to take part in Shapur's contest. See if you are faster and more accurate.

**Input**

There are two lines in each input. Each of them contains a single number. It is guaranteed that the numbers are made from 0 and 1 only and that their length is same. The numbers may start with 0. The length of each number doesn't exceed 100.

**Output**

Write one line — the corresponding answer. Do not omit the leading 0s.

#### Example 1
```java
INPUT
1010100
0100101

OUTPUT
1110001
```
**Explanation**

When we have 1 and 0 or 0 and 1 it will be 1
When we have 1 and 1 or 0 and 0 it will be 0 

#### Example 2
```java
INPUT
000
111

OUTPUT
111
```
**Explanation**

Same as above

#### Example 3
```java
INPUT
1110
1010

OUTPUT
0100
```
**Explanation**

Same as above

#### Example 4
```java
INPUT
01110
01100

OUTPUT
00010
```
**Explanation**

Same as above

### Solution

* [Solution](Solution.java)
  * [Test cases](../../../../test/java/codeforces/ultrafastmathematician/SolutionTest.java)

> *NOTE: The approaches are base on my own knowledge and don't be taken as a final solution, it can or can't be the most efficient, If you have a better solution I encourage you to send me it if you want, to add it to the repository.*  