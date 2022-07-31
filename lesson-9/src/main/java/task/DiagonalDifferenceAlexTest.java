package task;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiagonalDifferenceAlexTest {
    private final DiagonalDifferenceAlex dd = new DiagonalDifferenceAlex();
    @Test
    public void test1(){
        List<Integer> line1 = Arrays.asList(1, 2, 3);
        List<Integer> line2 = Arrays.asList(4, 5, 6);
        List<Integer> line3 = Arrays.asList(7, 8, 9);
        List<List<Integer>> data = Arrays.asList(line1, line2, line3);

        int real = DiagonalDifferenceAlex.diagonalDifference(data);
        int expected = 2;
        assertEquals(expected, real);
    }
    @Test
    public void test2() {
        List<List<Integer>> data = Arrays.asList(
                Arrays.asList(11, 2, 4),
                Arrays.asList(4, 5, 6),
                Arrays.asList(10, 8, -12)
        );
    }
}
