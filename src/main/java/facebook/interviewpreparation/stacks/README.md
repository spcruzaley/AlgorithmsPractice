# Facebook

## Balance Brackets

### Description
A bracket is considered to be any one of the following characters: `(, ), {, }, [,` or `]`.

We consider two brackets to be matching if the first element is an open-bracket, e.g., (, `{`, or `[`, and the second bracket is a close-bracket of the same type, e.g., `(` and `)`, `[` and `]`, and `{` and `}` are the only pairs of matching brackets.

Furthermore, a sequence of brackets is said to be **balanced** if the following conditions are met:

* The sequence is empty, or
* The sequence is composed of two, non-empty, sequences both of which are **balanced**, or
* The first and last brackets of the sequence are **matching**, and the portion of the sequence without the first and last elements is **balanced**.

You are given a string of brackets. Your task is to determine whether each sequence of brackets is balanced. If a string is balanced, return `true`, otherwise, return `false`

#### Signature

```java
boolean isBalanced(String s)
```

#### Input

String s with length between `1` and `1000`

#### Output

A `boolean` representing if the string is balanced or not.

#### Example 1
```bash
s = {[()]}

output: true
````

#### Example 2
```bash
s = {}()

output: true
```

#### Example 3
```bash
s = {(})

output: false
```

#### Example 4
```bash
s = )

output: false
```

### The possible solution

* [Approach](BalanceBrackets.java)
  * [Test cases](../../../../../test/java/facebook/interviewpreparation/stacks/BalanceBracketsTest.java)

> *NOTE: The approaches are base on my own knowledge and don't be taken as a final solution, it can or can't be the most efficient, If you have a better solution I encourage you to send me it if you want, to add it to the repository.*