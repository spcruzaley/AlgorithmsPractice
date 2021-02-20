# Facebook

## Reverse to Make Equal

### Description
Given two arrays `A` and `B` of length `N`, determine if there is a way to make `A` equal to `B` by reversing any subarrays from array `B` any number of times.

#### Signature

```java
bool areTheyEqual(int[] arr_a, int[] arr_b)
```

#### Input

All integers in array are in the range `[0 - 1,000,000,000]`.

#### Output

Return true if `B` can be made equal to `A`, return false otherwise.

#### Example
```
A = [1, 2, 3, 4]
B = [1, 4, 3, 2]

output = true
````

After reversing the subarray of `B` from indices 1 to 3, array `B` will equal array `A`.

### The possible

* [First approach](method1/ReverseToMakeEqual.java)
    * [Test cases](../../../../../java/facebook/interviewpreparation/arrays/areequals/method1/ReverseToMakeEqual.java)
* [Second approach](method2/ReverseToMakeEqual.java)
  * [Test cases](../../../../../java/facebook/interviewpreparation/arrays/areequals/method2/ReverseToMakeEqual.java)

> *NOTE: The approaches are base on my own knowledge and don't be taken as a final solution, it can or can't be the most efficient, If you have a better solution I encourage you to send me it if you want, to add it to the repository.*