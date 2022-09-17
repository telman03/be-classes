package org.example;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

public class Stream2 {
    public int min0(int[] xs) throws NoSuchElementException {
        throw new NoSuchElementException();
    }
    public Optional<Integer> min1(List<Integer> xs){
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
}
