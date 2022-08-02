package task;

import java.util.List;

public class DiagonalDifferenceV2 {
    public int diagonalDifference(List<List<Integer>> data) {
        int size = data.size();

        // diagonal 1
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < size; i++) {
            sum1 += data.get(i).get(i);
            sum2 += data.get(i).get(size - i - 1);
        }


        List<Integer> row1 = data.get(0);
        Integer itemAt00 = row1.get(0);

        return Math.abs(sum1 - sum2);
    }
}
