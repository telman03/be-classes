package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ChessApproaches {
    public static IntStream Ito8(){
        return IntStream.rangeClosed(1, 8);
    }
    public static void main(String[] args) {
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8"};
        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h"};

        List<Character> letters1 = Ito8()
                .mapToObj(n -> (char) ('a' + n - 1))
                .collect(Collectors.toList());

        List<Integer> numbers1 = Ito8()
                .boxed()
                .collect(Collectors.toList());

        System.out.println(numbers1);
        System.out.println(letters1);
    }
}
