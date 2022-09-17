package org.example;

import java.util.*;

public class Stream2 {
    public static int min0(int[] xs) throws NoSuchElementException {
        throw new NoSuchElementException();
    }
    public static Optional<Integer> min1(List<Integer> xs){
        if (xs.isEmpty()){
            Optional.empty();
        }else {
            int m = Integer.MAX_VALUE;
            for(int x: xs){
                m = Math.min(m, x);
            }
            return Optional.of(m);
        }
        return null;
    }

    public static void main0(String[] args) {
        try {
            int i = min0(new int[]{});
        }catch (NoSuchElementException x){
            // ..
        }

        Optional<Integer> r1 = min1(Arrays.asList(1, 3));   // 1
        Optional<Integer> r2 = min1(Arrays.asList());       // empty

    }
    public static Optional<Integer> toInt(String s){
        try{
            int value = Integer.parseInt(s);
            return Optional.of(value);
        }catch (NumberFormatException x){
            return Optional.empty();
        }
    }

    public static void main1(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        Optional<Integer> x = toInt(line);
        Optional<Integer> x2 = x.map(a -> a +1);
        System.out.println(x2);
    }

    public static Optional<String> construct(String s) {
        Optional<String> os = Optional.of(s);
        return os;
    }
    public static void main(String[] args) {
        Optional<String> os = Optional.of("Jim");
        System.out.println(construct("Alex"));
    }
}
