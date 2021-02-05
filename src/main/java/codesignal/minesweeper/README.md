# CodeSignal

## Minesweeper (Level 24 of 60)

### Description
In the popular **Minesweeper** game you have a board with some mines and those cells that don't contain a mine have a number in it that indicates the total number of mines in the neighboring cells. Starting off with some arrangement of mines we want to create a **Minesweeper** game setup.

#### Example 1
```java
Input: [[true, false, false],
        [false, true, false],
        [false, false, false]]

Output: [[1, 2, 1],
         [2, 1, 1],
         [1, 1, 1]]
```

Check out the image below for better understanding:

![Graphic description](example.png)

### Two possible solutions

* [First approach](method1/Minesweeper.java)
    * [Test cases](../../../../test/java/codesignal/minesweeper/method1/MinesweeperTest.java)
* [Second approach](method2/Minesweeper.java)
    * [Test cases](../../../../test/java/codesignal/minesweeper/method2/MinesweeperTest.java)

> *NOTE: The approaches are base on my own knowledge and don't be taken as a final solution, it can or can't be the most efficient, If you have a better solution I encourage you to send me it if you want, to add it to the repository.*  