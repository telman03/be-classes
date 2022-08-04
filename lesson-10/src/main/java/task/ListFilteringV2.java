package task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ListFilteringV2 {

    public static List<Integer> filterNegative(List<Integer> data) {
        ArrayList<Integer> result = new ArrayList<>();
        data.forEach(x -> {
            if (x < 0) result.add(x);
        });
        return result;
    }

    public static List<Integer> filterPositive(List<Integer> data) {
        ArrayList<Integer> result = new ArrayList<>();
        data.forEach(x -> {
            if (x > 0) result.add(x);
        });
        return result;
    }

    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(1, 4, -7, -11, 3, 8, -3);
        System.out.println(filterNegative(data));
        System.out.println(filterPositive(data));
    }

}

