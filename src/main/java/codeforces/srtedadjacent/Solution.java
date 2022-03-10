package codeforces.srtedadjacent;

public class Solution {

    public static int[] singleSolution(int[] array) {
        if(array.length < 3)
            return array;

        int tmp;
        for (int a = 0, b = 1, c = 2; c < array.length;) {
            if(array[a] - array[b] > array[c]) {
                tmp = array[a];
                array[a] = array[b];
                array[b] = tmp;
            } else {
                a++;
                b++;
                c++;
            }
        }

        return array;
    }

}
