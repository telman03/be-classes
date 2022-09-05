package org.example;

import java.util.*;

/**
 * given: List<Interval>
 *
 *   1 ------------------------ 10
 *   1 ------- 4
 *       2 ----------- 7
 *               5 ---------- 8
 *   1 ---- 3
 *                     7 ---- 8
 *
 * task: spit & count all sub-intervals
 *
 * expected result:
 *
 *  1 -- 2  -> 3
 *  2 -- 3  -> 4
 *  3 -- 4  -> 3
 *  4 -- 5  -> 2
 *  5 -- 7  -> 3
 *  7 -- 8  -> 3
 *  8 -- 10 -> 1
 *
 */

public class IntervalsApp {
    public void count(List<Interval> data){
        HashSet<Integer> unique = new HashSet<>();
        data.forEach(x->{unique.add(x.low); unique.add(x.hi);});
        ArrayList<Integer> points = new ArrayList<>(unique);
//        sorting with a guarantee
        points.sort(Comparator.comparingInt(x ->x));
//        making subIntervals
        ArrayList<Interval> subIntervals = new ArrayList<>();
        for (int i = 0; i < points.size()-1; i++) {
            subIntervals.add(
                Interval.of(points.get(i), points.get(i+1))
            );
        }
        System.out.println(subIntervals);
    }
    public Map<Interval, Integer> count1(List<Interval> data){
        throw new IllegalStateException("not implemented");
    }
    public List<Result> count2(List<Interval> data){
        throw new IllegalStateException("not implemented");
    }
    public static void main(String[] args) {
        List<Interval> data = Arrays.asList(
                Interval.of(1,10),
                Interval.of(1,4),
                Interval.of(2,7),
                Interval.of(1,3),
                Interval.of(7,8),
                Interval.of(5,8)
        );
        IntervalsApp app = new IntervalsApp();
        app.count(data);
    }
}
