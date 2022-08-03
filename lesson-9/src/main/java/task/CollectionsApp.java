package task;

import java.util.ArrayList;

public class CollectionsApp {
    public static void main(String[] args) {
        ArrayList<Integer> as = new ArrayList<Integer>();
        as.add(11);
        as.add(12);
        as.add(2);
        as.add(30);
        as.remove(0);
        as.forEach(x -> System.out.println(x));
        Integer item = as.get(1);
        int item1 = as.get(1);
        int item2 = as.get(1);
        int s = as.size();

        // each type has brother
        int x;
        Integer x1;
        long y;
        Long y1;
    }
}
