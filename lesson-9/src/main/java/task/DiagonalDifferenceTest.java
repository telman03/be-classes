package task;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiagonalDifferenceTest {

    private DiagonalDifferenceV2 dd = new DiagonalDifferenceV2();
    @Test
    public void test1() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        List<Integer> list3 = Arrays.asList(17, 8, 9);
        List<List<Integer>> data = Arrays.asList(list1, list2, list3);
        int real = dd.diagonalDifference(data);
        int expected = 10;
        assertEquals(expected, real);
    }
    @Test
    public void test2() {
        List<List<Integer>> data = Arrays.asList(
                Arrays.asList(11, 2, 4),
                Arrays.asList(4, 5, 6),
                Arrays.asList(10, 8, -12)
        );

        int real = dd.diagonalDifference(data);
        int expected = 15;
        assertEquals(expected, real);
    }
}
