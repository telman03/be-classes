package org.example;

public class Interval {
    public final int low;
    public final int hi;

    public Interval(int low, int hi) {
        this.low = low;
        this.hi = hi;
    }

    public static Interval of(int a, int b){
        return new Interval(a, b);
    }
}
