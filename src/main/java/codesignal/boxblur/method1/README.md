# Codesignal

## Box Blur (Level 23 of 60)

### Description
Last night you partied a little too hard. Now there's a black and white photo of you that's about to go viral! You can't let this ruin your reputation, so you want to apply the box blur algorithm to the photo to hide its content.

The pixels in the input image are represented as integers. The algorithm distorts the input image in the following way: Every pixel x in the output image has a value equal to the average value of the pixel values from the 3 × 3 square that has its center at x, including x itself. All the pixels on the border of x are then removed.

Return the blurred image as an integer, with the fractions rounded down.

#### Example 1
```java
image = [[1, 1, 1], 
         [1, 7, 1], 
         [1, 1, 1]]

Output: [[1]]
```
**Explanation**

To get the value of the middle pixel in the input `3 × 3` square: `(1 + 1 + 1 + 1 + 7 + 1 + 1 + 1 + 1) = 15 / 9 = 1.66666 = 1`. The border pixels are cropped from the final result.

#### Example 2:
```java
image = [[7, 4, 0, 1], 
         [5, 6, 2, 2], 
         [6, 10, 7, 8], 
         [1, 4, 2, 0]]

Outpout: [[5, 4], 
          [4, 4]]
```

**Explanation**

There are four `3 × 3` squares in the input image, so there should be four integers in the blurred output. To get the first value: `(7 + 4 + 0 + 5 + 6 + 2 + 6 + 10 + 7) = 47 / 9 = 5.2222 = 5`. The other three integers are obtained the same way, then the surrounding integers are cropped from the final result.

### Solution taken from Solution section

* [Solution](BoxBlur.java)
    * [Test cases](../../../../../test/java/codesignal/boxblur/method1/BoxBlurTest.java)

> *NOTE: The approaches are base on my own knowledge and don't be taken as a final solution, it can or can't be the most efficient, If you have a better solution I encourage you to send me it if you want, to add it to the repository.*  