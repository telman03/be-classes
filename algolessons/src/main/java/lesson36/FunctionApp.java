package lesson36;

import java.util.function.Function;

public class FunctionApp {

    /**
    public static int divUnsafe(int a, int b){
        return a/b;
    }

    public static int toInt(String s){
        return Integer.parseInt(s);
    }
    */


    public static void main(String[] args) {

        Function<String, Integer> conv_unsafe = Integer::parseInt;

        System.out.println(conv_unsafe.apply("5"));
        System.out.println(conv_unsafe.apply("5x"));

    }
}

