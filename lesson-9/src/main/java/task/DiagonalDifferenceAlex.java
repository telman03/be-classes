package task;

import java.util.Arrays;
import java.util.List;

public class DiagonalDifferenceAlex {
    public static int diagonalDifference(List<List<Integer>> data) {
        int size = data.size();
        // dioganal 1
        int sum1 = 0;
        for (int i = 0; i < size; i++) {
            sum1 += data.get(i).get(i);
        }
        // dioganal 2
        int sum2 = 0;
        for (int i = size - 1; i >= 0; i--) {
            sum2 += data.get(i).get(size - i - 1);
        }


        return Math.abs(sum1- sum2);
    }
}
