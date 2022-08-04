package task;
/**
 *
 *
 *
 *
 * */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ListFiltering {

    public static List<Integer> filterNegative(List<Integer> data){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            int x = data.get(i);
            if(x < 0) result.add(x);
        }
        return result;
    }
    public static List<Integer> filterPositive(List<Integer> data){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            int x = data.get(i);
            if(x > 0) result.add(x);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(1, 2, 3, -4, 7, -9, 0, -14);
        System.out.println(filterNegative(data));
        System.out.println(filterPositive(data));
    }
}
