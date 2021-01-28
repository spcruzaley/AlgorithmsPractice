# Merge Sort

### Description
This is, in most of the cases, a very useful sorting algorithms, it uses the principle of **Divide and conquer** invented by [John von Neumann](https://en.wikipedia.org/wiki/John_von_Neumann).

The basic idea is to divide the current array by two, after that divide those parts by two, so on and so forth, until we have only one element.
From that we start to compare one each other in order to **merge** them successively.

This algorithm can be done ***in place*** (**The input array will be updated in the sorting process**), the code in method 2 do that.
The other case don't, it returns a new sorted array, the code in method 1 do that.

![Merge Sort Simulation](merge-example.gif)
*Source: https://en.wikipedia.org/wiki/Merge_sort* 
