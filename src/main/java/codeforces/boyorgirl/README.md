# Codeforces

## Boy or Girl (Club de Algoritmia Hispano - W)
URL: https://codeforces.com/group/WWgO08JwTh/contest/354246/problem/W

### Description

Those days, many boys use beautiful girls' photos as avatars in forums. So it is pretty hard to tell the gender of a user at the first glance. Last year, our hero went to a forum and had a nice chat with a beauty (he thought so). After that they talked very often and eventually they became a couple in the network.

But yesterday, he came to see "her" in the real world and found out "she" is actually a very strong man! Our hero is very sad and he is too tired to love again now. So he came up with a way to recognize users' genders by their user names.

This is his method: if the number of distinct characters in one's user name is odd, then he is a male, otherwise she is a female. You are given the string that denotes the user name, please help our hero to determine the gender of this user by his method.

**Input**

The first line contains a non-empty string, that contains only lowercase English letters — the user name. This string contains at most 100 letters.

**Output**

If it is a female by our hero's method, print "CHAT WITH HER!" (without the quotes), otherwise, print "IGNORE HIM!" (without the quotes).

#### Example 1
```java
INPUT
wjmzbmr

OUTPUT
CHAT WITH HER!
```
**Explanation**

There are 6 distinct characters in "wjmzbmr". These characters are: "w", "j", "m", "z", "b", "r". So wjmzbmr is a female and you should print "CHAT WITH HER!".

#### Example 2
```java
INPUT
xiaodao

OUTPUT
IGNORE HIM!
```
**Explanation**

#### Example 3
```java
INPUT
sevenkplus

OUTPUT
CHAT WITH HER!
```
**Explanation**

### Solution

* [Solution](Solution.java)
  * [Test cases](../../../../test/java/codeforces/boyorgirl/SolutionTest.java)

> *NOTE: The approaches are base on my own knowledge and don't be taken as a final solution, it can or can't be the most efficient, If you have a better solution I encourage you to send me it if you want, to add it to the repository.*  