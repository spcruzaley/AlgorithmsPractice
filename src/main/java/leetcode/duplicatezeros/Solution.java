package leetcode.duplicatezeros;

public class Solution {

    public static void main(String[] args) {

    }

    public static void solution(int[] arr) {
        int a = 0;

        while (a < arr.length) {
            if(arr[a] != 0) {
                a++;
            } else {
                rotateElements(arr, a+1, arr.length - 1);
                a += 2;
            }
        }
    }

    public static void rotateElements(int[] array, int start, int end) {
        while(end > start) {
            array[end] = array[end - 1];
            end--;
        }
        array[end] = 0;
    }

}
