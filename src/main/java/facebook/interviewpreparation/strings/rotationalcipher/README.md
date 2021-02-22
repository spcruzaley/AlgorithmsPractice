# Facebook

## Rotational Cipher

### Description
One simple way to encrypt a string is to _"rotate"_ every alphanumeric character by a certain amount. Rotating a character means replacing it with another character that is a certain number of steps away in normal alphabetic or numerical order.

For example, if the string `"Zebra-493?"` is rotated 3 places, the resulting string is `"Cheud-726?"`. Every alphabetic character is replaced with the character 3 letters higher (wrapping around from Z to A), and every numeric character replaced with the character 3 digits higher (wrapping around from 9 to 0). Note that the non-alphanumeric characters remain unchanged.

Given a string and a rotation factor, return an encrypted string.

#### Signature

```java
string rotationalCipher(string input, int rotationFactor)
```

#### Input

1 <= |input| <= 1,000,000
0 <= rotationFactor <= 1,000,000

#### Output

Return the result of rotating input a number of times equal to rotationFactor.

#### Example 1
```bash
input = Zebra-493?
rotationFactor = 3

output = Cheud-726?
````

#### Example 2
```bash
input = abcdefghijklmNOPQRSTUVWXYZ0123456789
rotationFactor = 39

output = nopqrstuvwxyzABCDEFGHIJKLM9012345678
```

### The possible solution

* [Approach](RotationalCipher.java)
  * [Test cases](../../../../../../test/java/facebook/interviewpreparation/strings/rotationalcipher/RotationalCipherTest.java)

> *NOTE: The approaches are base on my own knowledge and don't be taken as a final solution, it can or can't be the most efficient, If you have a better solution I encourage you to send me it if you want, to add it to the repository.*