package org.example;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CharacterPositions {

    /**
     * "Hello, my dear friend, please keep learning, I'll guarantee you'll reach the moment you understand everything"
     *
     * e:16:<2,12,19,26,29,32,33,37,58,59,69,76,81,92,100,102>
     * l:8:<3,4,25,36,48,49,65,66>
     * n:8:<20,40,42,56,82,90,97,108>
     * r:7:<14,17,39,54,68,93,103>
     * a:7:<13,27,38,53,55,70,96>
     * t:5:<57,74,83,95,105>
     * i:4:<18,41,46,107>
     * h:4:<1,72,75,106>
     * u:4:<52,63,87,89>
     * d:4:<11,21,91,98>
     * y:4:<9,61,85,104>
     * o:4:<5,62,79,86>
     * g:3:<43,51,109>
     * m:3:<8,78,80>
     * s:2:<28,94>
     * p:2:<24,34>
     * k:1:<31>
     * f:1:<16>
     * c:1:<71>
     * v:1:<101>
     */


    public static void main0(String[] args) {
        String line = "Hello, my dear friend, please keep learning, " +
                "I'll guarantee you'll reach the moment you understand everything";

        List<String> collect = line.chars()
                .mapToObj(x->""+(char) x)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
    public static void main1(String[] args) {
        String line = "Hello, my dear friend, please keep learning, " +
                "I'll guarantee you'll reach the moment you understand everything";

        List<Integer> collect = IntStream.range(0, line.length())
                .boxed()
                .collect(Collectors.toList());

        System.out.println(collect);
    }
    public static void main(String[] args) {
        String line = "Hello, my dear friend, please keep learning, " +
                "I'll guarantee you'll reach the moment you understand everything";

        Stream<Pair<Character, Integer>> pairs = IntStream.range(0, line.length())
                .mapToObj(idx -> Pair.of(line.charAt(idx), idx));
        System.out.println(pairs);
    }
}


