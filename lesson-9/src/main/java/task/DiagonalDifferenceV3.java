package task;

import java.util.List;

public class DiagonalDifferenceV3 implements DiagonalDifference {
    @Override
    public int diagonalDifference(List<List<Integer>> data) {
        int size = data.size();

        // diagonal 1
        int sum = 0;
        for (int i = 0; i < size; i++) {
            List<Integer> row = data.get(i);
            sum = sum + row.get(i) - row.get(size - i - 1);
        }


        List<Integer> row1 = data.get(0);
        Integer itemAt00 = row1.get(0);

        return Math.abs(sum);
    }
}
