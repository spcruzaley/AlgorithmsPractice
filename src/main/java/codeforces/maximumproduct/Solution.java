package codeforces.maximumproduct;

public class Solution {

    public static void main(String[] args) {
        //Get total elements
        int elements = Integer.parseInt(args[0]);
        int result;

        for (int i = 0, j = 1; i < elements; i++, j+=2) {
            int singleElements = Integer.parseInt(args[j]);
            String[] stringElements = args[j+1].split(" ");
            result = 1;

            for (int k = 0; k < singleElements; k++) {
                result *= Integer.parseInt(stringElements[k]);
                if(result == 0) {
                    break;
                }
            }
            System.out.println(result);
        }
    }

    public static void printSolution(int elements, int[] array) {
        if(elements != array.length)
            return;

        int product = 0;
        for (int i = 0; i < array.length - 1; i++) {
            product = array[i] * array[i+1];
            if(product == 0)
                break;
        }
        System.out.println(product);
    }

}
