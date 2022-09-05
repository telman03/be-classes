package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

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
        HashSet<Integer> points = new HashSet<>();
        data.forEach(x->{points.add(x.low); points.add(x.hi);});
        System.out.println(points);
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
