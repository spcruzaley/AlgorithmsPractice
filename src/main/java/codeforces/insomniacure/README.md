# Codeforces

## Insomnia cure (Club de Algoritmia Hispano - P)
URL: https://codeforces.com/group/WWgO08JwTh/contest/354246/problem/P

### Description

«One dragon. Two dragon. Three dragon», — the princess was counting. She had trouble falling asleep, and she got bored of counting lambs when she was nine.

However, just counting dragons was boring as well, so she entertained herself at best she could. Tonight she imagined that all dragons were here to steal her, and she was fighting them off. Every k-th dragon got punched in the face with a frying pan. Every l-th dragon got his tail shut into the balcony door. Every m-th dragon got his paws trampled with sharp heels. Finally, she threatened every n-th dragon to call her mom, and he withdrew in panic.

How many imaginary dragons suffered moral or physical damage tonight, if the princess counted a total of d dragons?

**Input**

Input data contains integer numbers k, l, m, n and d, each number in a separate line (1 ≤ k, l, m, n ≤ 10, 1 ≤ d ≤ 105).

**Output**

Output the number of damaged dragons.

#### Example 1
```java
INPUT
1
2
3
4
12

OUTPUT
12
```
**Explanation**

Every first dragon got punched with a frying pan. Some of the dragons suffered from other reasons as well, but the pan alone would be enough.

#### Example 2
```java
INPUT
2
3
4
5
24

OUTPUT
17
```
**Explanation**

Dragons 1, 7, 11, 13, 17, 19 and 23 escaped unharmed.

### Solution

* [Solution](Solution.java)
  * [Test cases](../../../../test/java/codeforces/insomniacure/SolutionTest.java)

> *NOTE: The approaches are base on my own knowledge and don't be taken as a final solution, it can or can't be the most efficient, If you have a better solution I encourage you to send me it if you want, to add it to the repository.*  