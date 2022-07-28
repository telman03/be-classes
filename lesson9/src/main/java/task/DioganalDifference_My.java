package task;

import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;

public class DioganalDifference_My {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int d = i.nextInt();
        int[][] arr = new int[d][d];

        for (int j = 0; j < d; j++) {
            for (int k = 0; k < d; k++) {
                arr[j][k] = i.nextInt();
            }
        }



        System.out.println(Arrays.deepToString(arr)+"\n");
    }


}