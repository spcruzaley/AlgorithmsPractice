package codesignal.boxblur.method1;

/**
 * Last night you partied a little too hard. Now there's a black and white photo of you that's about to go viral!
 * You can't let this ruin your reputation, so you want to apply the box blur algorithm to the photo to hide its content.
 *
 * The pixels in the input image are represented as integers. The algorithm distorts the input image in the following way:
 * Every pixel x in the output image has a value equal to the average value of the pixel values from the 3 × 3 square
 * that has its center at x, including x itself. All the pixels on the border of x are then removed.
 *
 * Return the blurred image as an integer, with the fractions rounded down.
 */
public class BoxBlur {

    /**
     * Solution taken from Solution section
     * @param image
     * @return
     */
    static int[][] boxBlur(int[][] image) {
        int[][] result = new int[image.length-2][image[0].length-2];
        for (int i = 1; i < image.length-1; i++) {
            for (int j = 1; j < image[i].length-1; j++) {
                result[i-1][j-1] = avg(image, i, j);
            }
        }
        return result;
    }

    static int avg(int[][] image, int x, int y) {
        int sum = 0;
        for (int i = x-1; i <= x+1; i++) {
            for (int j = y-1; j <= y+1; j++) {
                sum += image[i][j];
            }
        }
        return sum / 9;
    }

}
