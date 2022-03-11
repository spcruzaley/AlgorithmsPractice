# Codeforces

## Word (Club de Algoritmia Hispano - G)
URL: https://codeforces.com/group/WWgO08JwTh/contest/354246/problem/G

### Description

Vasya is very upset that many people on the Net mix uppercase and lowercase letters in one word. That's why he decided to invent an extension for his favorite browser that would change the letters' register in every word so that it either only consisted of lowercase letters or, vice versa, only of uppercase ones. At that as little as possible letters should be changed in the word. For example, the word HoUse must be replaced with house, and the word ViP — with VIP. If a word contains an equal number of uppercase and lowercase letters, you should replace all the letters with lowercase ones. For example, maTRIx should be replaced by matrix. Your task is to use the given method on one given word.

**Input**

The first line contains a word s — it consists of uppercase and lowercase Latin letters and possesses the length from 1 to 100.

**Output**

Print the corrected word s. If the given word s has strictly more uppercase letters, make the word written in the uppercase register, otherwise - in the lowercase one.

#### Example 1
```java
INPUT
HoUse

OUTPUT
house
```
**Explanation**

There are more lowercase letters than uppercase letters

#### Example 2
```java
INPUT
ViP

OUTPUT
VIP
```
**Explanation**

There are more uppercase letters than lowercase letters

#### Example 3
```java
INPUT
maTRIx

OUTPUT
matrix
```
**Explanation**

There are same lowercase and uppercase letters, as per the description we should put the word in lowercase

### Solution

* [Solution](Solution.java)
  * [Test cases](../../../../test/java/codeforces/word/SolutionTest.java)

> *NOTE: The approaches are base on my own knowledge and don't be taken as a final solution, it can or can't be the most efficient, If you have a better solution I encourage you to send me it if you want, to add it to the repository.*  