package org.example;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterationsApp {
    public static void main(String[] args) {
        List<Integer> as = Arrays.asList(1,2,3);
//        sugar
        for(Integer a: as){
            System.out.println(a);
        }
//        full syntax
        Iterator<Integer> it = as.iterator();
        while(it.hasNext()){
            int x= it.next();
            System.out.println(x);
        }

        MyBlackBox box = new MyBlackBox();
        Iterator<String> it2 = box.iterator();
        while(it2.hasNext()){
            String x= it2.next();
            System.out.println(x);
        }
        for (String month: box){
            System.out.println(month);
        }
    }
}
