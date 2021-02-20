# Facebook

## Pair Sums

### Description
Given a list of n integers `arr[0..(n-1)]`, determine the number of different pairs of elements within it which sum to k.

If an integer appears in the list multiple times, each copy is considered to be different; that is, two pairs are considered different if one pair includes at least one array index which the other doesn't, even if they include the same values.

#### Signature

```java
int numberOfWays(int[] arr, int k)
```

#### Input

`n` is in the range `[1 - 100,000]`.
Each value `arr[i]` is in the range `[1 - 1,000,000,000]`.
`k` is in the range `[1 - 1,000,000,000]`.

#### Output

Return the number of different pairs of elements which sum to `k`.

#### Example 1
```bash
n = 5
k = 6
arr = [1, 2, 3, 4, 3]

output = 2
````

The valid pairs are `2+4` and `3+3`.

#### Example 2
```bash
n = 5
k = 6
arr = [1, 5, 3, 3, 3]

output = 4
```

There's one valid pair `1+5`, and three different valid pairs `3+3` (_the 3rd and 4th elements, 3rd and 5th elements, and 4th and 5th elements_).

### The possible

* [First approach](method1/PairSums.java)
    * [Test cases](../../../../../java/facebook/interviewpreparation/hashtables/pairsums/method1/PairSums.java)
* [Second approach](method2/PairSums.java)
  * [Test cases](../../../../../java/facebook/interviewpreparation/hashtables/pairsums/method2/PairSums.java)

> *NOTE: The approaches are base on my own knowledge and don't be taken as a final solution, it can or can't be the most efficient, If you have a better solution I encourage you to send me it if you want, to add it to the repository.*