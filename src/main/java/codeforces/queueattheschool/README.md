# Codeforces

## Queue at the School (Club de Algoritmia Hispano - C)
URL: https://codeforces.com/group/WWgO08JwTh/contest/354246/problem/C

### Description
During the break the schoolchildren, boys and girls, formed a queue of n people in the canteen. Initially the children stood in the order they entered the canteen. However, after a while the boys started feeling awkward for standing in front of the girls in the queue and they started letting the girls move forward each second.

Let's describe the process more precisely. Let's say that the positions in the queue are sequentially numbered by integers from 1 to n, at that the person in the position number 1 is served first. Then, if at time x a boy stands on the i-th position and a girl stands on the (i + 1)-th position, then at time x + 1 the i-th position will have a girl and the (i + 1)-th position will have a boy. The time is given in seconds.

You've got the initial position of the children, at the initial moment of time. Determine the way the queue is going to look after t seconds.

**Input**

The first line contains two integers n and t (1 ≤ n, t ≤ 50), which represent the number of children in the queue and the time after which the queue will transform into the arrangement you need to find.

The next line contains string s, which represents the schoolchildren's initial arrangement. If the i-th position in the queue contains a boy, then the i-th character of string s equals "B", otherwise the i-th character equals "G".

**Output**

Print string a, which describes the arrangement after t seconds. If the i-th position has a boy after the needed time, then the i-th character a must equal "B", otherwise it must equal "G".

#### Example 1
```java
INPUT
5 1
BGGBG

OUTPUT
GBGGB
```
**Explanation**

We need to ensure that we need to have a Boy before a Girl, so that:

The first 2 letters (Girl & Boy) needs to be swapped
BGXXX --> GBXXX

After that we need to swap the next two letters (Girl & Boy) that are at the end of the String
GBXBG --> GBXGB

As a result we have: GBGGB

#### Example 1
```java
INPUT
5 2
BGGBG

OUTPUT
GGBGB
```
**Explanation**

Same approach like the previous one, **but in this case we need to do it 2 times** as per the input.

#### Example 1
```java
INPUT
4 1
GGGB

OUTPUT
GGGB
```
**Explanation**

Same approach like the first one.

### Solution

* [Solution](Solution.java)
    * [Test cases](../../../../test/java/codeforces/beautifulmatrix/SolutionTest.java)

> *NOTE: The approaches are base on my own knowledge and don't be taken as a final solution, it can or can't be the most efficient, If you have a better solution I encourage you to send me it if you want, to add it to the repository.*  