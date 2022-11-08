package lesson31;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinToInt {

    public int toInt1(String binary) {
        int outcome = 0;
        for (int i = 0; i < 8; i++) {
            char c = binary.charAt(i); // '0' / '1'
            int bit = Integer.parseInt(c + "");
            outcome += bit * Math.pow(2, 7 - i);
        }
        return outcome;
    }

    public int toInt2(String binary) {
        int outcome = 0;
        for (int i = 0; i < 8; i++) {
            char c = binary.charAt(i); // '0' / '1'
            int bit = Integer.parseInt(c + ""); // 0 or 1
            int val = bit * (1 << (7 - i));
            outcome += val;
        }
        return outcome;
    }

    public int toInt3(String binary) {
        int outcome = 0;
        for (int i = 0; i < 8; i++) {
            int bit = binary.charAt(i) - '0';
            int val = bit * (1 << (7 - i));
            outcome += val;
        }
        return outcome;
    }

    public int toInt4(String binary) {
        return IntStream.range(0, 8)
                .map(i -> {
                    int bit = binary.charAt(i) - '0';
                    return bit * (1 << (7 - i));
                })
                .sum();
    }

    public int toInt(String binary) {
        return IntStream.range(0, 8)
                .map(i -> (binary.charAt(i) - '0') * (1 << (7 - i)))
                .sum();
    }

}

class BinToIntTest {

    private BinToInt bi = new BinToInt();

    @Test
    public void test1() {
        assertEquals(0, bi.toInt("00000000"));
    }

    @Test
    public void test2() {
        assertEquals(1, bi.toInt("00000001"));
    }

    @Test
    public void test3() {
        assertEquals(5, bi.toInt("00000101"));
    }

    @Test
    public void test4() {
        assertEquals(33, bi.toInt("00100001"));
    }

    @Test
    public void test5() {
        assertEquals(255, bi.toInt("11111111"));
    }

}

