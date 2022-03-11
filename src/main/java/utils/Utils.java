package utils;

public final class Utils {

    public static void printBiDimensionalMatrix(int[][] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println("");
        }
    }

}
