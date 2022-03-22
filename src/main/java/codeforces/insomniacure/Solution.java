package codeforces.insomniacure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(reader.readLine());
        int l = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());

        /***** SOlUTION *****/
        int solution = solution(k, l, m, n, d);
        System.out.print(solution);
    }

    public static int solution(int k, int l, int m, int n, int d) {
        int cont = 0;

        for (int i = 1; i <= d; i++) {
            if (i%k == 0 || i%l == 0 || i%m == 0 || i%n == 0) {
                cont++;
            }
        }

        return cont;
    }

}
