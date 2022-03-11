# Codeforces

## Lights Out (Club de Algoritmia Hispano - F)
URL: https://codeforces.com/group/WWgO08JwTh/contest/354246/problem/A

### Description
Lenny is playing a game on a 3 × 3 grid of lights. In the beginning of the game all lights are switched on. Pressing any of the lights will toggle it and all side-adjacent lights. The goal of the game is to switch all the lights off. We consider the toggling as follows: if the light was switched on then it will be switched off, if it was switched off then it will be switched on.

Lenny has spent some time playing with the grid and by now he has pressed each light a certain number of times. Given the number of times each light is pressed, you have to print the current state of each light.

Input
The input consists of three rows. Each row contains three integers each between 0 to 100 inclusive. The j-th number in the i-th row is the number of times the j-th light of the i-th row of the grid is pressed.

Output
Print three lines, each containing three characters. The j-th character of the i-th line is "1" if and only if the corresponding light is switched on, otherwise it's "0".

#### Example 1
```java
INPUT
1 0 0
0 0 0
0 0 1

OUTPUT
001
010
100
```
**Explanation**

#### Example 1
```java
INPUT
1 0 1
8 8 8
2 0 3

OUTPUT
010
011
100
```
**Explanation**

### Solution

* [Solution](Solution.java)
    * [Test cases](../../../../test/java/codeforces/lightsout/SolutionTest.java)

> *NOTE: The approaches are base on my own knowledge and don't be taken as a final solution, it can or can't be the most efficient, If you have a better solution I encourage you to send me it if you want, to add it to the repository.*  